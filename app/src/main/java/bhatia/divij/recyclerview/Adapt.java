package bhatia.divij.recyclerview;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by divij on 05-09-2017.
 */

public class Adapt extends RecyclerView.Adapter<Adapt.MyViewHolder> {

    public ArrayList<College> colleges;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.listrow,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
    College college=colleges.get(position);
        holder.name.setText(college.getName());
        holder.subject.setText(college.getSubject());
        holder.img.setImageResource(R.drawable.img);
    }

    @Override
    public int getItemCount() {
        return colleges.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView name,subject;
        public ImageView img;
        public MyViewHolder(View view)
        {
            super(view);
            name=(TextView)view.findViewById(R.id.name);
            subject=(TextView)view.findViewById(R.id.subject);
            img=(ImageView)view.findViewById(R.id.img);

        }
    }

    public Adapt(ArrayList<College> c)
    {
        colleges=c;
    }

}
