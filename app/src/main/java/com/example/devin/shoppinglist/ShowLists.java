package com.example.devin.shoppinglist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ShowLists extends AppCompatActivity {

    private Spinner spinner;
    private ListofLists lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lists);

        //ADD THIS CODE TO READ LIST OF LISTS FROM TEXT FILE
        //lists =

        addItemsOnSpinner(lists);
        addListenerOnSpinnerItemSelection();
    }

    public void addItemsOnSpinner(ListofLists l) {
        ArrayList<String> list = l.toArrayList();
        spinner = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner = (Spinner) findViewById(R.id.spinner2);
        //spinner.setOnItemSelectedListener(/* Enter code here to show the contents of the shopping list selected */);
        //
    }
}
