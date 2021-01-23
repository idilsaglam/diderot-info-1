public class Animal {
public String nom;
public char sexe;
public int jours;
public int poids;
public String espece;
public int faim;

Animal(String nom, char sexe, int jours,int poids, String espece,int faim){
    this.nom = nom;
    this.sexe = sexe;
    this.jours = jours;
    this.poids = poids;
    this.espece = espece;
    this.faim = (faim % 10) +1;
}




}
