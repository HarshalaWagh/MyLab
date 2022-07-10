package SirQuestionsString;

public class FindOutDuplicatesString3 {
	  public static void main(String []args){
			String s=" hhh asyidn hcosn snsskk";
			char c[]=s.toCharArray();
			int count;
			System.out.println("Duplicate chars are: ");
			
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
