package menu;
import java.awt.Font;
import javax.swing.JLabel;

public class NuestroLabel extends JLabel{
	
	private static final long serialVersionUID = 1L;
	public NuestroLabel() {}
	public NuestroLabel(String txt){
	      super(txt);
	      this.setFont(new Font("Arial", Font.BOLD, 20));
	   }

	
} 
