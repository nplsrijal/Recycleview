package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.ContactsAdapter;
import Model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        //create list of contacts
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla","9808025412",R.drawable.saugat,"abc@gmail.com,","KTM"));
        contactsList.add(new Contacts("Rajesh Hamal","9808025413",R.drawable.rajesh,"test@test.com","Lalitpur"));
        contactsList.add(new Contacts("Dahayang Rai","9808025414",R.drawable.dahayang,"now@admin.com","Bhaktapur"));
        contactsList.add(new Contacts("Bhuwan KC","90808025415",R.drawable.bhuwan,"one@one.com","Nepal"));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
