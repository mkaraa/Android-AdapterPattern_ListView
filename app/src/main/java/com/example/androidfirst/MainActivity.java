package com.example.androidfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<UserModel> userList;
    UserListAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        fillList();
    }

    public void fillList(){
        userList = new ArrayList<>();
        UserModel user1 = new UserModel("John","18","Black","Real Madrid");
        UserModel user2 = new UserModel("Kate","18","Vioere","Barcelona");

        userList.add(user1);
        userList.add(user2);

        adapter = new UserListAdapter(userList,this);
        listView.setAdapter(adapter);
    }

    void tanimla(){
        listView = findViewById(R.id.listView);
    }
}