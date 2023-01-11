import javax.swing.*;

public class App extends JFrame {
	protected JFrame exFrame;
	protected JPanel mainPanel;
	protected JButton signIn ,signUp;
	protected String name;

	protected void addComponents() {
		exFrame = new JFrame("Delicious Smell Delivery" );
		mainPanel = new JPanel();
		signIn = new JButton("Sign In");
		signUp = new JButton("Sign Up");
		mainPanel.add(signIn);
		mainPanel.add(signUp);
		exFrame.add(mainPanel);
	}
	
	protected void setFrame() {
		exFrame.pack();
		exFrame.setLocationRelativeTo(null);
		exFrame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void createAndShowGUI() {
		App main=new App();
		main.addComponents();
		main.setFrame();
	}
	public static void main (String[]args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
