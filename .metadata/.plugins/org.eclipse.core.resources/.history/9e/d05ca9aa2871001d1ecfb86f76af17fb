import javax.swing.*;
public class Example {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input full name:");
		int birthyear = Integer.parseInt(JOptionPane.showInputDialog("input birth year :"));
		while(birthyear<=1980 || birthyear>2018) {
			birthyear = Integer.parseInt(JOptionPane.showInputDialog("input birth year :"));
		}
		int gender =JOptionPane.showConfirmDialog(null,
				"Are you Female?",
				"Gender",
				JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null,
				"Full name: " +name+
				"\nBirth year: "+birthyear+
				"\nYou're"+(gender==0?"female":"Male"));
		

	}

}
