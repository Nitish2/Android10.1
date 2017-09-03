package com.example.hp.fragment_simpleaddition;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/**
 * Created by Hp on 01-09-2017.
 */

public class Simple_Addition extends Fragment { // Creating class and extends Fragment
    //Declaring variables
    EditText number1,number2;
    Button button;
    TextView textView;
    int addition;


    // View onCreateView() method is used to create and return the view associated with the fragment.
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        // Inflater is used to convert xml files into view objects
        View view = inflater.inflate(R.layout.activity_main, container, false);
        // Initializing objects by id.
        number1 = (EditText) view.findViewById(R.id.number1);
        number2 = (EditText) view.findViewById(R.id.number2);
        button = (Button) view.findViewById(R.id.button);
        textView = (TextView) view.findViewById(R.id.textView2);


        button.setOnClickListener(new View.OnClickListener() { // Creating On click Listener method
            @Override
            public void onClick(View view) {
                String stringNum1=number1.getText().toString();// Get first input from the edit text
                int integerNum1=Integer.parseInt(stringNum1);//Converting string into integer
                String stringNum2=number2.getText().toString();//Get second input from the edit text
                int integerNum2=Integer.parseInt(stringNum2);//Converting string into integer

                addition=integerNum1+integerNum2; // Adding the numbers
                //Converting the integer into string to show the addition
                textView.setText(Integer.toString(addition));
            }
        });
        return view; // Return statement

    }
}

