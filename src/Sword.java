public class Sword extends Weapons {
    private boolean unbreakable;
    private boolean swordBroke;

    public Sword (String name, int uses, int damage) {
        super(name, uses, damage);
        this.unbreakable = false;
    }

    public Sword (String name, int damage) {
        super(name, damage);
        this.unbreakable = true;
    }

    public boolean isUnbreakable() {
        return unbreakable;
    }

    @Override
    public void setBrokeTrue () {
        if (getUses() == 0) {
            setBrokeTrue();
            System.out.println("Your sword, " + getName() + " broke!");
        }
    }
}
