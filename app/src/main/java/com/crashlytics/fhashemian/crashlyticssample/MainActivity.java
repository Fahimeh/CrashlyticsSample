package com.crashlytics.fhashemian.crashlyticssample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context=this;
        Button crashBtn=findViewById(R.id.crashBtn);
        crashBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Crashlytics.getInstance().crash();


                int a=0;
                double b=10/a;
                Toast.makeText(context, "b="+b, Toast.LENGTH_LONG).show();
            }
        });

    }
}
