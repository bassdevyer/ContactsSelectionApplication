package com.example.android.contactsselectionapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ContactIntentActivity extends AppCompatActivity {

    private final int PHONE = 0;
    private final int WEBSITE = 1;
    private ListView intentListView;
    private ArrayAdapter<String> adapter;
    private List<ContactObject> contactsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Sets the activity's UI
        setContentView(R.layout.activity_contact_intent);
        // Inflate the view
        intentListView = (ListView) findViewById(R.id.listView1);

        // Fill the ArrayList with few objects to test your application then create a new ArrayAdapter
        // instance to bind it to the ArrayList
        // Initialize the list and add item
        contactsList = new ArrayList<>();
        contactsList.add(new ContactObject("Android One", "111-1111-1111", "www.androidATC.com"));
        contactsList.add(new ContactObject("Android Two", "222-2222-2222", "www.androidATC.com"));
        contactsList.add(new ContactObject("Android Three", "333-3333-3333", "www.androidATC.com"));
        contactsList.add(new ContactObject("Android Four", "444-4444-4444", "www.androidATC.com"));

        List<String> listName = new ArrayList<>();
        for (int i = 0; i < contactsList.size(); i++) {
            listName.add(contactsList.get(i).getName());
        }
        // Initialize the ArrayAdapter object
        adapter = new ArrayAdapter<>(ContactIntentActivity.this, android.R.layout.simple_list_item_1, listName);

        // Set the adapter of the ListView
        intentListView.setAdapter(adapter);

        intentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ContactIntentActivity.this, ContactPageActivity.class);
                i.putExtra("Object", contactsList.get(position));
                startActivityForResult(i, 0);
            }
        });

    }

}
