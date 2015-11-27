/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author zaqwer
 */

//Уровень противника будет подстраиваться под уровень героя
public interface IEnemy extends ICreature
{
    public void update();
}
