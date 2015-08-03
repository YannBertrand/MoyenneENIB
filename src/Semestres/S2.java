package Semestres;

import java.util.ArrayList;

public class S2 extends Semestre {
	public S2() {
		super("S2");
		
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
		algebre.setCoefficient(4);
		algebre.add(new Forme("DS"));
		algebre.add(new Forme("CTD"));

		//Analyse
		Matiere analyse = new Matiere("Analyse");
		analyse.setCoefficient(3);
		analyse.add(new Forme("DS"));
		analyse.add(new Forme("CTD"));

		//Méthodes de développement
		Matiere methodes_de_developpement = new Matiere("Méthodes de développement");
		methodes_de_developpement.setCoefficient(4);
		methodes_de_developpement.add(new Forme("DS"));
		methodes_de_developpement.add(new Forme("CTD"));
		methodes_de_developpement.add(new Forme("Labo"));

		bloc_B.add(algebre);
		bloc_B.add(analyse);
		bloc_B.add(methodes_de_developpement);
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

		//Optique géométrique
		Matiere optique_geometrique = new Matiere("Optique géométrique");
		optique_geometrique.setCoefficient(2);
		optique_geometrique.add(new Forme("DS"));
		optique_geometrique.add(new Forme("CTD"));

		//Electromagnétisme
		Matiere electromagnetisme = new Matiere("Electromagnétisme");
		electromagnetisme.setCoefficient(2);
		electromagnetisme.add(new Forme("DS"));
		electromagnetisme.add(new Forme("CTD"));

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

		//Etude de mécanismes
		Matiere etude_de_mecanismes = new Matiere("Etude de mécanismes");
		etude_de_mecanismes.setCoefficient(2);
		etude_de_mecanismes.add(new Forme("Labo"));

		//Statique
		Matiere statique = new Matiere("Statique");
		statique.setCoefficient(3);
		statique.add(new Forme("DS"));
		statique.add(new Forme("CTD"));

		bloc_D.add(automatismes);
		bloc_D.add(etude_de_mecanismes);
		bloc_D.add(statique);
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
