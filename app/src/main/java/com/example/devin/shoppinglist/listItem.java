package com.example.devin.shoppinglist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Devin on 1/15/2017.
 */

public class listItem {

    private String item;
    private String timeCreated;
    private String creator;
    private boolean bought;

    public listItem(String name, String creator) {
        item = name;
        this.creator = creator;
        Date dateTime = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        timeCreated = df.format(dateTime);
    }
    
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }
}
