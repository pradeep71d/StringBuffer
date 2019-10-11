package com.example.string;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s1 = "Text string";
        StringBuffer stringBuffer = new StringBuffer(s1);//creating object of Stringbuffer and passing string in it.
        stringBuffer.append("making mutable with string buffer");//here we are appending/adding another string
        System.out.println(stringBuffer);
    }//String is immutable object as once it is created can not be changed whwre as string buffer and string builder are mutable that means they can be changed or appended
}
