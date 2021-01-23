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


    public void description(){
        String article;
        String sex;
        if(this.sexe == 'm'){
            sex = "male";
            article = "";
        }else{
            sex = "femelle";
            article = "e";
        }
        System.out.println("Je m'appelle" + this.nom + ", Je suis un" +article+ " "+ this.espece + " " + sex + ", j'ai" + ""+this.jours*365 + " jours et je pese" + this.poids + " kg.");
    }

    public void nourrir(){
        if(this.faim >= 1) {
            this.faim = this.faim - 1;
        }else{
            this.poids += this.poids/10;
        }
    }
}
