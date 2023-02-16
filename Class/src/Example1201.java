import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example1201 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//use scanner class  for read data from file
		Scanner read = new Scanner(new File("MemberLogin.txt"));
		while(read.hasNext()) {
			String Fname = read.next();// read data1 from file to Fname
			//String lname = read.next(); // read data2 from file to Fname
			read.next();//read data2 from file
			read.next();
			String email = read.next();
			System.out.println(Fname + "("+email+")");
		}
		read.close();

	}

}
