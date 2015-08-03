/**
 * 
 */
package Moyenne_ENIB;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author Yann
 *
 */
public class Application {
	private JFrame frame;
	private JPanel container;
	private SemesterPanel semester_panel;
	
	public Application() {
		initFrame("Calcul des moyennes ENIB (2013-P)");
		initContainer();
	}
	
	public void run() { }
	
	/*
	 * Initialise la JFrame
	 * @param titre de la frame
	 */
	private void initFrame(String title) {
		JFrame frame = new JFrame(title);
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		frame.add(new JPanel(), BorderLayout.NORTH);
		frame.add(new JPanel(), BorderLayout.WEST);
		frame.add(new JPanel(), BorderLayout.EAST);
		frame.add(new JPanel(), BorderLayout.SOUTH);
		
		setFrame(frame);
	}
	
	private void initContainer() {
		JPanel container = new JPanel();
		container.setLayout(new BorderLayout());
		
		container.add(new JLabel("Choix du semestre :"), BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		
		panel.add(new Button(this, "S1"));
		panel.add(new Button(this, "S2"));
		panel.add(new Button(this, "S3"));
		panel.add(new Button(this, "S4"));
		panel.add(new Button(this, "S5"));
		panel.add(new Button(this, "S6"));
		
		container.add(panel, BorderLayout.CENTER);
		
		getFrame().add(container, BorderLayout.CENTER);
		
		setContainer(container);
	}
	
	/**
	 * @return the frame
	 */
	private JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	private void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * @return the container
	 */
	public JPanel getContainer() {
		return container;
	}

	/**
	 * @param container the container to set
	 */
	public void setContainer(JPanel container) {
		this.container = container;
		getFrame().getContentPane().removeAll();
		JScrollPane scroll = new JScrollPane(container);
		scroll.getVerticalScrollBar().setUnitIncrement(16);
		getFrame().getContentPane().add(scroll);
		getFrame().validate();
	}

	/**
	 * @return the semester_panel
	 */
	public SemesterPanel getSemesterPanel() {
		return semester_panel;
	}

	/**
	 * @param semester_panel the semester_panel to set
	 */
	public void setSemesterPanel(SemesterPanel semester_panel) {
		this.semester_panel = semester_panel;
	}
}
