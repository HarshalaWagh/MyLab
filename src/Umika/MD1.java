package Umika;

public class MD1 {
public void velocity()
{

	MD.poonam();//to call non static we use classname
	System.out.println("This is a method");
}
public static void main(String args[])
{ 
	MD1 obj2=new MD1();//create object for velocty non static method
	obj2.velocity();
	MD obj3=new MD();
	obj3.pooja();

}
}
