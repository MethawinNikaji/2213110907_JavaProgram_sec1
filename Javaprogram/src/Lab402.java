import java.util.*;
public class Lab402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = sc.nextLine();
		
		
		while(!sentence.endsWith(".")){
			System.out.print("The sentence must end with stop point : ");
			 sentence = sc.nextLine();
		}
		System.out.println();
		
		int Itnum = 0;
		
		String formatSentence = sentence.replace(".","");
		
		
		for(int i =0;i<formatSentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				System.out.println(formatSentence.substring(Itnum,i));
				Itnum=i+1;
			}
			
			
		}

	}

}