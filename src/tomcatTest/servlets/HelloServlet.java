package tomcatTest.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;

@WebServlet ("/hello")
public class HelloServlet extends HttpServlet
	{

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
		{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("hi there!");
		}

	}
