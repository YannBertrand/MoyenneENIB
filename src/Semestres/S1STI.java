package Semestres;

import java.util.ArrayList;

public class S1STI extends Semestre {
	public S1STI() {
		super("S1 STI");
		
		//Initialisation de la liste des blocs
		ArrayList<Bloc> liste_blocs = new ArrayList<Bloc>();

		/*
		 * BLOC A
		 */
		Bloc bloc_A = new Bloc("A");

		//Anglais
		Matiere anglais = new Matiere("Anglais");
		anglais.setCoefficient(3);
		anglais.add(new Forme("DS"));
		anglais.add(new Forme("Labo"));

		//Expression
		Matiere expression = new Matiere("Expression");
		expression.setCoefficient(2);
		expression.add(new Forme("DS"));
		expression.add(new Forme("Labo"));

		bloc_A.add(anglais);
		bloc_A.add(expression);
		bloc_A.calculerCoefficient();


		/*
		 * BLOC B
		 */
		Bloc bloc_B = new Bloc("B");

		//Algèbre
		Matiere algebre = new Matiere("Algèbre");
		algebre.setCoefficient(3);
		algebre.add(new Forme("DS"));
		algebre.add(new Forme("CTD"));

		//Algorithmique
		Matiere algorithmique = new Matiere("Algorithmique");
		algorithmique.setCoefficient(4);
		algorithmique.add(new Forme("DS"));
		algorithmique.add(new Forme("CTD"));
		algorithmique.add(new Forme("Labo"));

		//Analyse
		Matiere analyse = new Matiere("Analyse");
		analyse.setCoefficient(4);
		analyse.add(new Forme("DS"));
		analyse.add(new Forme("CTD"));

		//Ensembles et applications
		Matiere ensemble_et_applications = new Matiere("Ensembles et applications");
		ensemble_et_applications.setCoefficient(2);
		ensemble_et_applications.add(new Forme("DS"));
		ensemble_et_applications.add(new Forme("CTD"));

		//Soutien mathématiques
		Matiere soutien_mathematiques = new Matiere("Soutien mathématiques");
		soutien_mathematiques.setCoefficient(2);
		soutien_mathematiques.add(new Forme("CTD"));

		bloc_B.add(algebre);
		bloc_B.add(algorithmique);
		bloc_B.add(analyse);
		bloc_B.add(ensemble_et_applications);
		bloc_B.add(soutien_mathematiques);
		bloc_B.calculerCoefficient();


		/*
		 * BLOC C
		 */
		Bloc bloc_C = new Bloc("C");

		//Electronique
		Matiere electronique = new Matiere("Electronique");
		electronique.setCoefficient(7);
		electronique.add(new Forme("DS"));
		electronique.add(new Forme("CTD"));
		electronique.add(new Forme("Labo"));

		bloc_C.add(electronique);
		bloc_C.calculerCoefficient();


		/*
		 * BLOC D
		 */
		Bloc bloc_D = new Bloc("D");

		//Automatismes
		Matiere automatismes = new Matiere("Automatismes");
		automatismes.setCoefficient(3);
		automatismes.add(new Forme("DS"));
		automatismes.add(new Forme("CTD"));
		automatismes.add(new Forme("Labo"));

		//Cinématique
		Matiere cinematique = new Matiere("Cinématique");
		cinematique.setCoefficient(4);
		cinematique.add(new Forme("DS"));
		cinematique.add(new Forme("CTD"));

		//Etude de mécanismes
		Matiere etude_de_mecanismes = new Matiere("Etude de mécanismes");
		etude_de_mecanismes.setCoefficient(3);
		etude_de_mecanismes.add(new Forme("Labo"));

		bloc_D.add(automatismes);
		bloc_D.add(cinematique);
		bloc_D.add(etude_de_mecanismes);
		bloc_D.calculerCoefficient();


		/*
		 * BLOC E
		 */
		//Bloc bloc_E = new Bloc("E");

		//bloc_E.calculerCoefficient();


		/*
		 * BLOC F
		 */
		Bloc bloc_F = new Bloc("F");
		
		//Allemand
		Matiere allemand = new Matiere("Allemand");
		allemand.setOptionnel(true);
		allemand.setCoefficient(2);
		allemand.add(new Forme("Labo"));
		
		//Espagnol débutant
		Matiere espagnol_debutant = new Matiere("Espagnol débutant");
		espagnol_debutant.setOptionnel(true);
		espagnol_debutant.setCoefficient(2);
		espagnol_debutant.add(new Forme("Labo"));
		
		//Espagnol
		Matiere espagnol = new Matiere("Espagnol");
		espagnol.setOptionnel(true);
		espagnol.setCoefficient(2);
		espagnol.add(new Forme("Labo"));

		
		bloc_F.add(allemand);
		bloc_F.add(espagnol_debutant);
		bloc_F.add(espagnol);
		bloc_F.calculerCoefficient();



		/*
		 * AJOUT DES BLOCS
		 */
		liste_blocs.add(bloc_A);
		liste_blocs.add(bloc_B);
		liste_blocs.add(bloc_C);
		liste_blocs.add(bloc_D);
		//liste_blocs.add(bloc_E);
		liste_blocs.add(bloc_F);
		
		setInformations(liste_blocs);
	}
}
