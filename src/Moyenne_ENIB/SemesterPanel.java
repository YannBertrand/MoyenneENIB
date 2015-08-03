package Moyenne_ENIB;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Semestres.Bloc;
import Semestres.Forme;
import Semestres.Matiere;
import Semestres.Semestre;

public class SemesterPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private String nom;
	private Class<Semestre> semester_class;
	private Object semester_object;

	@SuppressWarnings("unchecked")
	public SemesterPanel(String nom) {
		setNom(nom);

		JPanel container = new JPanel();
		container.setLayout(new BorderLayout());
		container.add(new JLabel(nom), BorderLayout.NORTH);
		
		//Semestre semestre = new Semestre();
		JPanel panel = new JPanel();

		try {
			//On crée un objet Class
			setSemesterClass((Class<Semestre>) Class.forName("Semestres." + nom));
			//Nouvelle instance de la classe 
			setSemesterObject(getSemesterClass().newInstance());

			showAll(panel);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		//container.add(scroll, BorderLayout.CENTER);
		container.add(panel, BorderLayout.CENTER);

		//scroll.setViewportView(container);
		add(container);
	}

	/*
	 * Affiche tout
	 */
	private void showAll(JPanel panel) {
		showBlocs(panel);
	}

	/*
	 * 
	 */
	private void showBlocs(JPanel blocs_panel) {
		int nb_of_blocs = getNbOfBlocs();
		blocs_panel.setLayout(new GridLayout(nb_of_blocs*2, 1));

		ArrayList<Bloc> blocs = getBlocs();
		for(int b=0; b < nb_of_blocs; b++) {
			showBloc(blocs_panel, blocs.get(b));
		}
	}

	/*
	 * 
	 */
	private void showBloc(JPanel blocs_panel, Bloc bloc) {
		//Nom du bloc
		blocs_panel.add(new JLabel("Bloc " +bloc.getNom()));

		//Infos du bloc
		////
		JPanel bloc_panel = new JPanel();
		bloc_panel.setLayout(new GridLayout(1,3));

		bloc_panel.removeAll();
		//////Matières du bloc
		showMatieres(bloc_panel, bloc);

		////Coefficient du bloc
		JFormattedTextField coeff_bloc = new JFormattedTextField(NumberFormat.getIntegerInstance());
		coeff_bloc.setText(bloc.getCoefficient().toString());
		coeff_bloc.setEditable(false);
		bloc_panel.add(coeff_bloc);

		////Moyenne du bloc
		JFormattedTextField moyenne_bloc = new JFormattedTextField(NumberFormat.getIntegerInstance());
		bloc_panel.add(moyenne_bloc);
		blocs_panel.add(bloc_panel);
	}

	/*
	 * 
	 */
	private void showMatieres(JPanel bloc_panel, Bloc bloc) {
		JPanel matieres_panel = new JPanel();
		ArrayList<Matiere> matieres = bloc.getListeMatieres();
		int nb_of_matieres = matieres.size();
		matieres_panel.setLayout(new GridLayout(nb_of_matieres, 2));
		
		for(int m=0; m < nb_of_matieres; m++) {
			showMatiere(matieres_panel, matieres.get(m));
		}
		bloc_panel.add(matieres_panel);
	}

	/*
	 * 
	 */
	private void showMatiere(JPanel matieres_panel, Matiere matiere) {
		//Nom de la matière
		matieres_panel.add(new JLabel(matiere.getNom()));
		
		showFormes(matieres_panel, matiere);
	}
	
	private void showFormes(JPanel matieres_panel, Matiere matiere) {
		JPanel formes_panel = new JPanel();
		
		ArrayList<Forme> formes = matiere.getListeFormes();
		int nb_of_formes = formes.size();
		
		formes_panel.setLayout(new GridLayout(nb_of_formes+2, 3));
		
		//Moyenne de la matière
		JFormattedTextField moyenne_matiere = new JFormattedTextField(NumberFormat.getIntegerInstance());
		
		formes_panel.add(new JLabel(""));
		formes_panel.add(new JLabel("Coeff"));
		formes_panel.add(new JLabel("Note"));
		//Float numerateur=(float) 0; Integer denominateur=0;
		MoyenneMatiereListener moyenne_matiere_listener = 
				new MoyenneMatiereListener(moyenne_matiere);
		for(int f=0; f < nb_of_formes; f++) {
			showForme(formes_panel, formes.get(f), moyenne_matiere_listener);
			
			//Incrémentation du nombre de listeners
			moyenne_matiere_listener.setNbOfListeners(moyenne_matiere_listener.getNbOfListeners()+1);
		}
		formes_panel.add(new JLabel("Moyenne"));
		
		//Coefficient de la matière
		JFormattedTextField coeff_matiere = new JFormattedTextField(NumberFormat.getIntegerInstance());
		coeff_matiere.setText(matiere.getCoefficient().toString());
		coeff_matiere.setEditable(false);
		formes_panel.add(coeff_matiere);
		
		//Ajout de la moyenne
		formes_panel.add(moyenne_matiere);
		
		matieres_panel.add(formes_panel);
	}
	
	private void showForme(JPanel formes_panel, Forme forme, MoyenneMatiereListener moyenne_matiere_listener) {
		//Nom
		formes_panel.add(new JLabel(forme.getNom()));
		
		//Coefficient
		JFormattedTextField coeff_forme = new JFormattedTextField(NumberFormat.getIntegerInstance());
		coeff_forme.setText(forme.getCoefficient().toString());
		coeff_forme.setEditable(false);
		formes_panel.add(coeff_forme);
		
		//Note
		JFormattedTextField note_forme = new JFormattedTextField(NumberFormat.getIntegerInstance());
		formes_panel.add(note_forme);
		
		note_forme.addKeyListener(new FormeListener(coeff_forme, note_forme, moyenne_matiere_listener));
	}

	/**
	 ** BLOCS
	 **/
	/*
	 * @return le nombre de blocs
	 */
	private int getNbOfBlocs() {
		Method m_get_nb_of_blocs;
		try {
			m_get_nb_of_blocs = getSemesterClass().getMethod("getNbDeBlocs", null);
			int nb_of_blocs = (int) m_get_nb_of_blocs.invoke(getSemesterObject(), null);

			return nb_of_blocs;
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	/*
	 * @return la liste des blocs
	 */
	private ArrayList<Bloc> getBlocs() {
		Method m_get_blocs;
		try {
			m_get_blocs = getSemesterClass().getMethod("getBlocs", null);
			ArrayList<Bloc> blocs = (ArrayList<Bloc>) m_get_blocs.invoke(getSemesterObject(), null);

			return blocs;
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ArrayList<Bloc>();
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
	 * @return the semester_class
	 */
	private Class<Semestre> getSemesterClass() {
		return semester_class;
	}

	/**
	 * @param semester_class the semester_class to set
	 */
	private void setSemesterClass(Class<Semestre> semester_class) {
		this.semester_class = semester_class;
	}

	/**
	 * @return the semester_object
	 */
	private Object getSemesterObject() {
		return semester_object;
	}

	/**
	 * @param semester_object the semester_object to set
	 */
	private void setSemesterObject(Object semester_object) {
		this.semester_object = semester_object;
	}
}
