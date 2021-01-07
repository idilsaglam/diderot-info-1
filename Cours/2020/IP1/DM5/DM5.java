import java.util.Arrays;

public class DM5 {

    // Exercice 1
    static int[] samesign(int[] t1, int[] t2) {
        int[] s = {};
        return s;
    }

    // Exercice 2
    static int variance(int[] x) {
        return 0;
    }

    // Exercice 3
    static int[] fibonacci(int n) {
        int[] f = {};
        return f;
    }

    // Exercice 4
    static int[] crible(int n) {
        int[] c = {};
        return c;
    }

    public static void main(String[] args) {
        // Exercice 1
        testArray("samesign({1000,1,-1,1}, {-1,1,-1,-1000})", new int[] { -1, 1, 1, -1 },
                samesign(new int[] { 1000, 1, -1, 1 }, new int[] { -1, 1, -1, -1000 }));

        // Exercice 2
        testInt("variance({100,1,1,1})", 1837, variance(new int[] { 100, 1, 1, 1 }));

        // Exercice 3
        testArray("fibonacci(5)", new int[] { 0, 1, 1, 2, 3 }, fibonacci(5));

        // Exercice 4
        testArray("crible(10)", new int[] { 2, 3, 0, 5, 0, 7, 0, 0, 0 }, crible(10));
    }

    /*************************************************************/
    /* NE PAS MODIFIER */
    /*************************************************************/

    public static void testArray(String cmd, int[] exp, int[] val) {
        System.out.println(cmd + " == " + Arrays.toString(exp));
        if (!Arrays.equals(exp, val)) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }

    public static void testInt(String cmd, int exp, int val) {
        System.out.println(cmd + " == " + exp);
        if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
        }
    }
}
