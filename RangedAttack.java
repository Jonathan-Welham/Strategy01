/*
Name: Jonathan Welham
Date: 10-5-19
 */

package Abilities;

import Monsters.Monster;

public class RangedAttack implements Attack {
    Monster attacker;

    public RangedAttack(Monster attacker){
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target){
        String message = attacker + " uses a ranged attack on " + target;
        System.out.printf(message);
        return attacker.getAgi() - target.getAgi();
    }
}
