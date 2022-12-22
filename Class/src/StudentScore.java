import java.util.*;
public class StudentScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many student in clasroom : ");
		student[] students = new student[scanner.nextInt()];
		System.out.println();

		for (int i = 0; i < students.length; i++) {

			students[i] = new student();

			System.out.print("Input student name : ");
			students[i].setName(scanner.next());

			System.out.print("Input student score : ");
			students[i].Setscore(scanner.nextInt());

			while (!students[i].Checkscore()) {
				System.out.print("Input score, again : ");
				students[i].Setscore(scanner.nextInt());
			}

			System.out.println("--------------------------------");
		}

		for (student student : students)
			if (student.isPass()) 
				System.out.println(">> " + student.Getname() + " get grade " + student.findGrade());

	}

	}


