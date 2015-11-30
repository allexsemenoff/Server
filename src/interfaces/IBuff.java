/*
 	Баффы - эффекты, которые улучшают или ухудшают параметры персонажа. 
 	Некоторые баффы нельзя снять, например, пассивные эффекты умений
*/
package interfaces;

/**
 *
 * @author zaqwer
 */
public interface IBuff
{
    public int getPower();                  //С какой силой действует бафф
    public abstract void doEffect(ICreature target); //Действие баффа
    public void update();                   //Обновление длительности баффа
    public void destroy();
    //public boolean isRemovable();//Проверка на снимаемость баффа
	//public void apply(ICreature target);//Применить бафф на персонажа 
    //public void remove();//Снять бафф
    public int getDuration(); //Получить длительность баффа
}
