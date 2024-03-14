import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Weapons> weaponsInv; // this also takes in sword as a subclass to weapons
    private Food[] foodInv; // players can have a max of only 2 food/healing objects.

    private Weapons voltageSword;

    public Inventory () {
        this.foodInv = new Food[2];
        for (int i = 0; i < foodInv.length; i++) {
            foodInv[i] = new Food("empty", 0);
        }
        this.weaponsInv = new ArrayList<>();
        this.voltageSword = new Sword("Lancer", 10);
        weaponsInv.add(voltageSword);
    }

    public String addToFoodInv (Food yummy) { //multiple of the same food can be added
        System.out.println("You found " + yummy + ".");
        Scanner scan = new Scanner(System.in);
        int userInput = -100;
        for (int i = 0; i < foodInv.length; i++) {
            if (foodInv[i].getName().equals("empty")) {
                foodInv[i] = yummy;
                System.out.println(ConsoleUtility.YELLOW + "| " + foodInv[0].getName() + " | " + foodInv[1].getName() + " |");
                return ConsoleUtility.YELLOW + yummy.getName() + " has been added to your food inventory.";
            }
        }
        System.out.println(ConsoleUtility.YELLOW + "Your inventory is full. Would you like to toss anything for replacement?");
        System.out.println("| " + foodInv[0].getName() + " | " + foodInv[1].getName() + " |");
        System.out.println("Enter 0 to toss " + foodInv[0].getName() + ", 1 to toss " + foodInv[0].getName() + ", or -1 to toss the item.");
        userInput = scan.nextInt();
        if (userInput == 0) {
            foodInv[0] = yummy;
            System.out.println("| " + foodInv[0].getName() + " | " + foodInv[1].getName() + " |");
            return ConsoleUtility.YELLOW + yummy.getName() + " has been added to your food inventory.";
        }
        if (userInput == 1) {
            foodInv[1] = yummy;
            System.out.println("| " + foodInv[0].getName() + " | " + foodInv[1].getName() + " |");
            return ConsoleUtility.YELLOW + yummy.getName() + " has been added to your food inventory.";
        }
        return ConsoleUtility.YELLOW + "You toss the " + yummy.getName() + " away.";
    }
}
