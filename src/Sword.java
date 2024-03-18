public class Sword extends Weapons {
    private boolean unbreakable;
    private boolean swordBroke;

    public Sword (String name, int uses, int damage, boolean unbreakable) {
        super(name, uses, damage);
        this.unbreakable = unbreakable;
    }

    public Sword (String name, int damage, boolean unbreakable) {
        super(name, damage);
        this.unbreakable = unbreakable;
    }

    public boolean isUnbreakable() {
        return unbreakable;
    }

    @Override
    public void setBrokeTrue () {
        if (getUses() == 0) {
            super.setBrokeTrue();
            System.out.println("Your sword, " + getName() + " broke!");
        }
    }
}
