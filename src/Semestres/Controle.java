package Semestres;

import java.util.Date;

public class Controle {
	private int id;
	private String nom;
	private float note;
	private int coefficient;
	private Date date;
	
	public Controle(float note, Date date) {
		setId(0);
		setNote(note);
		setCoefficient(1);
		setDate(date);
	}
	
	public Controle(String nom, float note, Date date) {
		setId(0);
		setNom(nom);
		setNote(note);
		setCoefficient(1);
		setDate(date);
	}
	
	public Controle(String nom, float note, int coefficient, Date date) {
		setId(0);
		setNom(nom);
		setNote(note);
		setCoefficient(coefficient);
		setDate(date);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	private void setId(int id) {
		this.id = id;
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
	 * @return the note
	 */
	public float getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	private void setNote(float note) {
		this.note = note;
	}
	
	/**
	 * @return the coefficient
	 */
	public int getCoefficient() {
		return coefficient;
	}

	/**
	 * @param coefficient the coefficient to set
	 */
	private void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	private void setDate(Date date) {
		this.date = date;
	}
}
