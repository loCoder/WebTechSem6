import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
/*Name: M.W.F Junaid 
    Roll No: 1602-17-737-020
    */
public class RollServletModel {
    private String rollNo;
	private String dept;
    
    public RollServletModel(String rollNo)
    {
        this.rollNo=rollNo;
    }
    
    public String getRollNo()
    {
        return rollNo;
    }
    
    public void setRollNo(String rollNo)  
    { 
        this.rollNo = rollNo; 
    }
	
	public String getDept()
    {
        return dept;
    }
    
    public void setDept(String rollNo)  
    { 
        this.dept = dept; 
    }
	
	public void detDept()
	{
		StringTokenizer st = new StringTokenizer(rollNo,"-");
		int i=0;
		int deptCode=0;
		while(i<3)
		{
			deptCode=Integer.parseInt(st.nextToken());
			i++;
		}
		
		switch(deptCode)
		{
			case 733:dept="CSE";break;
			case 734:dept="EEE";break;
			case 735:dept="ECE";break;
			case 736:dept="Mech";break;
			case 737:dept="IT";break;
			case 732:dept="Civil";break;
			default: dept="Invalid";
		}	
	}
	
}