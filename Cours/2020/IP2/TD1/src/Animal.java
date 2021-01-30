public class Animal {
public String nom;
public char sexe;
public int jours;
public int poids;
public String espece;
public int faim;

Animal(String nom, char sexe, int jours,int poids, String espece) {
    this.nom = nom;
    this.sexe = sexe;
    this.jours = jours;
    this.poids = poids;
    this.espece = espece;
}
/* Dans l'exercices précedents (l'exercice 3) il me demande de créer des animaux sans préciser le niveau de faim. Pour pouvoir ajouter un attribut 'faim'
   et pour ne pas impecter les exercices précedents au lieu de ajouter un attribut 'faim' dans le constructeur j'ai crée deuxiéme constructeur.
 */
    Animal(String nom, char sexe, int jours,int poids, String espece,int faim) {
        this.nom = nom;
        this.sexe = sexe;
        this.jours = jours;
        this.poids = poids;
        this.espece = espece;
        this.faim = faim;
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
        System.out.printf("Je m'appelle %s Je suis un %s %s %s ,j'ai %d jours et je pese %d kg.\n",animal.nom,article,animal.espece,sex,animal.jours,animal.poids);
    }

    public static void descriptionBis(Animal animal) {
        String article, sex;
        if (animal.sexe == 'm') {
            sex = "male";
            article = "";
            System.out.printf("Je m'appelle %s Je suis un %s %s %s ,j'ai %d ans %d jours et je pese %d kg.\n",animal.nom,article,animal.espece,sex,animal.jours/365,animal.jours%365,animal.poids);
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