import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubStringAnagramSearch {
	public static void main(String args[])throws Exception{             
	    InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    System.out.println("Enter number of times you want to check.");
	    int t =Integer.parseInt(br.readLine());
	    while(t-- > 0) {
	    	System.out.println("Enter the Text.");    
		    String text=br.readLine();    
		    System.out.println("Enter the Pattern.");
		    String pattern = br.readLine();
		    int textLength = text.length();
			int patternLength = pattern.length();
			boolean isMatch = false;
			if(textLength < patternLength | patternLength == 0 |
					textLength == 0){
				System.out.println(false);
			}
			int textCount[] = new int[256];
			int patternCount[] = new int[256];
			int i = 0;
			for (i = 0; i < patternLength; i++)
		    {			
				patternCount[pattern.charAt(i)]++;
				textCount[text.charAt(i)]++;			
		    }		
			while(i<textLength) {
				if(isAnagram(textCount, patternCount)){
					isMatch = true;
					break;
				}
				i++;
			}
			System.out.println(isMatch);
	    }
	}
	
	private static boolean isAnagram(int[] textCount,int[] patternCount) {
		for(int i = 0; i < textCount.length; i++){
			if(textCount[i] != patternCount[i]){
				return false;
			}
		}
		return true;
	}
}
