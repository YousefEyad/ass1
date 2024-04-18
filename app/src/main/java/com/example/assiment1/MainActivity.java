package com.example.assiment1;

import static com.example.assiment1.R.layout.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assiment1.R;


public class MainActivity extends AppCompatActivity {

    private ListView timelineListView;
    private TextView dateTextView, locationTextView, significanceTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        timelineListView = findViewById(R.id.timeline_list_view);
        String[] events = {"Event 1", "Event 2", "Event 3"};

        // Adapter for the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, events);
        timelineListView.setAdapter(adapter);
        timelineListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedEvent = parent.getItemAtPosition(position).toString();
              Intent intent = new Intent(MainActivity.this,MainActivity2.class);
               intent.putExtra("event_name", selectedEvent);
                startActivity(intent);
            }
        });

    }
}