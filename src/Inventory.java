import java.util.ArrayList;
import java.util.Arrays;

public class Inventory extends Game {
    private ArrayList<Weapons> weaponsInv; // this also takes in sword as a subclass to weapons
    private String[] foodInv; // players can have a max of only 2 food/healing objects.

    private Sword voltageSword;

    public Inventory () {
        this.foodInv = new String[2];
        this.weaponsInv = new ArrayList<>();
        this.voltageSword = new Sword("Lancer", 10);
        weaponsInv.add(voltageSword);
    }
}
