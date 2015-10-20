package com.example.kyurim.q_button;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View v){
        // logcat
        Log.d("Q-RIM", "Button1 was clicked");

        Context context = getApplicationContext();
        CharSequence text = "Logcat output sent";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void outputToast(View v){

//       Log.d("Q-RIM", "Button2 was clicked");
        Context context = getApplicationContext();
        CharSequence text = "¯\\_(ツ)_/¯";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}




