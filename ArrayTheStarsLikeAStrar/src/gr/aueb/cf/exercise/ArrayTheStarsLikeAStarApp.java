package gr.aueb.cf.exercise;

import java.util.Scanner;

/**
 * Το πρόγραμμα εμφανίζει ένα menu μέσα απ΄το οποίο ο χρήστης επιλέγει
 * το μοτίβο με το οποίο θα εμφανιστούν οι χαρακτήρες "*", καθώς και τον
 * αριθμό τους.
 */
public class ArrayTheStarsLikeAStarApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayTheApp();
    }

    /**
     * Εμφανίζει το menu επιλογών.
     */
    public static void menuDisplay() {
        System.out.println();
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα.");
        System.out.print("Επιλέξτε μία από τις παραπάνω επιλογές: ");
    }

    public static void printsStarsHorizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printsStarsVertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void prints_nxn_Stars(int n) {
        for (int i = 1; i <= n; i++) {
            printsStarsHorizontal(n);
            System.out.println();
        }
    }

    public static void printStarsAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printsStarsHorizontal(i);
            System.out.println();
        }
    }

    public static void printStarsDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printsStarsHorizontal(i);
            System.out.println();
        }
    }

    public static int getUserChoice() {
        int userChoice = scanner.nextInt();
        return userChoice;
    }

    /**
     * Με βάση την επιλογή του χρήστη επιλέγεται μέσω της switch-case η μέθοδος που θα εμφανίσει τα "*" με τον
     * ανάλογο τρόπο.
     * @return
     */
    public static int manageUserChoice() {
        int userChoice = getUserChoice();
        switch (userChoice) {
            case 1:
                System.out.print("Επιλέξτε τον αριθμό των χαρακτήρων \"*\" που θέλετε να εμφανιστούν: ");
                printsStarsHorizontal(getUserChoice());
                break;
            case 2:
                System.out.print("Επιλέξτε τον αριθμό των χαρακτήρων \"*\" που θέλετε να εμφανιστούν: ");
                printsStarsVertical(getUserChoice());
                break;
            case 3:
                System.out.print("Επιλέξτε τον αριθμό των χαρακτήρων \"*\" που θέλετε να εμφανιστούν: ");
                prints_nxn_Stars(getUserChoice());
                break;
            case 4:
                System.out.print("Επιλέξτε τον αριθμό των χαρακτήρων \"*\" που θέλετε να εμφανιστούν: ");
                printStarsAsc(getUserChoice());
                break;
            case 5:
                System.out.print("Επιλέξτε τον αριθμό των χαρακτήρων \"*\" που θέλετε να εμφανιστούν: ");
                printStarsDesc(getUserChoice());
                break;
            case 6:
                System.out.println("Επιλέξατε έξοδο. Καλή συνέχεια...");
                break;
            default:
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ επιλέξτε ξανά.\n");
                break;
        }
        return userChoice;
    }

    /**
     * Καλεί μέσα σε μια do-while, σε πρώτη φάση, τη μέθοδο "menuDisplay()" και έπειτα την "manageUserChoice()",
     * έως ότου λάβει η μεταβλητή "userChoice" την τιμή "6" και το πρόγραμμα τερματίσει.
     */
    public static void displayTheApp() {
        int userChoice = 0;

        do {
            menuDisplay();
            userChoice = manageUserChoice();

        } while (userChoice != 6);
    }
}
