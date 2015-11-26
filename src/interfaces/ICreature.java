/*
Некое абстрактное существо, которое может оказаться прекрасным слизнем или богомерзким огром

Существо может бить, может не бить. Ходит по локациям и собирает весь разбросаный по ним хлам.
Уровень существа подстраивается под уровень героя, с которым оно столкнулось
*/
package interfaces;

public interface ICreature
{
    public void attack();
    public void setTarget(ICreature target);//Выбрать цель для просвящения
    public ICreature getTarget();//Получить цель
    public boolean isAlive();//Проверочка жизнеспособности существа
    public void doSomeShit();//Основная жизненная цель существа(Функция действия)
    public void goToLocation(ILocation location);//Переход по локациям
    public ILocation getLocation();//Получить текущую локацию существа
    
}
