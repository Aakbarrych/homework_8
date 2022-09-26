package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int numbPlus = RPG_Game.random.nextInt(15);
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth() - (heroes[i].getDamage() + numbPlus));
        }
        System.out.println("Magic increased every ones damage to " + numbPlus);
    }
}
