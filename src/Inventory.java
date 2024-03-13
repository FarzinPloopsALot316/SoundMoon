import java.util.ArrayList;
import java.util.Arrays;

public class Inventory extends Game {
    private ArrayList<Weapons> weaponsInv; // this also takes in sword as a subclass to weapons
    private String[] foodInv; // players can have a max of only 3 food/healing objects.

    public Inventory () {
        this.foodInv = new String[3];
        this.weaponsInv = new ArrayList<>();
        Sword voltageSword = new Sword("Lancer", 10);
        weaponsInv.add(voltageSword);

    }

}
