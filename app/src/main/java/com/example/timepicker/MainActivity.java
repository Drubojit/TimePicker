package com.example.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TimePicker t1;
    Button b1;
    TextView text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TimePicker)findViewById(R.id.timepicker);
        t1.setIs24HourView(true);
        b1=(Button)findViewById(R.id.timebutton);
        text=(TextView) findViewById(R.id.timeshow);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
         String time=t1.getCurrentHour()+":"+t1.getCurrentMinute();
         text.setText(time);
    }
}
