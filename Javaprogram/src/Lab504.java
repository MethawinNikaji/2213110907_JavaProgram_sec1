import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner ibk = new Scanner(System.in);
		System.out.println("Please enter your name , seperated by a space.\n :");
		String fullname = ibk.nextLine();
		
		System.out.println(abbreviatName(fullname) + "." + fullname.substring(0,fullname.indexOf(" ")));
	}
	private static String abbreviatName(String fullname) {
		String[] space = fullname.split(" ");
		
		return space[space.length-2].toUpperCase().charAt(0) + "."+ space[space.length-1].toUpperCase().charAt(0);
	
	}

}
