import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
/*Name: M.W.F Junaid 
    Roll No: 1602-17-737-020
    */
public class RollServletControl {
	private RollServletView view;
	private RollServletModel model;
	
	public RollServletControl(RollServletModel model,RollServletView view)
	{
		this.model=model;
		this.view=view;
	}
    public void updateDept()
	{
		model.detDept();
	}
	
	public void showView() throws IOException
	{
		String rollNo= model.getRollNo();
		String dept=model.getDept();
		view.display(rollNo, dept);
	}
}