package kg.geektech.game.players;

public class Golem extends Hero{
    private int damageAbsorption;

    public Golem(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SHIELD);
    }

    public void setDamageAbsorption(int damageAbsorption) {
        this.damageAbsorption = damageAbsorption;
    }

    public int getDamageAbsorption() {
        return damageAbsorption;
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        setDamageAbsorption(boss.getDamage() / 5);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]){
                heroes[i].setHealth(heroes[i].getHealth() + getDamageAbsorption());
                this.setHealth(this.getHealth() - getDamageAbsorption());
            }
        }

    }

}
