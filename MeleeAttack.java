/*
Name: Jonathan Welham
Date: 10-5-19
 */

package Abilities;

import Monsters.Monster;

public class MeleeAttack implements Attack {
    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target){
        String message = attacker + " uses a melee attack on " + target;
        System.out.printf(message);
        return attacker.getStr() - target.getDef();
    }
}
