/*
Name: Jonathan Welham
Date: 10-5-19
 */

package Abilities;

import Monsters.Monster;

public interface Attack extends Ability{
    public abstract Integer attack(Monster attacker);
}
