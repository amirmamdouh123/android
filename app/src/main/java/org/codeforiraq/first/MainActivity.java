package org.codeforiraq.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public  class MainActivity extends AppCompatActivity {

    ImageView image;
    EditText name ;
    EditText pass;
    Button login,reset;
    TextView Sorry;
    static String s;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id();
login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(MainActivity.this,tani.class);

i++;

    if (name.getText().toString().equals("android") && pass.getText().toString().equals("1234")) {

        startActivity(intent);

    } else {
        Sorry.setVisibility(View.VISIBLE);
    }
    if (i==4){
        login.setEnabled(false);

    }


    }
});
reset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        name.setText("");
        pass.setText("");
    }
});

    }
   void  id (){
       image =findViewById(R.id.facebook);
name=findViewById(R.id.nam);
pass=findViewById(R.id.pass);
login=findViewById(R.id.log);
reset=findViewById(R.id.res);
Sorry=findViewById(R.id.Sorry);
    }
}