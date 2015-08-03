package Semestres;

import java.util.ArrayList;

public class Bloc {
	private String nom;
	private Integer coefficient;
	private ArrayList<Matiere> liste_matieres;

	public Bloc(String nom) {
		setNom(nom);
		setListeMatieres(new ArrayList<Matiere>());
	}

	public Bloc(String nom, ArrayList<Matiere> liste_matieres) {
		setNom(nom);
		setListeMatieres(liste_matieres);
	}

	/*
	 * Ajouter une matière
	 */
	public void add(Matiere matiere) {
		getListeMatieres().add(matiere);
	}

	/*
	 * Calcul du coefficient du bloc après avoir rajouté les matières
	 */
	public void calculerCoefficient() {
		int coefficient=0;
		for(Matiere matiere: getListeMatieres()) {
			coefficient += matiere.getCoefficient();
		}
		setCoefficient(coefficient);
	}

	public String toString() {
		String string = getNom() + " (" + getCoefficient() + "): ";
		string += "\n";
		for(Matiere matiere: getListeMatieres()) {
			string += "  ";
			string += matiere.toString();
			string += "\n";
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
	private void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}

	/**
	 * @return the liste_matieres
	 */
	public ArrayList<Matiere> getListeMatieres() {
		return liste_matieres;
	}

	/**
	 * @param liste_matieres the liste_matieres to set
	 */
	private void setListeMatieres(ArrayList<Matiere> liste_matieres) {
		this.liste_matieres = liste_matieres;
	}
}
