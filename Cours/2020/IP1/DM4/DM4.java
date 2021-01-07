import java.util.*; // Pour pouvoir afficher les tableaux dans la console

class DM4 {

  // Les trois premieres fonctions sont deja declarees
  // Exercice 1: afficher
  public static void afficher(int[] tab) {}

  // Exercice 2: maximum
  public static int maximum(int[] tab) { return -1; }

  // Exercice 3 : decale
  public static int[] decale(int[] tab) {
    int[] arr = {};
    return arr;
  }
  
  // Exercice 4 : compteDifferent, a declarer soi-meme

  // =BONUS=
  // Exercice 5 : tri, a declarer soi-meme

  public static void main(String[] args) {

    // Tableaux de test
    int[] arr1 = {0, 1, 2, 3};
    int[] arr2 = {1, 2, 6, 5, 3, 12, 0};
    int[] arr3 = {1, 4, 3, 4, 2};
    int[] arr4 = {1, 1, 0, 2};
    int[] arr5 = {};

    // Tests pour l'exercice 1
    afficher(arr1);
    afficher(arr2);
    afficher(arr3);
    afficher(arr4);
    afficher(arr5);

    System.out.println("#===========================#");

    // Tests pour l'exercice 2
    test("maximum({0, 1, 2, 3})", 3, maximum(arr1));
    test("maximum({1, 2, 6, 5, 3, 12, 0})", 12, maximum(arr2));
    test("maximum({1, 4, 3, 4, 2})", 4, maximum(arr3));
    test("maximum({1, 1, 0, 2})", 2, maximum(arr4));
    test("maximum({})", 0, maximum(arr5));

    System.out.println("#===========================#");

    // Tests pour l'exercice 3
    test("decale({0, 1, 2, 3})", decale(arr1));
    test("decale({1, 2, 6, 5, 3, 12, 0})", decale(arr2));
    test("decale({1, 4, 3, 4, 2})", decale(arr3));
    test("decale({1, 1, 0, 2})", decale(arr4));
    test("decale({})", decale(arr5));

    /* Decommenter au fur et à mesure
    System.out.println("#===========================#");

    // Tests pour l'exercice 4
    test("compteDifferent({0, 1, 2, 3})", 4, compteDifferent(arr1));
    test("compteDifferent({1, 2, 6, 5, 3, 12, 0})", 7, compteDifferent(arr2));
    test("compteDifferent({1, 4, 3, 4, 2})", 4, compteDifferent(arr3));
    test("compteDifferent({1, 1, 0, 2})", 3, compteDifferent(arr4));
    test("compteDifferent({})", 0, compteDifferent(arr5));

    System.out.println("#===========================#");

    // Tests pour l'exercice 5
    test("sort({0, 1, 2, 3})", sort(arr1));
    test("sort({1, 2, 6, 5, 3, 12, 0})", sort(arr2));
    test("sort({1, 4, 3, 4, 2})", sort(arr3));
    test("sort({1, 1, 0, 2})", sort(arr4));
    test("sort({})", sort(arr5));
    */
  }

  // Ne pas modifier
  public static void test(String cmd, int ref, int val) {
    System.out.print(cmd + " -> " + Integer.toString(val) + " (expected " +
                     Integer.toString(ref) + ")");
    if (ref == val) {
      System.out.println(" [OK]");
    } else {
      System.out.println(" [ERREUR]");
    }
  }

  public static void test(String cmd, int[] val) {
    System.out.println(cmd + " -> " + Arrays.toString(val));
  }
}
