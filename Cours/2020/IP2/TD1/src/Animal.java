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
    this.faim = (faim % 11);
}
    public static void description(Animal animal){
    String article,sex;
        if(animal.sexe == 'm'){
            sex = "male";
            article = "";
        }else{
            sex = "femelle";
            article = "e";
        }
        System.out.println("Je m'appelle " + animal.nom + ", Je suis un" +article+ " "+ animal.espece + " " + sex + ", j'ai " + ""+animal.jours + " jours et je pese " + animal.poids + " kg.");
    }

    public static void descriptionBis(Animal animal) {
        String article, sex;
        if (animal.sexe == 'm') {
            sex = "male";
            article = "";
            System.out.println("Je m'appelle " + animal.nom + ", Je suis un" + article + " " + animal.espece + " " + sex + ", j'ai " + "" + animal.jours / 365 + " ans " + animal.jours % 365 + " jours " + " et je pese" + animal.poids + " kg.");
        }
    }

    public static void nourrir(Animal animal){
        if(animal.faim >= 1) {
            animal.faim = animal.faim - 1;
        }else{
            animal.poids += animal.poids/10;
        }
    }
}
