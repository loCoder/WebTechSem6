import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
/*Name: M.W.F Junaid 
    Roll No: 1602-17-737-020
    */
public class RollServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request, 
                        HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        String rollNo = request.getParameter("rollNo");
        RollServletModel model = new RollServletModel(rollNo);
        RollServletView view = new RollServletView(response);
        RollServletControl control= new RollServletControl(model,view);
		control.updateDept();
        control.showView();
    }
}