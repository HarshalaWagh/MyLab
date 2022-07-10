package SirQuestionsString;

public class ReverseNumber {
public static void main(String[] args) {
	
} {
/* int num = 678, rev=0;
 
 
 while(num!=0)
 {
rev=rev*10 + num%10;
num=num/10;
}
 System.out.println(rev);
 }*/
	  int num = 34560;
      String str = Integer.toString(num);
      System.out.print("Reverse is:");
      for(int i=str.length()-1;i>=0;i--){
          System.out.print(str.charAt(i));
      }
   }
}
		//Using StringBuffer
		 /*StringBuffer rev;
		 int num=12390;
		 StringBuffer SB=new StringBuffer(String.valueOf(num));
		System.out.println(SB);
		rev=SB.reverse();
		System.out.println(rev);*/
		
		//Using StrinBuilder
		/*int num=1345;
		StringBuilder SB=new StringBuilder();
		SB.append(num);
		SB.reverse();
		System.out.println(SB);*/
		
	

	