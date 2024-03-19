public class Player {
    private int health;

    public Player () {
        this.health = 100;
    }

    public int getH () {
        return health;
    }

    public boolean addH (int h) { // h = 5 and health is like 97
        if (health == 100) {
            System.out.println(ConsoleUtility.YELLOW + "You are already at full health (100 health).");
            return false;
        }
        if (100 - health <= h) {
            System.out.println(ConsoleUtility.YELLOW + "Restored to maximum health (100 health).");
            health = 100;
            return true;
        }
        health += h;
        System.out.println(ConsoleUtility.YELLOW + h + " health has been added (" + health + " health).");
        return true;
    }

    public void loseH (int L) {
        if (health - L < 0) {
            health = 0;
            System.out.println(ConsoleUtility.YELLOW + "You have lost " + L + " health (0).");
        } else {
            health -= L;
            System.out.println(ConsoleUtility.YELLOW + "You have lost " + L + " health (" + health + ").");
        }
    }

    public void fillH () {
        health = 100;
        System.out.println(ConsoleUtility.YELLOW + "Restored to maximum health (100 health).");
    }
}
