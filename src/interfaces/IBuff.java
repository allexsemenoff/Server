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
public interface IBuff
{
    public int getPower();                  //С какой силой действует бафф
    public int getDuration();              //Сколько осталось работать баффу
    public abstract void doEffect(ICreature target); //Действие баффа
    public void update();                   //Обновление длительности баффа
    public void destroy();
}
