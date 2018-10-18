#### Le but : copier un fichier (lecture) en entree vers un fichier (ecriture) en sortie
####
#### Exercice : Sauvegarder le programme FileCopyFile.java
####            Generer le fichier readme.md a partir des differents commentaires du programme FileCopyFile.java
####
#### Exercice : Sauvegarder le programme FileCopyFile.java 
####            Generer le fichier readme.md a partir des differents commentaires du programme FileCopyFile.java
####
#### Ouverture du fichier FileCopyFile.java en lecture
#### Ouverture du fichier FileCopyFile.save en ecriture
#### Ouverture du fichier readme.md en ecriture
####
#### Initialisations des delimiteurs de commentaires

#### Boucle sur le fichier en entree tant qu'il y a un enregistrement
#### si l'enregistrement debute avec deux slash
#### apres suppression des espaces d'entete
#### alors
#### ecriture du commentaire dans le fichier FileCopyFile.save
#### ecriture du commentaire dans le fichier readme.md
#### sinon si l'enregistrement contient un des delimiteurs
#### alors
#### ecriture du commentaire dans le fichier readme.md
#### sinon
#### ecriture de l'enregistrement dans le fichier de sauvegarde FileCopyFile.save
####
#### Fermeture du fichier FileCopyFile.java
#### Fermeture du fichier FileCopyFile.save
#### Fermeture du fichier readme.md
####
####     ecriture du commentaire dans le fichier FileCopyFile.save
####     ecriture du commentaire dans le fichier readme.md
#### sinon si l'enregistrement contient un des delimiteurs
####       alors
####           ecriture du commentaire dans le fichier readme.md
####       sinon
####           ecriture de l'enregistrement dans le fichier de sauvegarde FileCopyFile.save
####
#### Fermeture du fichier FileCopyFile.java
#### Fermeture du fichier FileCopyFile.save
#### Fermeture du fichier readme.md
####
#### lancement de la methode copyFile en passant en arguments
#### le fichier en entree en acces lecture  de FileCopyFile.java
#### le fichier en sortie en acces ecriture de FileCopyFile.save
#### le fichier en sortie en acces ecriture de readme.md
