package Semestres;

import java.util.ArrayList;


/**
 * @author Yann
 *
 */
public abstract class Semestre {
	/**
	 * BLOC	=>	MATIERE (COEFF)	=>	FORME
	 * 
	 * A	=> Anglais (3)	=> DS, Labo
	 * 		=> Expression (2) => DS, Labo
	 * 	...
	 */
	private String nom;
	private ArrayList<Bloc> informations;
	
	public Semestre(String nom) {
		setNom(nom);
	}
	
	public String toString() {
		String string = getNom() + ": ";
		string += "\n";
		for(Bloc bloc: getInformations()) {
			string += " ";
			string += bloc.toString();
			string += "\n";
		}
		return string;
	}
	
	/**
	 ** NOMBRE D'ELEMENTS
	 **/
	/*
	 * @return le nombre de blocs
	 */
	public int getNbDeBlocs() {
		return getInformations().size();
	}
	/*
	 * @return le nombre de matières d'un bloc
	 */
	public int getNbDeMatieres(Bloc bloc) {
		return bloc.getListeMatieres().size();
	}
	
	/**
	 ** LISTES
	 **/
	/*
	 * @return la liste des blocs
	 */
	public ArrayList<Bloc> getBlocs() {
		ArrayList<Bloc> blocs = new ArrayList<Bloc>();
		for(Bloc bloc: getInformations()) {
			blocs.add(bloc);
		}
		
		return blocs;
	}
	
	/*
	 * @return la liste des matières
	 */
	public ArrayList<Matiere> getMatieres(Bloc bloc) {
		ArrayList<Matiere> matieres = new ArrayList<Matiere>();
		for(Matiere matiere: bloc.getListeMatieres()) {
			matieres.add(matiere);
		}
		
		return matieres;
	}
	
	/**
	 ** INFOS
	 **/
	/*
	 * @return le nom d'un bloc
	 */
	public String getNomBloc(Bloc bloc) {
		return bloc.getNom();
	}
	
	/*
	 * @return le coefficient d'un bloc
	 */
	public int getCoeffBloc(Bloc bloc) {
		return bloc.getCoefficient();
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
	 * @return the informations
	 */
	public ArrayList<Bloc> getInformations() {
		return informations;
	}

	/**
	 * @param informations the informations to set
	 */
	public void setInformations(ArrayList<Bloc> informations) {
		this.informations = informations;
	}
}
