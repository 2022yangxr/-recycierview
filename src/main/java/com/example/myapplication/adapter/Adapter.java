package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.bean.Bean;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Bean>beanList;
    private LayoutInflater layoutInflater;
    private Context context;

    public Adapter(Context context,List<Bean>beanList){
        this.beanList=beanList;
        this.context=context;
        layoutInflater=LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return beanList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Bean bean=beanList.get(position);
        holder.title.setText(bean.getTitle());
        holder.content.setText(bean.getCont());
        holder.time.setText(bean.getTime());
        holder.picture.setImageResource(bean.getImg());

    }

    class ViewHolder extends  RecyclerView.ViewHolder{

        TextView title;
        TextView content;
        TextView time;
        ImageView picture;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.picture=itemView.findViewById(R.id.picture);
            this.title=itemView.findViewById(R.id.title);
            this.time=itemView.findViewById(R.id.time);
            this.content=itemView.findViewById(R.id.cont);
        }
    }
}
