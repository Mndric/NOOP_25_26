package pckg_VJ_Z3;

import java.util.Scanner;

public class SimGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SUPERHERO GAME ===");
        System.out.println("Enter name of superhero: ");
        String heroName = sc.nextLine();
        SuperHero hero = new SuperHero(heroName);
        boolean playing = true;

        while (playing) {
            System.out.println("=== MAIN MENU ===");
            System.out.println("1. Dislay Hero Status");
            System.out.println("2. Use current abillity");
            System.out.println("3. Level up");
            System.out.println("4. Exit");

            System.out.println("Choose an option (1-4): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    hero.displayStatus();
                    break;
                case 2:
                    hero.currentAbility();
                    break;
                case 3:
                    hero.levelUp();
                    break;
                case 4:
                    System.out.println("Thanks for playing!");
                    playing = false;
                    break;
                default:
                    System.out.println("Choose a valid option from 1 to 4!");
            }
        }
    }
}
