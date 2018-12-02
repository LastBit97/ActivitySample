package com.example.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactsActivity extends AppCompatActivity {
    List<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        DataAdapter adapter = new DataAdapter(this, personList);
        recyclerView.setAdapter(adapter);
    }

    private void setPersonList(){
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
        personList.add(new Person("Юлия Дубровская", "79063100302", R.drawable.photo));
    }
}
