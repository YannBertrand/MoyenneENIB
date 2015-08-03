package Moyenne_ENIB;

import java.util.ArrayList;

import javax.swing.JFormattedTextField;

public class MoyenneMatiereListener {
	private ArrayList<Float> numerateurs;
	private ArrayList<Integer> denominateurs;
	private JFormattedTextField moyenne_matiere;
	private Integer nb_of_listeners;
	
	public MoyenneMatiereListener(JFormattedTextField moyenne_matiere) {
		setNumerateurs(new ArrayList<Float>());
		setDenominateurs(new ArrayList<Integer>());
		setMoyenneMatiere(moyenne_matiere);
	}

	/**
	 * @return the moyenne_matiere
	 */
	public JFormattedTextField getMoyenneMatiere() {
		return moyenne_matiere;
	}

	/**
	 * @param moyenne_matiere the moyenne_matiere to set
	 */
	private void setMoyenneMatiere(JFormattedTextField moyenne_matiere) {
		this.moyenne_matiere = moyenne_matiere;
	}

	/**
	 * @return the numerateurs
	 */
	public ArrayList<Float> getNumerateurs() {
		return numerateurs;
	}

	/**
	 * @param numerateurs the numerateurs to set
	 */
	public void setNumerateurs(ArrayList<Float> numerateur) {
		this.numerateurs = numerateur;
	}

	/**
	 * @return the denominateurs
	 */
	public ArrayList<Integer> getDenominateurs() {
		return denominateurs;
	}

	/**
	 * @param denominateurs the denominateurs to set
	 */
	private void setDenominateurs(ArrayList<Integer> denominateurs) {
		this.denominateurs = denominateurs;
	}

	/**
	 * @return the nb_of_listeners
	 */
	public Integer getNbOfListeners() {
		return nb_of_listeners;
	}

	/**
	 * @param nb_of_listeners the nb_of_listeners to set
	 */
	public void setNbOfListeners(Integer nb_of_listeners) {
		this.nb_of_listeners = nb_of_listeners;
	}
}
