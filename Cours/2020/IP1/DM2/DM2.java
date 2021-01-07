public class DM2 {
    
    // Exercice 1
    public static void frame(String s) {
	String row = "+-";
	for (int i = 0; i< s.length(); i++) {
	    row += "-";
	}
	row += "-+";
	String[] inputLines =  s.split("(\r)?\n");  
	String content = "";
	for (int i = 0; i<inputLines.length; i++) {
	    inputLines[i] = "| " + inputLines[i] + " |";
	    content = content + inputLines[i] + ((i < (inputLines.length - 1)) ? "\n" : "");
	}
	System.out.println(row + "\n" + content + "\n" + row );
    }

    // Exercice 2
    public static String reverse(String s) {
	if (s == null ) {
	    return s;    
	}
	String output = "";
	for (int i = s.length() - 1; i >= 0; i--) {
	    output += s.charAt(i);
	}
	return output;
    }

    public static boolean palindrome(String s) {
	return (s.equals(reverse(s)));
    }

    public static boolean palindrome_bis(String s) {
        int i = 0, j;
	boolean result;
	do {
	  j = s.length()-1-i;
	  result = (s.charAt(i) == s.charAt(j));
	  i++;
	} while(result && (i<j));
	return result;
    }
    
    // Exercice 3
    public static boolean isPrime(int n) {
	if (n == 1) {
	    return false;
	}

	int half = (n/2);

	for (int i = 2; i <= half; i++) {
	    if (n % i == 0) {
		return false;
	    }
	}
	return true;
    }
		
    public static int sumDiv(int n) {
	int result = (n <= 1 ? 0 : 1);
	for (int i = 2; i<n; i++) {
	    if (n % i == 0) {
		result += i;
	    }
        }
	return result;
    }

    public static int[] firstFriendlyBefore(int s){
	for (int n = 2; n<s; n++) {
	    int m = sumDiv(n);
	    if (sumDiv(m) == n) {
		return new int[]{m,n};
	    }
	}
	return null;
    }

    public static int firstFriendlyAfter(int n) {
	for (; n<=Integer.MAX_VALUE; n++) {
	    int m = sumDiv(n);
	    if (sumDiv(m) == n) {
		return (m < n ? m : n);
	    }
	}
	return -1; 
    }

    public static void main(String[] args) {
        System.out.println("### Exercice 1 ###");
        frame(""); testStdout("+--+\n|  |\n+--+");
        frame("Hello"); testStdout("+-------+\n| Hello |\n+-------+");

        System.out.println("### Exercice 2 ###");
        testString("reverse(\"test\")", "tset", reverse("test"));
        testString("palindrome(\"test\")", false, palindrome("test"));
        testString("palindrome(\"rotor\")", true, palindrome("rotor"));
        testString("palindrome_bis(\"test\")", false, palindrome_bis("test"));
        testString("palindrome_bis(\"rotor\")", true, palindrome_bis("rotor"));

        System.out.println("### Exercice 3 ###");
        testInt("isPrime(1)", false, isPrime(1));
        testInt("isPrime(2)", true, isPrime(2));
        testInt("isPrime(3)", true, isPrime(3));
        testInt("isPrime(1729)", false, isPrime(1729));
        testInt("isPrime(997)", true, isPrime(997));
	
        System.out.println("### Exercice 4 ###");
	testInt("sumDiv(6)", 6 , sumDiv(6));
	testInt("sumDiv(1184)", 1210 , sumDiv(1184));
        testInt("firstFriendlyAfter(1)", 6, firstFriendlyAfter(1));
        testInt("firstFriendlyAfter(5000)", 5020, firstFriendlyAfter(5000));
    }

    /*************************************************************/
    /* NE PAS MODIFIER */
    /*************************************************************/
    public static void testInt(String cmd, int exp, int val) {
        System.out.println(cmd + " == " + exp);
        if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }

    public static void testInt(String cmd, boolean exp, boolean val) {
        System.out.println(cmd + " == " + exp);
        if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }

    public static void testString(String cmd, String exp, String val) {
        System.out.println(cmd + " == " + exp);
        if (! exp.equals(val)) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }

    public static void testString(String cmd, boolean exp, boolean val) {
        System.out.println(cmd + " == " + exp);
        if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }

    public static void testStdout(String expected) {
        System.out.println(expected+"\nSi les deux lignes précédentes ne sont pas pareilles, votre réponse est fausse.");
    }

    public static String characterAtPos(String s, int i) {
		if (i >= 0 && i < s.length()) {
			return (String.valueOf(s.charAt(i)));
		} else {
			return "";
		}
	}
}
