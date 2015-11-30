/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamsungserver;

import interfaces.ICreature;
<<<<<<< HEAD
=======

>>>>>>> fb677f8f7bd19a7417d55ae7c806253ae11cd6a2
import java.util.ArrayList;

/**
 *
 * @author zaqwer
<<<<<<< HEAD
TODO:
* Добавить массив сражений проходящих в локации
 
 */
public class Location
{
    private int x,y; //Координаты локации на карте мира
    private ArrayList<ICreature> members;//Участники локации
    private ArrayList<Item> items;//Предметы, лежащие в локации
    
    private String name; //Имя локации, если есть
    
    public Location(int x, int y)
    {
        this.members = new ArrayList<>();
        this.items = new ArrayList<>();
        this.x = x;
        this.y = y;
    }
=======
 */
public class Location
{
	private ArrayList<Item> items;
	private ArrayList<ICreature> members;
	private int x,y;
	
	public ArrayList<Item> getItems()
	{
		return this.items;
	}
	
	public void addItem(Item item)
	{
		this.items.add(item);
	}
	
	public void removeItem(Item item)
	{
		this.items.remove(item);
	}
	
	public void addmember(ICreature member)
	{
		this.members.add(member);
	}
	
	public void removeMember(ICreature member)
	{
		this.members.remove(member);
	}
	
    public Location(int x, int y)
    {
    	this.setX(x);
    	this.setY(y);
    }
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public ArrayList<ICreature> getMembers() {
		return this.members;
	}

>>>>>>> fb677f8f7bd19a7417d55ae7c806253ae11cd6a2
}
