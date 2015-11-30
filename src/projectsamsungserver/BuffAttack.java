/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamsungserver;

import interfaces.ICreature;

/**
 *
 * @author zaqwer
 */
public class BuffAttack extends Buff
{
    
    public BuffAttack(int power, int duration, ICreature owner)
    {
        super(power, duration, owner);
    }
    @Override
    public void doEffect(ICreature target)
    {
        target.takeDamage(this.getPower());
    }
}
