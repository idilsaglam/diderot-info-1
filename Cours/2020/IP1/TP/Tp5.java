import java.util.Random;

class Tp5{
    static Random rand = new Random();
    public static int randRange(){
	int a=0;
	int b=3;
	return(rand.nextInt(b-a)+a); 
    }
    public static String tirage(){
	String[] t= new String[]{"Pierre","Feuille","Ciseaux"};
	return(t[randRange()]);
    }

    public static String coupJoueur(){
	return(System.console().readLine());
    }
    
    public static String uneManche(){
	String comp = System.out.println(tirage());
	String user = coupJoueur();
	String res = "";
	if(comp.equals(user)){
	    res = "Due";
	}
        if(  (comp.equals("Feuille") && user.equals("Pierre")) || (comp.equals("Pierre") && user.equals("Ciseaux")) ||	 (comp.equals("Ciseaux") && user.equals("Feuille"))){
	    res = "You won!";
	}
       
	if(  (user.equals("Feuille") && comp.equals("Pierre")) || (user.equals("Pierre") && comp.equals("Ciseaux")) ||  (user.equals("Ciseaux") && comp.equals("Feuille"))){
	    res = "Computer  won!";
	}
	return res;
    }

   
    public static void main(String[] args){
	//System.out.println(tirage());

	System.out.println(uneManche());
    }    }

