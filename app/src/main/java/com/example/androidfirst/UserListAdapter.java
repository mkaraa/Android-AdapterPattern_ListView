package com.example.androidfirst;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class UserListAdapter extends BaseAdapter {

    List<UserModel> list;
    Context context;

    public UserListAdapter(List<UserModel> list, Context context){
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View layout = LayoutInflater.from(context).inflate(R.layout.layout, viewGroup,false);

        TextView name = layout.findViewById(R.id.name);
        TextView surname = layout.findViewById(R.id.surname);
        TextView age = layout.findViewById(R.id.age);
        TextView team = layout.findViewById(R.id.team);

        name.setText(list.get(i).getName());
        surname.setText((list.get(i).getSurname()));
        age.setText((list.get(i).getAge()));
        team.setText(list.get(i).getTeam());

        return layout;
    }
}
