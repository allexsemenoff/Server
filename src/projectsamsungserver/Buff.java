/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamsungserver;

import interfaces.IBuff;
import interfaces.ICreature;

/**
 *
 * @author zaqwer
 */
public abstract class Buff implements IBuff
{
    private int power;
    private int duration;
    ICreature owner;
    public Buff(int power, int duration, ICreature owner)
    {
        this.power = power;
        this.duration = duration;
        this.owner = owner;
    }
    @Override
    public abstract void doEffect(ICreature target);

    @Override
    public void update()
    {
        this.duration -- ;
        if(this.duration == 0)
            this.destroy();
    }

    @Override
    public int getPower()
    {
        return this.power;
    }
    @Override
    public int getDuration()
    {
        return this.duration;
    }
    @Override
    public void destroy()
    {
        this.owner.removeBuff(this);
    }
}
