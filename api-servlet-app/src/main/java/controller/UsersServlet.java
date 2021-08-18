package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.model.LoginInfo;
import common.util.AppConstants;
import common.util.HttpUtil;
import manager.LoginInfoManager;


@WebServlet("/users/*")
public class UsersServlet extends HttpServlet {

	private LoginInfoManager manager = new LoginInfoManager();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			//get JSON data from HTTP body
			ObjectMapper mapper = new ObjectMapper();
			LoginInfo loginInfo = mapper.readValue(HttpUtil.getJSONData(req), LoginInfo.class);
			boolean success = manager.login(loginInfo.getUsername(), loginInfo.getPassword());
			
			//send success response to client
			String jsonResponse = mapper.writeValueAsString(loginInfo );
			resp.getWriter().print(jsonResponse );
			resp.setStatus(AppConstants.HTTP_OK);
		} catch (Exception e) {
			//send failure response to client
			resp.getWriter().print(HttpUtil.getErrorMessage(e.getMessage()));
			resp.setStatus(AppConstants.HTTP_ERROR);
		}

		resp.setContentType(AppConstants.HTTP_JSON_CONTENT);

	}
	
	
}