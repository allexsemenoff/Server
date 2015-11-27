/*
Собственно, герой

Выполняет случайные действия в соответствии со своими потребностями и пожеланиями, творит добро и разрушения во имя своего бога
Цель игры - заставить своего героя построить храм своему богу из магического кирпича (Можно(нужно) грабить корованы)
Герой почти полностью автономен, можно направлять его с помощью божественных поджопников и пряников
1 храм = 1000 кирпичей
Герой умирает НАВСЕГДА, и богу надо набраться терпения и ждать, пока какой-нибудь неудачник не станет его поклонником
Героя можно бросить, тогда он может уйти к другому богу
Брошенного богом героя нельзя убить, только немного покалечить (из жалости)
Валюта - золотые монеты. На них герой может купить снаряжение, кирпичи для храма, побухать в таверне, прокачать навыки
TODO:
    Ссылка на бога
    Арсенал и гардероб
    Фракция(Хаос/Порядок)
        Хаос получает бонус к урону ночью (+ бонус к использованию проклятых предметов)
        Порядок получает бонус к урону днём (+ порядочный герой с бОльшей вероятностью выполнит повеление своего бога)
        + различные уникальные плюшки каждой фракции
    Классификация героя соответственно фракции:
        Хаос:
            Чернокнижник (Тёмный маг) - силён в магии(Ослабление/Дебаффы), сильно зависим от маны, мало хп, маленький урон, штраф к броне, штраф к оружию + способность призывать демонов
            Убийца - силён в бою, мало хп, большой урон, значительный бонус к оружию, штраф к броне
        Порядок:
            Инквизитор (Паладин) - силён в обороне, может в магию, небольшой урон в бою, бонус к броне, нет штрафа к оружию
            Рейнджер - силён в бою, мало хп, большой урон, небольшой бонус к оружию, нет штрафа к броне
        Универсальные:
            Воин - силён как в бою, так и в обороне, средний урон, среднее количество хп, нет штрафов
            Маг - силён в магии(Атака), сильно зависим от маны, нет урона в бою, нет штрафа к броне
    Дополнительные специализации у каждого класса(по 3 у каждого)
    Навыки героя, которые дейтсвуют пассивно, или применяются в зависимости ситуации и желания героя
*/
package projectsamsungserver;

import java.util.ArrayList;

import interfaces.IBuff;
import interfaces.ICreature;

public class Hero implements ICreature
{
	private ArrayList<IBuff> buffs; 
    private ArrayList<Item> inventory;
    private Location location;
    private String name;
    private ICreature target;
    private int base_damage, base_hp, base_armor; //Базовые значения без учёта баффов/вооружения/навыков. У магов также есть показатель маны
    private int damage, hp, armor;                //Конечные значения после всех модификаций
    private int damage_effect, armor_effect;      //Бонусные добавки
	@Override
	public ArrayList<Item> getInventory()
	{
		return this.inventory; 
	}
	@Override
	public void grabItem(Item item)
	{	 
		if(this.location.getItems().contains(item))
		{
			this.inventory.add(item);
			this.location.removeItem(item);
		}
	}
	@Override
	public void dropItem(Item item)
	{	 
		this.inventory.remove(item);
		this.location.addItem(item);
	}
	@Override
	public void attack() 
	{
		 	target.takeDamage(damage);
	}
	@Override
	public void setTarget(ICreature target) {
		 this.target = target;
		
	}
	@Override
	public ICreature getTarget() { 
		return this.target;
	}
	@Override
	public boolean isAlive()
	{
		 	if(this.hp > 0) return true;
		 	else return false;
	}
	@Override
	public void doSomeShit() {
		 
	}
	
	@Override
	public Location getLocation() {
		 return this.location;
	}
	@Override
	public void heal(int heal) {
		 this.hp += heal;
	}
	@Override
	public ArrayList<IBuff> getBuffs() {
		return this.buffs;
	}
	@Override
	public void updateBuffs() {
		 for(IBuff buff : this.buffs)
		 {
			buff.update(); 
		 }
	}
	@Override
	public void goToLocation(Location location) {
		if((Math.abs(this.location.getX() - location.getX()) <= 1 ) && (Math.abs(this.location.getY() - location.getY()) <= 1))
				{
			this.location = location;
				}
		
	}
	@Override
	public void takeDamage(int damage) {
		this.hp -= damage;		
	}
}
