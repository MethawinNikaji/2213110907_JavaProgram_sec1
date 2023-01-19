import java.util.Scanner;

public class Bookdemo {

	public static void main(String[] args) {
		book book = new book();

		Scanner scan = new Scanner(System.in);

		System.out.print("Input book title\t: ");
		book.setTitle(scan.nextLine());

		System.out.print("Input book price\t: ");
		book.setPrice(scan.nextFloat());

		System.out.print("Input book publish year\t: ");
		book.setPublishyear(scan.nextInt());

		System.out.println();
		System.out.println(book);

	}

}