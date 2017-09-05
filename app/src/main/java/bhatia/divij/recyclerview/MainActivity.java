package bhatia.divij.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
    ArrayList<College> colleges=new ArrayList<>();
    Adapt adapt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView)findViewById(R.id.rv);
        adapt=new Adapt(colleges);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapt);
        generateColleges();

    }
    public void generateColleges()
    {
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Adity","Andoid"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));

        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));

        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));

        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));
        colleges.add(new College("Aditya","Android"));

        adapt.notifyDataSetChanged();
    }
}
