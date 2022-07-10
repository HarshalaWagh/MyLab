package Sandesh;

public class EmpInfo {
	int empID;
	String empName;
	int empSalary;
    long empMobileno;
    /*public void setdata(int id,String name,int salary,long mobileno)//Method which takes some parameters
    {
    	id=empID;
	name= empName;
	salary= empSalary;
	mobileno= empMobileno;
	}*/
    	
  
	/*public EmpInfo(int id,String name,int salary,long mobileno)//constructor
	{
		id=empID;
    	name= empName;
    	salary= empSalary;
    	mobileno= empMobileno;
	}*/
	public void display()//Mathod which not take some parameters
	{ 
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(empMobileno);
		
	}

	public static void main(String args[])
	{ 
		//Assigning values to class variables using method
		/* emp1=new EmpInfo();
		emp1.setdata(10,"Tina",2000,9845267);
		emp1.display();*/
		
		
		//Assigning values to class variables using constructor
		
		/*EmpInfo emp1=new EmpInfo(1024,"Raut",1000,624839);
		emp1.display();
		EmpInfo emp2=new EmpInfo(10,"Tina",4000,974839);
		emp2.display();*/
		
		//Assigning values to class variables using Objects
		EmpInfo emp1=new EmpInfo();
		emp1.empID=109;
		emp1.empName="Suny";
		emp1.empSalary=1000;
	    emp1.empMobileno=8142549;
	    emp1.display();
		
		
	}
	

}
