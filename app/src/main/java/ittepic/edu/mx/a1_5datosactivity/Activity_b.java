package ittepic.edu.mx.a1_5datosactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_b extends AppCompatActivity {
    EditText edt_1;
    TextView txt_1;
    Button btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        edt_1=(EditText) findViewById(R.id.edt_1);
        edt_1.setText(getIntent().getExtras().getString("txt"));
        txt_1=(TextView) findViewById(R.id.txt_1);
        txt_1.setText(getIntent().getExtras().getString("edt"));
        btn_1=(Button) findViewById(R.id.button2);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzar(txt_1.getText().toString(),edt_1.getText().toString());
            }
        });
    }
    protected void lanzar(String txt, String edt){
        Intent i= new Intent(this,MainActivity.class);
        i.putExtra("txt",txt);
        i.putExtra("edt",edt);
        startActivity(i);
    }
}
