import java.util.*;
public class Lab55 {

	public static void main(String[] args) {
		inputStudent();
	}
	public static void inputStudent() {
		Scanner sc = new Scanner(System.in);
		String id = "";
		String subid = "";
		while(isLength(id,subid))
		{
			System.out.print("Enter Student: ");
			id = sc.nextLine();
			System.out.print("Enter Subject: ");
			subid = sc.nextLine();
		}
	}
	public static boolean isLength(String item1,String item2) {
		if(item1.length()==10 && item2.length() == 7) {
		return true;	
		}
		return false;

	}

		

}
