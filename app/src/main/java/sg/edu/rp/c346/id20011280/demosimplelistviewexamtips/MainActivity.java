package sg.edu.rp.c346.id20011280.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] etArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        etArray = new String[5];
        etArray[0] = "Don't just read the code, code it as much as possible during each practical session";
        etArray[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        etArray[2] = "Prepare your template source code for each topic";
        etArray[3] = "Create a few empty Android projects to speed up your coding during the exam";
        etArray[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,etArray); // take in the data

        //array adapter for list view , binds the data source to the listview

        lvExamTips.setAdapter(adapter);



    }
}