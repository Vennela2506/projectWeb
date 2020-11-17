package Day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.println("<h2>Welcome Administrator!");
		out. println("<A HREF='Login.html'>return to home page</A>");
		//out. println("<A HREF=\"http:localhost:8080/CapgWeb/Login.html/*>link</A>");
		
		/*ServletContext ctx=getServletContext();
		out.println(ctx.getInitParameter("driverclass"));
		ServletConfig config=getServletConfig();
		out.println(config.getInitParameter("url"));*/
	}

}
