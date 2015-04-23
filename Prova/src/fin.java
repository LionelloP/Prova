import javax.swing.*;


public class fin extends JFrame {
	
	ImageIcon n=new ImageIcon("Imm.jpg");
	JButton b=new JButton();
	
	public fin(){
		this.add(b);
		b.setIcon(n);
		this.setVisible(true);
		this.setSize(500,600);
	}
}
