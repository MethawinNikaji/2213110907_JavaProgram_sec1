import java.util.*;
public class Teststudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student[] std = new student[3];
		for(int i=0;i<std.length;i++) {
			std[i]= new student();
			System.out.print("INPUT INFORMATON OF STUDENT "+(i+1));
			System.out.print("Input student name: ");
			std[i].setName(sc.next());
			System.out.print("Input student score: ");
			std[i].Setscore(sc.nextInt());
			while(!std[i].Checkscore()) {
				System.out.print("Input student score: ");
				std[i].Setscore(sc.nextInt());
			}
			System.out.println();
			System.out.println("LIST OF PASS STUDENT(>=50)");
			System.out.println("=================================================");
			for(int j=0;j<std.length;j++) {
				if(std[j].isPass()) {
					System.out.println(">> "+std[j].Getname()+" "
							+" ("+std[j].Getscore()+" )");
					{
				
			public String Findgrade(int score) {
				
				if (score < 50)
					return "F";
				else if (score < 55)
					return "D";
				else if (score < 60)
					return "D+";
				else if (score < 65)
					return "C";
				else if (score < 70)
					return "C+";
				else if (score < 75)
					return "B";
				else if (score < 80)
					return "B+";
				else
					return "A";
			}
				
			{
			

	}

		

}

}