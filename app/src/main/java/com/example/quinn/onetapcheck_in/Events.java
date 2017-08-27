package com.example.quinn.onetapcheck_in;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Events extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);


        populateListView();

    }


    //Sample function that populates Event List
    public void populateListView() {

        //SCreate list of items
        String[] cars = {"Event 1","Event 2 ", "Event 3", "Event 4","Event 5 ",
                "Event 6", "Event 7","Event 8 ", "Event 9"};

        //Build Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.event_items, cars);


        //Configure the list view
        ListView listView = (ListView)findViewById(android.R.id.list);
        listView.setAdapter(adapter);

    }


}

