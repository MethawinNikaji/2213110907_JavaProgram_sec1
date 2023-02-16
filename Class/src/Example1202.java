import java.util.Scanner;
import java.io.*;

public class Example1202 {
	static Scanner input = new Scanner(System.in);// define object for input data from keyboard
	public static void main(String[] args) throws IOException {
		System.out.print("Input Section :");
		int section =input.nextInt();
		Header(section);
		showListStudent(section);
	}
	public static void showListStudent(int sec ) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp ="";
		while((temp = read.readLine())!=null) {
			String[] data = temp.split("\t");
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			String Resultgrade = findResult(midtermScore,finalScore);
			if(Integer.parseInt(data[3])==sec) {
				System.out.print(data[0]+""+data[2]+"\t"+midtermScore+"\t"+
			finalScore+"\t"+Resultgrade);
			}
		}
	}
	private static String findResult(double midtermScore, double finalScore) {
		double totalScore = midtermScore+finalScore;
		if(totalScore<=40) return "FAIL";
		else return "PASS";
	}
	public static void Header (int sec) {
		System.out.print("********************************************************");
		System.out.print("\t\tList of Data for Section"+sec);
	}
	

}
