public class Food extends Inventory {
    private String name;
    private int healthBuff;

    public Food (String name, int healthBuff) {
        this.name = name;
        this.healthBuff = healthBuff;
    }

    public int getHealthBuff () {
        return healthBuff;
    }

    public String getName () {
        return name;
    }
}
