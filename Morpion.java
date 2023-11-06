package projet_java.morpion.java_morpion;

import java.util.ArrayList;

/** Grille 
 * Cette classe représente une grille de mots croisés.
 * @author Justine BONDU
* @version 1 du 01/04/2023
*/
public class Morpion 
{
    /* -------------------------------------- */
	/*               Attributs                */
	/* -------------------------------------- */

	private char[][]	grille;
	private char		joueur1;
	private char		joueur2;
	private boolean		j2_Ordi;


	/* -------------------------------------- */
	/*            Constructeur                */
	/* -------------------------------------- */


	public Morpion( )
	{
        this.grille = new char[3][3];
		this.joueur1 = x;
		this.joueur2 = o;


		System.out.println ( "------------------------------------------------------------------------------" );
		System.out.println ();
		System.out.println (toString());
		System.out.println ();
		System.out.println ( "------------------------------------------------------------------------------" );

		System.out.println ( "------------------------------------------------------------------------------" );
		System.out.println ();

	}

	public Morpion( boolean j2 )
	{
        this.grille = new char[3][3];
		this.joueur1 = x;
		this.joueur2 = o;
		if (j2)
		{
			j2_Ordi = j2;
		}


		System.out.println ( "------------------------------------------------------------------------------" );
		System.out.println ();
		System.out.println (toString());
		System.out.println ();
		System.out.println ( "------------------------------------------------------------------------------" );

		System.out.println ( "------------------------------------------------------------------------------" );
		System.out.println ();

	}

	/* -------------------------------------- */
	/*               Accesseur                */
	/* -------------------------------------- */




	/* -------------------------------------- */
	/*                Méthode                 */
	/* -------------------------------------- */

    private boolean Agagner()
    {
        return false;

    }



    public  String toString()
	{
		String		s="    ";
		char[][]	tab;
		int			cptlig;
		int			cptcol;
		int			cpt;
		int			cptl2;

		tab = this.grille;

		cptl2 = tab.length-1;
		for (cptcol = 0; cptcol < tab[cptl2].length;cptcol++)
		{
			s = s + String.format ( "%" + (4) + "s",     cptcol + " " ) ;
		}
		s = s + "\n";
		s = s  + "    -";
		for (cptcol = 0; cptcol < tab[cptl2].length;cptcol++)
		{
			s = s + "----";
		}
		s = s  + "\n";

		for (cptlig = 0; cptlig < tab.length;cptlig++)
		{
			s = s + String.format ( "%" + (4) + "s",    cptlig + " " ) + "|";
			for (cptcol = 0; cptcol < tab[cptl2].length;cptcol++)
			{
				s = s +  String.format ( "%" + (4) + "s",    tab[cptlig][cptcol] ) + "|";
			}
			s = s + "\n";
			s = s  + "    -";
			cptl2 = tab.length-1;
			for (cpt = 0; cpt < tab[cptl2].length;cpt++)
			{
				s = s + "----";
			}
			s = s + "" + "\n";
		}		
		return s;
	}

    public static void main(String[] argv)
	{
		Morpion        gril1, gril2, gril3;
		gril1 = new Morpion();

		System.out.println ();
		

	}

    
}

