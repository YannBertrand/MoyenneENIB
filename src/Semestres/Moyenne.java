package Semestres;

import java.util.ArrayList;

public class Moyenne {
	private float note;
	private ArrayList<Controle> liste_controles;
	
	public Moyenne() {
		setListeControles(new ArrayList<Controle>());
	}

	/*
	 * Ajouter un controle
	 */
	public void add(Controle controle) {
		getListeControles().add(controle);
		
		calculerMoyenne();
	}
	
	/*
	 * Calcule la moyenne
	 */
	public void calculerMoyenne() {
		float moyenne = 0;
		for(Controle controle: getListeControles()) {
			moyenne += controle.getNote() * controle.getCoefficient();
		}
		moyenne /= getListeControles().size();
		
		setNote(moyenne);
	}


	/**
	 * @return the moyenne
	 */
	public float getNote() {
		return note;
	}

	/**
	 * @param moyenne the moyenne to set
	 */
	private void setNote(float note) {
		this.note = note;
	}
	
	/**
	 * @return the liste_notes
	 */
	private ArrayList<Controle> getListeControles() {
		return liste_controles;
	}

	/**
	 * @param liste_notes the liste_notes to set
	 */
	private void setListeControles(ArrayList<Controle> liste_controles) {
		this.liste_controles = liste_controles;
	}
	
	
}
