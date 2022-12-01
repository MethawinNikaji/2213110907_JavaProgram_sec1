import java.util.*;
public class Example_401 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String InputText ="";
		String wordtoDisplay ="";
		while(true){
			System.out.print("Enter word");
			String word = sc.next();
			if(InputText.equalsIgnoreCase("stop")) {
				break;
			}
			wordtoDisplay = wordtoDisplay+InputText+" ";//wordtoDisplay +=InputText+" ";
		}
		System.out.println(wordtoDisplay.toUpperCase());

	}

}
