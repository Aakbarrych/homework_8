package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.THUNDER);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int chanceOfBossMercy = RPG_Game.random.nextInt(5) + 1;
        if (chanceOfBossMercy == 1){ // шанс 1 к 5
            boss.setDamage(0);
        }
    }
}
