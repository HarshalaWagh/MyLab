package InheritancePack;

public class InheritanceUsingSuperThis extends ParentClass {

	InheritanceUsingSuperThis(int x, int y) {
		super(45, 48);
		System.out.println("Äddition is" +(x+y));
		
	}
	public static void main(String[] args) {
		InheritanceUsingSuperThis obj=new InheritanceUsingSuperThis(38,96);
	}
	

}
