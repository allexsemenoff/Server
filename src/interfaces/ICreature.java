/*
Некое абстрактное существо, которое может оказаться прекрасным слизнем или богомерзким огром

Существо может бить, может не бить. Ходит по локациям и собирает весь разбросаный по ним хлам.
<<<<<<< HEAD
Уровень существа подстраивается под уровень героя, с которым оно столкнулось

TODO:
    Отдельные массивы для разных типов баффов:
        Атаки
        Защиты
        ...
*/
package interfaces;

import projectsamsungserver.Item;
import projectsamsungserver.Location;

public interface ICreature
{
    public void pickUp(Item item);//Выкинуть предмет в локацию
    public void drop(Item item);//Подобрать предмет из локации
    public void addBuff(IBuff buff);//Работа баффов
    public void updateBuffs();//Обновление состояния баффов
    public void removeBuff(IBuff buff);
    public void attack();//ОТАКА ПЫЩЬ ПЫЩЬ. При атаке действуют атакующие баффы
    public void takeDamage(int damage);//Получение урона. Можно реализовать через heal, но так нагляднее. При получении урона действуют защитные баффы.
    public void setTarget(ICreature target);//Выбрать цель для просвящения
    public ICreature getTarget();//Получить цель
    public boolean isAlive();//Проверочка жизнеспособности существа
    public void doSomeShit();//Основная жизненная цель существа(Функция действия)
    public void goToLocation(Location location);//Переход по локациям
    public Location getLocation();//Получить текущую локацию существа
    public void heal(int heal);
=======
*/
package interfaces;

import java.util.ArrayList;

import projectsamsungserver.Location;
import projectsamsungserver.Item;

public interface ICreature
{
    public ArrayList<Item> getInventory();       //Получить инвентарь
    public void grabItem(Item item);             //Поднять предмет из локации
    public void dropItem(Item item);             //Выкинуть предмет в локацию
    public void attack();                        //Просвящение цели в свою веру
    public void setTarget(ICreature target);     //Выбрать цель для просвящения
    public ICreature getTarget();                //Получить цель
    public boolean isAlive();                    //Проверочка жизнеспособности существа
    public void doSomeShit();                    //Основная жизненная цель существа(Функция действия)
    public void goToLocation(Location location);//Переход по локациям
    public Location getLocation();              //Получить текущую локацию существа
    public void heal(int heal);                  //Пополнение здоровья
    public ArrayList<IBuff> getBuffs();		//Получить список баффов, наложенных на персонажа
    public void updateBuffs();					//Обновить длительность/прочие атрибуты баффов и в случае окончания длительности снять их
    public void takeDamage(int damage);//Получить урон
>>>>>>> fb677f8f7bd19a7417d55ae7c806253ae11cd6a2
}
