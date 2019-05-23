package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame chonk = new JFrame("Guestbook");
	JPanel chank = new JPanel();
	JButton chunk = new JButton();
	JButton chenk = new JButton();
	ArrayList<String> guests = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook bestBook = new GuestBook();
		bestBook.clunk();
	}
	void clunk() {
		chonk.setVisible(true);
		chonk.setDefaultCloseOperation(chonk.EXIT_ON_CLOSE);
		chonk.add(chank);
		chank.add(chunk);
		chank.add(chenk);
		chunk.setText("Add Name");
		chunk.addActionListener(this);
		chenk.setText("View Names");
		chenk.addActionListener(this);
		chonk.pack();
		guests.add("Bob Banders");
		guests.add("Sandy Summers");
		guests.add("Greg Ganders");
		guests.add("Danny Doners");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton check = (JButton) e.getSource();
		if(check == chunk) {
			guests.add(JOptionPane.showInputDialog("Please enter a name."));	
		}else if(check == chenk) {
			String list = "";
			for(int i = 0;i<guests.size();i++) {
				list += "Guest #" + (i+1) + ": " + guests.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, list);
		}
	}
}
