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
<<<<<<< HEAD
    public int getPower();                  //С какой силой действует бафф
    public int getDuration();              //Сколько осталось работать баффу
    public abstract void doEffect(ICreature target); //Действие баффа
    public void update();                   //Обновление длительности баффа
    public void destroy();
=======
	public boolean isRemovable();//Проверка на снимаемость баффа
	public void apply(ICreature target);//Применить бафф на персонажа 
	public void remove();//Снять бафф
	public int getDuration(); //Получить длительность баффа
    public void update(); //Проверка окончания баффа
>>>>>>> fb677f8f7bd19a7417d55ae7c806253ae11cd6a2
}
