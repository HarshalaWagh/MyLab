package SirQuestionsString;

public class FindOutDuplicatesInArray {
	 public static void main(String []args){
			int c[]=new int[]{20,12,43,20,12,12,12,20};
			int count;
			System.out.println("Duplicate no are: ");
			
			for(int i=0;i<c.length;i++){
			    count=1;{
			        for(int j=i+1;j<c.length;j++){
			            if(c[i]==c[j]&&c[i]!=' '){
			                count++;
			                c[j]='0';
			            }
			        }if(count>1&&c[i]!='0')
			        	
			        {
			            System.out.println(c[i] +" "+count);
			        }
			    }
			}
	}
}
