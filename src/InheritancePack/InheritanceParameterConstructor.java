package InheritancePack;

public class InheritanceParameterConstructor {//1st class
	public void T1() {
		System.out.println("I am child method");
	}
	InheritanceParameterConstructor(String s) //class1 parameterised constructor
	{
        System.out.println(s);
    }

    public static void main(String[] args) {
    	InheritanceParameterConstructor obj=new InheritanceParameterConstructor("Divya");
	    obj.T1();
    }
    }


