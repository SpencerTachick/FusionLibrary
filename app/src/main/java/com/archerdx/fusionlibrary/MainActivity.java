package com.archerdx.fusionlibrary;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "errorMessages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fusionSearchButton = (Button)findViewById(R.id.fusionSearchButton);

        final QuiverDBHandler penis = new QuiverDBHandler(this);

        //Sends the fusion entered to the FusionList.java class upon clicking the Find Fusions button
        fusionSearchButton.setOnClickListener(
            new Button.OnClickListener(){
                public void onClick(View v){
                    Intent goToFusionList = new Intent(getApplication(), FusionList.class);

                    final EditText genesEntered = (EditText) findViewById(R.id.genesEntered);
                    String list_of_genes = genesEntered.getText().toString();
                    Log.i(TAG, list_of_genes);
                    goToFusionList.putExtra("genes", penis.getJoke(list_of_genes));
                    startActivity(goToFusionList);

                }
            }
        );
    }




}
