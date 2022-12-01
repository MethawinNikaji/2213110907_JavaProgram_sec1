import javax.swing.*;
import java.text.*;
public class Lab301 {
	static final int pricePerson = 299;
	public static void main(String[] args) {
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = pricePerson * numberofCustomer;
		int memberCard = JOptionPane.showConfirmDialog(null,
				"Total price is "+totalPrice+"Baht."+
				"\nDo you have a member card ?");
		double totalPricewithdiscount;
		if(memberCard==0) {
			totalPricewithdiscount = totalPrice*90/100;//totalPrice+(totalPrice*10/100)
			JOptionPane.showMessageDialog(null,"Amount to be paid is"
					+totalPricewithdiscount+"Baht.");
				
			}
		else if(memberCard==1) {
			JOptionPane.showMessageDialog(null,"Amount to be paid is"
					+totalPrice+"Baht.");
		}

	}

}
