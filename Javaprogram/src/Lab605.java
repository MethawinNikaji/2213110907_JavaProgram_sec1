import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
	
		int[]number = new int[5];
		for(int i=0;i<number.length;i++) {
		number[i]=Integer. parseInt(JOptionPane.showInputDialog("Input number"+(i+1)+": "));
		}	
	    showOdd(number);
		showEven(number);
	}
	
	private static void showEven(int[]list) {
		String EvenMsg ="";
		for(int even : list) {
			if(even%2 !=0) {
				EvenMsg = EvenMsg + even + " ";
				JOptionPane.showMessageDialog(null,"List of odd number: \n"+EvenMsg,"Messange",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		}
		private static void showOdd(int[]list) {
			String OddMsg ="";
			for (int odd : list){
				if(odd%2 ==0) {
					OddMsg = OddMsg + odd + " ";
					JOptionPane.showMessageDialog(null,"List of even number: \n"+OddMsg,"Messange",
							JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		}
	

}
