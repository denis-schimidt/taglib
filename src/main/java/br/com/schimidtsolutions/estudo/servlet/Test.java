package br.com.schimidtsolutions.estudo.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.schimidtsolutions.estudo.dto.AlertMessage;

@WebServlet( urlPatterns={"/Test"},initParams = { 
		@WebInitParam(name = "configPath", value = "messages.properties")
})
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<AlertMessage> list = Arrays.asList( new AlertMessage( "erro1", null), new AlertMessage( "erro2", "link2"), new AlertMessage( "erro3", "link3") );
		
		request.setAttribute( "messageList", list );
		
		RequestDispatcher dispatcher = request.getRequestDispatcher( "test.jsp" );
		
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
