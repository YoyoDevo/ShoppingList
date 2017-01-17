package com.example.devin.shoppinglist;

import java.util.ArrayList;
import java.util.List;
import com.example.devin.shoppinglist.ShoppingList;
/**
 * file: ListofLists.java
 * Created by Devin on 1/15/2017.
 */

public class ListofLists {

    private String listName;
    private String timeCreated;
    private String creator;
    private ArrayList<ShoppingList> lists;

    public ListofLists(String listName, String creator) {
        lists = new ArrayList<ShoppingList>();;
    }

    public void addList(ShoppingList list) {
        lists.add(list);
    }

    public void deleteList(ShoppingList list) {
        lists.remove(list);
    }

    public String getListName() {
        return listName;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public String getCreator() {
        return creator;
    }

    public ArrayList<ShoppingList> getLists() {
        return lists;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setLists(ArrayList<ShoppingList> lists) {
        this.lists = lists;
    }

    public int getSize() {
        return lists.size();
    }

    public String getShoppingListAtIndex(int index) {
        String result = lists.get(index).getListName();
        return result;
    }

    public ArrayList<String> toArrayList() {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < lists.size(); i++) {
            result.add(getShoppingListAtIndex(i));
        }
        return result;
    }
}
