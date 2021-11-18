package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExample2
 */
@WebServlet("/ServletExample2")
public class ServletExample2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Cookie cookies[]=request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String userName=request.getParameter("userName");
		printWriter.print("User "+userName);
		response.sendRedirect("ShowDetails.jsp?userName="+userName);
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
