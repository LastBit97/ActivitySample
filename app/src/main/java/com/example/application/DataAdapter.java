package com.example.application;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Person> personList;

    public DataAdapter(Context context, List<Person> personList ) {
        this.inflater = LayoutInflater.from(context);
        this.personList = personList;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder viewHolder, int i) {
        Person person = personList.get(i);
        viewHolder.photoView.setImageResource(person.getPhoto());
        viewHolder.nameView.setText(person.getName());
        viewHolder.phoneView.setText(person.getPhone());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView photoView;
        final TextView nameView, phoneView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photoView = (ImageView) itemView.findViewById(R.id.photo);
            nameView = (TextView) itemView.findViewById(R.id.name);
            phoneView = (TextView) itemView.findViewById(R.id.phone);;
        }
    }
}
