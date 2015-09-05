package com.archerdx.fusionlibrary;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fusionSearchButton = (Button)findViewById(R.id.fusionSearchButton);

        //Sends the fusion entered to the FusionList.java class upon clicking the Find Fusions button
        fusionSearchButton.setOnClickListener(
            new Button.OnClickListener(){
                public void onClick(View v){
                    Intent goToFusionList = new Intent(getApplication(), FusionList.class);

                    final EditText genesEntered = (EditText) findViewById(R.id.genesEntered);
                    String list_of_genes = genesEntered.getText().toString();

                    goToFusionList.putExtra("genes", list_of_genes);
                    startActivity(goToFusionList);

                }
            }
        );
    }




}
