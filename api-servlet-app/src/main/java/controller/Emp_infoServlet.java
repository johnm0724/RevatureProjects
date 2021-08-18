package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.model.Emp_info;
import common.util.AppConstants;
import common.util.HttpUtil;
import manager.Emp_infoManager;

@WebServlet("/emp_info/*")
public class Emp_infoServlet extends HttpServlet {

	private Emp_infoManager manager = new Emp_infoManager();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String jsonInString = null;
		ObjectMapper mapper = new ObjectMapper();

		String[] pathVariables = HttpUtil.getPathVariables(req);
		
		if(pathVariables == null || pathVariables.length == 0) {
			//get data from back-end
			List<Emp_info> emp_info = manager.findAll();
			//transform java object to JSON string
			jsonInString = mapper.writeValueAsString(emp_info);
		} 
		// GET /employee info/:id
		// fetch individual employee info item
		if(pathVariables != null && pathVariables.length == 2) {
			//get data from back-end
			int id = Integer.parseInt(pathVariables[1]);
			Emp_info emp_info = manager.findById(id);
			//transform java object to JSON string
			if(emp_info != null)
				jsonInString = mapper.writeValueAsString(emp_info);
			else
				jsonInString = HttpUtil.getErrorMessage("No Record Found");
		}
		
		//send success response to client
		resp.getWriter().print(jsonInString);
		resp.setContentType(AppConstants.HTTP_JSON_CONTENT);
		resp.setStatus(AppConstants.HTTP_OK);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			//get JSON data from HTTP body
			ObjectMapper mapper = new ObjectMapper();
			Emp_info emp_info = mapper.readValue(HttpUtil.getJSONData(req), Emp_info.class);
			//persist data to back-end
			manager.create(emp_info);
			//send success response to client
			String jsonResponse = mapper.writeValueAsString(emp_info);
			resp.getWriter().print(jsonResponse);
			resp.setStatus(AppConstants.HTTP_OK);
		} catch (Exception e) {
			//send failure response to client
			resp.getWriter().print(HttpUtil.getErrorMessage(e.getMessage()));
			resp.setStatus(AppConstants.HTTP_ERROR);
		}

		resp.setContentType(AppConstants.HTTP_JSON_CONTENT);

	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] pathVariables = HttpUtil.getPathVariables(req);
		// GET /employee/:id
		// fetch individual employee item
		if(pathVariables != null && pathVariables.length == 2) {
			//get data from back-end
			int id = Integer.parseInt(pathVariables[1]);
			manager.delete(id);
			resp.setStatus(AppConstants.HTTP_OK);
		}
	}
}
