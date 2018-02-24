/*
 * Alisson Leiva Salazar
 */
import javax.swing.JOptionPane;

public class MainCookie {
	public static void main(String[] args) {
		
		String var=JOptionPane.showInputDialog("Input:");
		
		CookieCutter<String> cookie= new CookieCutter<String>(var);
		
		JOptionPane.showMessageDialog(null,"Data Type: "
				+cookie.getClass()
				+"\n Output: "
				+var);
	}
}
