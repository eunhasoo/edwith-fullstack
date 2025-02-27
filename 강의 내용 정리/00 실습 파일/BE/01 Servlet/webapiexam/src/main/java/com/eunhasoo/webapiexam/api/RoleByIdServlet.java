package com.eunhasoo.webapiexam.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eunhasoo.jdbcexam.dao.RoleDao;
import com.eunhasoo.jdbcexam.dto.Role;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/roles/*")
public class RoleByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RoleByIdServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		String pathInfo = request.getPathInfo(); // /roles/{roleId}
		String[] pathParts = pathInfo.split("/"); // /[0]"roles"/[1]"roleId"
		int roleId = Integer.parseInt(pathParts[1]);
		
		RoleDao dao = new RoleDao();
		Role role = dao.getRole(roleId);
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(role);
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println(json);
		printWriter.close();
	}

}
