package Moyenne_ENIB;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFormattedTextField;

public class FormeListener implements KeyListener {
	private Integer id;
	private JFormattedTextField coeff_forme;
	private JFormattedTextField note_forme;
	private MoyenneMatiereListener moyenne_matiere_listener;

	public FormeListener(JFormattedTextField coeff_forme, JFormattedTextField note_forme, MoyenneMatiereListener moyenne_matiere_listener) {
		setCoeffForme(coeff_forme);
		setNoteForme(note_forme);
		
		setId(moyenne_matiere_listener.getId());
		setMoyenneMatiereListener(moyenne_matiere_listener);
	}

	@Override public void keyPressed(KeyEvent e) { }
	@Override public void keyTyped(KeyEvent e) { }

	@Override
	public void keyReleased(KeyEvent evt) { 
		try {
			Integer coefficient = Integer.parseInt(getCoeffForme().getText());
			Float note = Float.parseFloat(getNoteForme().getText());
		
			Float moyenne;
			if(note >= 0 && note <= 20) {
				if(coefficient > 0) {
					Float numerateur = getMoyenneMatiereListener().getNumerateurs();
					setNumerateur(getNumerateur() + note*coefficient);
					setDenominateur(getDenominateur() + coefficient);
					
					moyenne = getNumerateur()/getDenominateur();
	
					getMoyenneMatiere().setText(moyenne.toString());
				}
			}
		} catch(NumberFormatException e) { }
	}

	/**
	 * @return the coeff_forme
	 */
	private JFormattedTextField getCoeffForme() {
		return coeff_forme;
	}

	/**
	 * @param coeff_forme the coeff_forme to set
	 */
	private void setCoeffForme(JFormattedTextField coeff_forme) {
		this.coeff_forme = coeff_forme;
	}

	/**
	 * @return the note_forme
	 */
	private JFormattedTextField getNoteForme() {
		return note_forme;
	}

	/**
	 * @param note_forme the note_forme to set
	 */
	private void setNoteForme(JFormattedTextField note_forme) {
		this.note_forme = note_forme;
	}

	/**
	 * @return the moyenne_matiere_listener
	 */
	private MoyenneMatiereListener getMoyenneMatiereListener() {
		return moyenne_matiere_listener;
	}

	/**
	 * @param moyenne_matiere_listener the moyenne_matiere_listener to set
	 */
	private void setMoyenneMatiereListener(
			MoyenneMatiereListener moyenne_matiere_listener) {
		this.moyenne_matiere_listener = moyenne_matiere_listener;
	}
}
