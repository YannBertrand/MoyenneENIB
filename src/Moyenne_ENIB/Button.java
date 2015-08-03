package Moyenne_ENIB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Yann
 *
 */
public class Button extends JButton implements ActionListener {
	private Application app;
	private static final long serialVersionUID = 1L;
	
	public Button(Application app, String str) {
		super(str);
		setApp(app);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent click) {
		System.out.println("Clic sur " + getText());
		SemesterPanel panel = new SemesterPanel(getText());
		
		getApp().setSemesterPanel(panel);
		getApp().setContainer(getApp().getSemesterPanel());
	}

	/**
	 * @return the app
	 */
	private Application getApp() {
		return app;
	}

	/**
	 * @param app the app to set
	 */
	private void setApp(Application app) {
		this.app = app;
	}
}
