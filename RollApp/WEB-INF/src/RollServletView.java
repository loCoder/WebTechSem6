import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
/*Name: M.W.F Junaid 
    Roll No: 1602-17-737-020
    */
public class RollServletView {
	
	HttpServletResponse response;
	
    public RollServletView(HttpServletResponse response)
	{
		this.response = response;
	}
	
    public void display(String rollNo, String dept) throws IOException{
        PrintWriter out = response.getWriter();
        out.println("<html>" +
                    "<head><title> Greetings...</title></head>" +
                    "<body>"+
                    "<h1> Welcome " + rollNo +".. \n Your department is " + 
                    dept+ "</h1>" + 
                    "</body>"+
                    "</html>");
    }
}