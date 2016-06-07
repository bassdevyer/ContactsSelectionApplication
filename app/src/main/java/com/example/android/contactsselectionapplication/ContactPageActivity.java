package com.example.android.contactsselectionapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ContactPageActivity extends AppCompatActivity {

    private final int PHONE = 0;
    private final int WEBSITE = 1;

    private TextView contactName;
    private TextView contactPhone;
    private TextView contactWebsite;
    private ContactObject contactObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_page);

        contactName = (TextView) findViewById(R.id.contactName);
        contactPhone = (TextView) findViewById(R.id.contactPhone);
        contactWebsite = (TextView) findViewById(R.id.contactWebsite);

    }
}
