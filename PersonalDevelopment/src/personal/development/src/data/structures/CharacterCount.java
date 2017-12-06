package personal.development.src.data.structures;

public class CharacterCount {

	/**
	 * count of i 
	 */
	
	public static void main(String[] args) {
		
		String str = "fyiudsdsfiijcd";
		char[] charArr = str.toCharArray();
		
		for (char c : charArr) {
			if(c == 'i')
			{
				System.out.println("HI");
			}
		}
	}
	
}
