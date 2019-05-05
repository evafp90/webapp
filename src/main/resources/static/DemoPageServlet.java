import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class DemoPageServlet
 */
@WebServlet(description = "Demo Page Servlet", urlPatterns = { "/DemoPageServlet" , "/DemoPageServlet.do"}, initParams = {@WebInitParam(name="id",value="1"),@WebInitParam(name="name",value="pankaj")})
public class DemoPageServlet extends HttpServlet {
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {      
			// Set response content type
			response.setContentType("text/html");
	  
			PrintWriter out = response.getWriter();
			String title = "Idneo Demo";
			String docType =
			   "<!doctype html public \"-//w3c//dtd html 4.0 " +
			   "transitional//en\">\n";
			   
			out.println(docType +
			   "<html>\n" +
				  "<head><title>" + title + "</title></head>\n" +
				  "<link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\n" +
				  "<body>\n" +
					 "<div id=\"header\"><img src=\"img/idneo_logo_ok_blanco.png\" alt=\"IDNEO\" /> /div>\n" +
					 "<div><h2>Welcome" + request.getParameter("first_name") + " " + request.getParameter("last_name")+ "</h2>\n" +
				  "</body>" +
			   "</html>"
			);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}