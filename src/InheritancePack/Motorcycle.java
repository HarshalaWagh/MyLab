package InheritancePack;

	class Motorcycle extends InheritanceParameterConstructor //2nd class extend 1st class
	{
	    Motorcycle(String s,String y) //2nd class constructor
	    {
	        super("Umika1");
	        System.out.println(s+""+y);
	    }
	        public void T1() {
	    		System.out.println("I am overrided");
	    	}
	        public static void main(String arrgs[]) {
	        	Motorcycle machine=new Motorcycle("Tina","Yuva");
	        	machine.T1();
	        }
	        
	    }



