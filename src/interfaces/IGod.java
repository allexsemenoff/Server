/*
Способности бога
 */
package interfaces;

import projectsamsungserver.*;

/**
 *
 * @author zaqwer
 */
public interface IGod
{
    public void addHero(Hero hero);        //Сменить героя
    public void removeHero();               //Отказаться от своего героя
    public void sayToHero(String message);  //Глаголить своему герою
}
