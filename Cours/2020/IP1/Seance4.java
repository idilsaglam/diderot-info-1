class Seance4{

    //Exercice 4
    //Donner les instructions pour créer un tableau a valant {1,2,3,4,5,...,1000}
    // int[] t= new int[1000];
    //for(int i=0;i<t.length;i++{
    //t[i]=i;}

    //Tableau d'élements non nuls 
    public static int notZero(int[] t){
	int s = 0;
	for(int i=0;i<t.length;i++){
	    if(t[i] != 0){
		s=s+1;
	    }
	}
	return s;
    }
    //Exercice 8:
    // Une fonction qui calcule la somme des éléments du tableau donné en paramètre.
    public static int somme(int[] t){
	int somme = 0;
	for(int i=0;i<t.length;i++){
	   somme+= t[i];
	}
	return somme;
    }

    //Exercice 9
    //Une suite d'instructions qui crée un tableau d'entiers valant {3,5,2,3,6,3,4}, qui calcule la moyenne entière des éléments de t qui affiche cette moyenne.
    public static int  moyenne(){
	int[] m={3,5,2,3,6,3,4};
	return ((somme(m)) / m.length);
    }
    //Exercice 10
    //Une fonction qui prend un paramètre entier n et affiche les n premiers grognements brhh, brrhh, brrrhh etc.
    public static void grognements(int n){
       
	
    }
   
    //Exercice 11
    //Fonction qui prend en paramètre un tableau et une valeur entière. Si le tableau contient cette valeur, la fonction renvoie l'indice de la dernière occurence de la valeur. Si le tableau ne contient pas cette valeur,la fonction renvoie -1.
    public static int firstOcc(int[] tab, int x){

	for(int i=0; i<tab.length;i++){
	    if(tab[i] == x){
		return i;
	    }
	}
	return -1;
    }
    public static void main(String[] args){
	System.out.println("Tableau d'éléments non nuls");
	System.out.println(notZero(new int[]{3,5,6,0}));

	System.out.println("Exercice 8");
	System.out.println(somme(new int[]{4,5,3}));

	System.out.println("Exercice 9");
	System.out.println(moyenne());

	grognements();
	System.out.println("Exercice 11");
	System.out.println(firstOcc(new int[]{5,4,3},3));
	System.out.println(firstOcc(new int[]{3,6,5},2));
    }
   


}
