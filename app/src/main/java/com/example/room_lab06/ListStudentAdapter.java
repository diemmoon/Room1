package com.example.room_lab06;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListStudentAdapter extends BaseAdapter {
    private Context context;
    private List<Student>  list;
    private int layout;

    public ListStudentAdapter(Context context, List<Student> list, int layout) {
        this.context = context;
        this.list = list;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return list.get(position).getId();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) { convertView = LayoutInflater.from(context).inflate(layout, parent, false);

        TextView tvName = convertView.findViewById(R.id.tvName);
        tvName.setText(list.get(position).getName());

        tvName.setText(list.get(position).getName());



        return convertView;
    }
}
