package mbill.khandelwal.harsh.m_bill;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv1;
    RelativeLayout li;
    Button b;
    String c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1=(EditText)findViewById(R.id.editText2);
        et2=(EditText)findViewById(R.id.editText4);

        tv1=(TextView)findViewById(R.id.textView8);

        li=(RelativeLayout) findViewById(R.id.activity_main);
        b=(Button)findViewById(R.id.button);




        final SharedPreferences ob=getSharedPreferences("mm",0);
        et1.setText(ob.getString("mytext",""));


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String companyname=et1.getText().toString();

                String customername=et2.getText().toString();

                Intent j=new Intent(MainActivity.this,products.class);
                j.putExtra("p",companyname);
                j.putExtra("q",c);
                j.putExtra("r",customername);
                startActivity(j);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences ob=getSharedPreferences("mm",0);
        SharedPreferences.Editor obj=ob.edit();
        obj.putString("mytext",et1.getText().toString());

        obj.commit();
    }
    }

