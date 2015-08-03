package Semestres;


public class Forme {
	private String nom;
	private Integer coefficient;
	private Moyenne moyenne;

	public Forme(String nom) {
		setNom(nom);
		setCoefficient(1);
		setMoyenne(new Moyenne());
	}

	public Forme(String nom, Integer coefficient) {
		setNom(nom);
		setCoefficient(coefficient);
		setMoyenne(new Moyenne());
	}
	
	public Forme(String nom, Integer coefficient, Moyenne moyenne) {
		setNom(nom);
		setCoefficient(coefficient);
		setMoyenne(moyenne);
	}

	public String toString() {
		return getNom();
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
	 * @return the moyenne
	 */
	public Moyenne getMoyenne() {
		return moyenne;
	}

	/**
	 * @param moyenne the moyenne to set
	 */
	private void setMoyenne(Moyenne moyenne) {
		this.moyenne = moyenne;
	}
}
