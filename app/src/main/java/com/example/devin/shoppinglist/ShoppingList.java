package com.example.devin.shoppinglist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * file: ShoppingList.java
 * Created by Devin on 1/15/2017.
 */

public class ShoppingList {

    private String listName;
    private String timeCreated;
    private String creator;
    private ArrayList<listItem> groceries;

    public ShoppingList(String listName, String creator) {
        this.listName = listName;
        this.creator = creator;
        groceries = new ArrayList<listItem>();
        Date dateTime = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        timeCreated = df.format(dateTime);
    }

    public void addItem(listItem item, ArrayList<listItem> groceries) {
        groceries.add(item);
    }

    public void removeItem(listItem item, ArrayList<listItem> groceries) {
        groceries.remove(item);
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ArrayList<listItem> getGroceries() {
        return groceries;
    }

    public void setGroceries(ArrayList<listItem> groceries) {
        this.groceries = groceries;
    }
}
