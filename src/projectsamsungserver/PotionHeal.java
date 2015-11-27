/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamsungserver;

import interfaces.ICreature;
import interfaces.IUsable;

/**
 *
 * @author zaqwer
 */
public class PotionHeal extends Item implements IUsable
{
    private int effect;
    
    /**
     *
     * @param id
     * @param effect
     */
    public PotionHeal(int id,int effect)
    {
        super(id);
        this.effect = effect;
    }
    
    @Override
    public void use(ICreature creature)
    {
        creature.heal(this.effect);
    }
}
