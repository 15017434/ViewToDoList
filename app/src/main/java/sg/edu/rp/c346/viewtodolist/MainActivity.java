package sg.edu.rp.c346.viewtodolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> ToDoList = new ArrayList<ToDoItem>();
    //ArrayAdapter<ToDoItem> aaToDo;
    CustomAdapter caToDo = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = (ListView) findViewById(R.id.listViewToDo);
        ToDoItem item1 = new ToDoItem("MSA", "on 01/10/2016", true);
        ToDoList.add(item1);
        ToDoItem item2 = new ToDoItem("Go for haircut", "on weekend", false);
        ToDoList.add(item2);
        //aaToDo = new ArrayAdapter<ToDoItem>(this,
                //android.R.layout.simple_list_item_1, ToDoList);
        caToDo = new CustomAdapter(this, R.layout.row, ToDoList);
        //lvToDo.setAdapter(aaToDo);
        lvToDo.setAdapter(caToDo);



    }
}
