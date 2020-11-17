package Day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		RequestDispatcher rd=null;
		if((user.equals("")) && (pass.equals(""))) {
			out.println("Username aand password should not be empty");
			rd.forward(request, response);
		rd=request.getRequestDispatcher("Login.html");
		}
		
		else if((user.equals("admin")) && (pass.equals("admin"))) {
			rd=request.getRequestDispatcher("Admin");
		rd.include(request, response);
		}
		else {
			rd=request.getRequestDispatcher("User");
		rd.include(request, response);
		}
		//rd.forward(request, response);
		//rd.include(request, response);
		//response.sendRedirect("http://localhost:8080/CapgWeb/Login.html");
		out.println("Completed....");
		
	}

}
