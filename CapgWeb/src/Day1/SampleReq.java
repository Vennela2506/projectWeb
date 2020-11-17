package Day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleReq
 */
@WebServlet("/SampleReq")
public class SampleReq extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*PrintWriter out=response.getWriter();
		String empname=request.getParameter("empname");
		double salary=Double.parseDouble(request.getParameter("salary"));
		out.println("Welcome "+empname+" your salary is "+salary);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String empname=request.getParameter("empname");
		double salary=Double.parseDouble(request.getParameter("salary"));
		out.println("Welcome "+empname+" your salary is "+salary);
		doGet(request, response);
	}

}
