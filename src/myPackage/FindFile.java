package myPackage;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * 1) cr�ez une m�thode void testFile (String path) permettant de tester si le fichier existe, si c'est un fichier ou un r�pertoire
 *
 * 2) Si le fichier n'existe pas, alors on le cr�e en utilisant la m�thode File.createNewFile()
 *
 * 3) Modifiez votre fonction pour les cas o� il s'agit d'un r�pertoire : �num�rer l'ensemble des fichiers s'y trouvant
 *    en donnant leur chemin absolu avec File.getAbsolutePath()
 *
 * 4) On souhaite afficher les fichiers dont l'extension est .java utiliser la fonction String[] list(FilenameFilter filter)
 *    l'interface d�crit une m�thode boolean accept(File dir, String name) qui doit retourner true si le fichier 
 *    doit �tre ajout� � la liste et false sinon
 */

public class FindFile 
{
	public static void testFile(String path)
	{
		// creer une instance f de la Classe File
		File f = new File(path);
		
		if (f.exists())
		{	
			if (f.isDirectory())
			{
				System.out.println("Le repertoire " + f + " existe d�j� \n");
				
				String[] contenuRep = f.list();

				File[] files = new File[contenuRep.length];

				int i = 0;

				System.out.println("Liste des fichiers java");
				for(String contenu : contenuRep) 
				{
					File repFile = new File(contenu);

					files[i] = repFile;

					System.out.println(repFile.getAbsolutePath());
				}
				System.out.println("\n");

				FilenameFilter filter = new FilenameFilter() 
				{
					public boolean accept(File dir, String name) 
					{
						if (name.endsWith(".java")) 
						{
							return true;
						} 
						else 
						{
							return false;
						}
					}
				};

				File[] javaFiles = f.listFiles(filter);

				System.out.println("Liste des fichiers java");
				for (File javaFile : javaFiles)
				{
					System.out.println(javaFile.getAbsolutePath());
				}
				System.out.println("\n");
			}
			
			else if (f.isFile())
			{
				System.out.println("Le fichier " + f + " existe d�j� \n");
			}
		}
		
		else
		{
			System.out.println("Cr�ation du fichier : " + f);
			try 
			{
				f.createNewFile();
			} 
				
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		String path = System.getProperty("user.dir") + "\\src\\myPackage";
		testFile(path);
				
		String path1 = System.getProperty("user.dir") + "\\src\\myPackage\\test.java";
		testFile(path1);
		
		String path2 = System.getProperty("user.dir") + "\\src\\myPackage\\test1.java";
		testFile(path2);
		
		String path3 = System.getProperty("user.dir") + "\\src\\myPackage\\test2.java";
		testFile(path3);
	}
}