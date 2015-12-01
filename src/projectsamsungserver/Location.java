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
    private int x, y;

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
        this.x = x;
        this.y = y;
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public ArrayList<ICreature> getMembers()
    {
        return this.members;
    }

}
