/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamsungserver;

import interfaces.ICreature;
import java.util.ArrayList;

/**
 *
 * @author zaqwer
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
}
