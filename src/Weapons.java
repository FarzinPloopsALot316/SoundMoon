public class Weapons {
    private String name;
    private int uses;
    private int damage;
    private boolean broke;
    public Weapons (String name, int uses, int damage) {
        this.name = name;
        this.uses = uses;
        this.damage = damage;
        this.broke = false;
    }

    public Weapons (String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void useOnce () {
        uses--;
    }

    public void setBrokeIfSo() {
        if (uses == 0) {
            broke = true;
            System.out.println("Your " + name + " broke!");
        }
    }
    public void setBrokeTrue () {
        broke = true;
    }

    public String getName() {
        return name;
    }

    public int getUses() {
        return uses;
    }
    public int getDamage() {
        return damage;
    }

    public boolean getBroke() {
        return broke;
    }
}
