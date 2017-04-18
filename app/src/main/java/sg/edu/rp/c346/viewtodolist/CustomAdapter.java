package sg.edu.rp.c346.viewtodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 15017434 on 12/7/2016.
 */
public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> todoList;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        //Obtain the UI Element and assign to a variable
        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvDetail = (TextView) rowView.findViewById(R.id.textViewDetail);
        ImageView ivImpt = (ImageView) rowView.findViewById(R.id.imageViewImpt);


        //Obtain the to-do item based on the 'position'
        ToDoItem currentItem = todoList.get(position);

        //Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        tvDetail.setText(currentItem.getDetail());
        if (currentItem.isImportant() == true) {
            ivImpt.setImageResource(R.drawable.impt);
        }


        //return the View corresponding to the data at the specified position
        return rowView;
    }

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        todoList = objects;
    }

}
