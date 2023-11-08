package projet_java.morpion.java_morpion;

import java.util.ArrayList;

/** Grille 
 * Cette classe représente une grille de mots croisés.
 * @author Justine BONDU
* @version 1 du 07/11/2023
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
	private int			nbTour;


	/* -------------------------------------- */
	/*            Constructeur                */
	/* -------------------------------------- */


	public Morpion( )
	{
		//Morpion( false );
        this.grille = new char[3][3];
		this.joueur1 = 'o';
		this.joueur2 = 'x';


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
		this.joueur1 = 'o';
		this.joueur2 = 'x';
		this.nbTour = 0;
		if (j2)
		{
			this.j2_Ordi = j2;
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

    private boolean Agagner(char carac)
    {
		
		if ( grille[0][0] == grille[1][0] && grille[0][0] == grille[2][0] && grille[0][0] == carac )	{ return true; }
		if ( grille[0][1] == grille[1][1] && grille[0][1] == grille[2][1] && grille[0][1] == carac )	{ return true; }
		if ( grille[0][2] == grille[1][2] && grille[0][2] == grille[2][2] && grille[0][2] == carac )	{ return true; }

		if ( grille[0][0] == grille[0][1] && grille[0][0] == grille[0][2] && grille[0][0] == carac )	{ return true; }
		if ( grille[1][0] == grille[1][1] && grille[1][0] == grille[1][2] && grille[1][0] == carac )	{ return true; }
		if ( grille[2][0] == grille[2][1] && grille[2][0] == grille[2][2] && grille[2][0] == carac )	{ return true; }

		if ( grille[0][0] == grille[1][1] && grille[0][0] == grille[2][2] && grille[0][0] == carac )	{ return true; }
		if ( grille[2][0] == grille[1][1] && grille[2][0] == grille[0][2] && grille[2][0] == carac )	{ return true; }

        return false;
    }

	public void jouer()
	{
		while ( !Agagner(this.joueur1) || !Agagner(this.joueur2) )
		{
			joueur(this.joueur1);
			if (this.j2_Ordi) { ordi(); } else {joueur(this.joueur2);}
		}
		if ( Agagner(this.joueur1) )
		{
			System.out.println("Bravo joueur 1, tu as gagner cette partie");
		}
		if ( Agagner(this.joueur2) )
		{
			if (this.j2_Ordi)
			{
				System.out.println("Perdu, c'est l'ordinateu qui a gagner");
			}
			else
			{
				System.out.println("Bravo joueur 2, tu as gagner cette partie");
			}
		}
	}

	public boolean joueur(char carac)
	{
		System.out.println("pour jouer renter les coordonnée de la case");
		return false;
	}

	public boolean ordi()
	{
		String	possibilite[] ={"00, 01, 02, 10, 11, 12, 20, 21, 22"};
		String	coin[] ={"00, 02, 20, 22"};
		int		coupInt;
		String	coupString;
		
		if (this.nbTour == 0)
		{
			coupInt =(int) (Math.random()*4);
			coupString = coin[coupInt];
			grille[coupString.charAt(0)][coupString.charAt(1)] = this.joueur2;
			return true;
		}
		
		return false;
	}

	public boolean casePrise(int lig, int col)
	{
		if ( grille[lig][col] == 'x' || grille[lig][col] == 'o' )
		{
			return true;
		}
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

