import javax.swing.JOptionPane;
//-----small gui program----//
public class Main {
    public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Enter your name");
	JOptionPane.showMessageDialog(null, "hello" + name);
}
}
