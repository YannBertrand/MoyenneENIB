package Semestres;

import java.util.ArrayList;

public class Matiere {
	private String nom;
	private Integer coefficient;
	private ArrayList<Forme> liste_formes;
	private boolean optionnel=false;
	
	public Matiere(String nom) {
		setNom(nom);
		setListeFormes(new ArrayList<Forme>());
	}
	
	public Matiere(String nom, int coefficient) {
		setNom(nom);
		setCoefficient(coefficient);
	}
	
	public Matiere(String nom, int coefficient, ArrayList<Forme> liste_formes) {
		setNom(nom);
		setCoefficient(coefficient);
		setListeFormes(liste_formes);
	}
	
	/*
	 * Ajouter une forme
	 */
	public void add(Forme forme) {
		getListeFormes().add(forme);
	}
	
	public String toString() {
		String string = getNom() + " ("+ getCoefficient() +") : ";
		//string += "\n";
		for(Forme forme: liste_formes) {
			string += forme.toString()+", ";
		}
		return string;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	private void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the coefficient
	 */
	public Integer getCoefficient() {
		return coefficient;
	}

	/**
	 * @param coefficient the coefficient to set
	 */
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}

	/**
	 * @return the liste_formes
	 */
	public ArrayList<Forme> getListeFormes() {
		return liste_formes;
	}

	/**
	 * @param liste_formes the liste_formes to set
	 */
	private void setListeFormes(ArrayList<Forme> liste_formes) {
		this.liste_formes = liste_formes;
	}

	/**
	 * @return the optionnel
	 */
	public boolean isOptionnel() {
		return optionnel;
	}

	/**
	 * @param optionnel the optionnel to set
	 */
	public void setOptionnel(boolean optionnel) {
		this.optionnel = optionnel;
	}
}
