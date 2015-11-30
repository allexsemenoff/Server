/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamsungserver;

import interfaces.ICreature;
import java.util.ArrayList;

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

}
