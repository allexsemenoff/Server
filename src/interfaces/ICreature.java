/*
Некое абстрактное существо, которое может оказаться прекрасным слизнем или богомерзким огром

Существо может бить, может не бить. Ходит по локациям и собирает весь разбросаный по ним хлам.
*/
package interfaces;

import java.util.ArrayList;
import projectsamsungserver.Item;

public interface ICreature
{
    public ArrayList<Item> getInventory();       //Получить инвентарь
    public void grabItem(Item item);             //Поднять предмет из локации
    public void dropitem(Item item);             //Выкинуть предмет в локацию
    public void attack();                        //Просвящение цели в свою веру
    public void setTarget(ICreature target);     //Выбрать цель для просвящения
    public ICreature getTarget();                //Получить цель
    public boolean isAlive();                    //Проверочка жизнеспособности существа
    public void doSomeShit();                    //Основная жизненная цель существа(Функция действия)
    public void goToLocation(ILocation location);//Переход по локациям
    public ILocation getLocation();              //Получить текущую локацию существа
    public void heal(int heal);                  //Пополнение здоровья
}
