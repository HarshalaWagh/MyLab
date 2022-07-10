package Sandesh;
class Bank{
	public int getRateofInterest()
	{
	return 0;
    }
}
	class SBI extends Bank{
		public int getRateofInterest()
		{
		return 5;
	    }
	}
		class CBI extends Bank{
			public int getRateofInterest()
			{
			return 10;
		}
		}
			class AXIS extends Bank{
				public int getRateofInterest()
				{
				return 12;
			}
			}
public class Overriding {
	

		public static void main(String args[]) {
			SBI obj=new SBI();
			System.out.println(obj.getRateofInterest());
		}
	
	}

