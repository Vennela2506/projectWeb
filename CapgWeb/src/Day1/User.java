package Day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		out.println("<h2>Welcome "+user+" your password is "+pass+"</h2>");
		out. println("<A HREF='Login.html'>return to home page</A>");
		//response.sendRedirect("http://localhost:8080/CapgWeb/Login.html");

		
	}

}
