package Day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet(value="/LoginValidate",
initParams=@WebInitParam(name="url",value="jdbc:oracle:thin"))
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		RequestDispatcher rd;
		if(user.equals("admin"))
			rd=request.getRequestDispatcher("Admin");
		else
			rd=request.getRequestDispatcher("User");
		//rd.forward(request, response);
		rd.include(request, response);
		/*if(user.equals("admin"))
			response.sendRedirect("http://www.yahoo.com");
		else
			response.sendRedirect("http://www.facebook.com");*/
		/*ServletContext ctx=getServletContext();
		out.println(ctx.getInitParameter("driverclass"));
		ServletConfig config=getServletConfig();
		out.println(config.getInitParameter("url"));*/
			
		
		out.println("Completed....");
		
	}

}
