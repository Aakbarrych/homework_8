package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Hacker extends Hero{
    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HACKING);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if((RPG_Game.getRoundNumber()) % 2 == 0){
            int healthToGive = RPG_Game.random.nextInt(30);
            boss.setHealth(boss.getHealth() - healthToGive);
            heroes[2].setHealth(heroes[2].getHealth() + healthToGive);
        }
    }
}
