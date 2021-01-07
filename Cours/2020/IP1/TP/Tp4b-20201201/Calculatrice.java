public class Calculatrice {

    public static int somme(String s){
        int res=0;
        String operand="";
        if(s.charAt(0) == '+'){
            return -1;
        }
        if(s.charAt(s.length()-1)== '+'){
            return -1;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '+'){
                res += Integer.parseInt(operand);;
                operand = "";
                continue;
            }
            operand+=s.charAt(i);
        }
	res+= Integer.parseInt(operand);
        return res;
    }


    public static void main(String[] args) {

	System.out.println(somme("1+3+4"));
        System.out.println(somme("+2+3"));
        System.out.println(somme("1+2+"));
        System.out.println(somme("11+12"));;

    }
}
