import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]numberofInteger = {78, 36, 58, 41, 25, 92,75};
		
		System.out.print("input index of array : ");
		int Indexofarray = sc.nextInt();
		
		while(Indexofarray<0||Indexofarray>(numberofInteger.length-1)) {
			System.out.print("Input index of array Again : ");
			Indexofarray =sc.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is"+(numberofInteger[Indexofarray]));
		if(Indexofarray==6) {
			System.out.println("Sorry "+ Indexofarray+"Is the last index of array");
		}
		else {
			System.out.println("Value in next index is "+(numberofInteger[Indexofarray+ 1]));
		}

	}

}
