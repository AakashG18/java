package com.example.array_sortinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.tv);
        // Initialize a new Integer array
        Integer[] marks = new Integer[]{29,19,79,59,79};
        Integer[] sorted = new Integer[0];


        tv.setText(tv.getText() + "\n\nInteger array : ");
        // Loop through the Integer array
        for(int i=0;i<marks.length;i++){
            tv.setText(tv.getText() + "" + marks[i]+ ", ");
        }

        // Sort the Integer array in ascending order
        Arrays.sort(marks);



        // Simply sort the Integer array in descending order
        Arrays.sort(marks,Collections.reverseOrder());

        tv.setText(tv.getText() + "\nInteger array (descending sorted): ");
        // Loop through the descending sorted Integer array
        for(int i=0;i<marks.length;i++){
            tv.setText(tv.getText() + "" + marks[i]+ ", ");

            sorted[i]=marks[i];
        }
        for(int i=0;i<marks.length;i++){
            if (sorted[i]>sorted[i+1])
                second= ;

        }
    }

}