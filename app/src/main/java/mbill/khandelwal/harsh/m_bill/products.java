package mbill.khandelwal.harsh.m_bill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class products extends AppCompatActivity {

    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29;
    Button b;
    Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);
        c5 = (CheckBox) findViewById(R.id.checkBox5);
        c6 = (CheckBox) findViewById(R.id.checkBox6);
        c7 = (CheckBox) findViewById(R.id.checkBox7);
        c8 = (CheckBox) findViewById(R.id.checkBox8);
        c9 = (CheckBox) findViewById(R.id.checkBox9);
        c10 = (CheckBox) findViewById(R.id.checkBox10);
        c11 = (CheckBox) findViewById(R.id.checkBox11);
        c12 = (CheckBox) findViewById(R.id.checkBox12);
        c13 = (CheckBox) findViewById(R.id.checkBox13);
        c14 = (CheckBox) findViewById(R.id.checkBox14);
        c15 = (CheckBox) findViewById(R.id.checkBox15);
        c16 = (CheckBox) findViewById(R.id.checkBox16);
        c17 = (CheckBox) findViewById(R.id.checkBox17);
        c18 = (CheckBox) findViewById(R.id.checkBox18);
        c19 = (CheckBox) findViewById(R.id.checkBox19);
        c20 = (CheckBox) findViewById(R.id.checkBox20);
        c21 = (CheckBox) findViewById(R.id.checkBox21);
        c22 = (CheckBox) findViewById(R.id.checkBox22);
        c23 = (CheckBox) findViewById(R.id.checkBox23);
        c24 = (CheckBox) findViewById(R.id.checkBox24);
        c25 = (CheckBox) findViewById(R.id.checkBox25);
        c26 = (CheckBox) findViewById(R.id.checkBox26);
        c27 = (CheckBox) findViewById(R.id.checkBox27);
        c28 = (CheckBox) findViewById(R.id.checkBox28);
        c29 = (CheckBox) findViewById(R.id.checkBox29);

        b=(Button)findViewById(R.id.button100);

        bundle=getIntent().getExtras();

        final String cusn=bundle.getString("r");
        final String comn=bundle.getString("p");
        final String des=bundle.getString("r");



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int amount = 0;
                StringBuilder result=new StringBuilder();

                if (c1.isChecked()) {
                    result.append("\nFanta 450ml");
                    amount += 35;
                }
                if (c2.isChecked()) {
                    result.append("\nCoca Cola 450ml");
                    amount += 35;

                }
                if (c3.isChecked()) {
                    result.append("\nLimca 450ml");
                    amount += 35;
                }
                if (c4.isChecked()) {
                    result.append("\nMaza 250ml");
                    amount +=25;
                }
                if (c5.isChecked()) {
                    result.append("\nPepsi 450ml");
                    amount +=35;
                }
                if (c6.isChecked()) {
                    result.append("\nSprite 450ml");
                    amount +=35;
                }
                if (c7.isChecked()) {
                    result.append("\nThumps Up 450ml");
                    amount +=45;
                }
                if (c8.isChecked()) {
                    result.append("\nFrooti 250ml");
                    amount +=30;
                }
                if (c9.isChecked()) {
                    result.append("\nSoft Drint 2L");
                    amount += 85;
                }
                if (c10.isChecked()) {
                    result.append("\nSoft Drink 1L");
                    amount +=55;
                }
                if (c11.isChecked()) {
                    result.append("\nTea");
                    amount += 15;
                }
                if (c12.isChecked()) {
                    result.append("\nCoffee");
                    amount += 20;
                }
                if (c13.isChecked()) {
                    result.append("\nGreen Tea");
                    amount += 40;
                }
                if (c14.isChecked()) {
                    result.append("\nLemon Tea ");
                    amount += 30;
                }
                if (c15.isChecked()) {
                    result.append("\nSpecial Tea");
                    amount +=30;
                }
                if (c16.isChecked()) {
                    result.append("\nSpecial Coffee");
                    amount +=30;
                }
                if (c17.isChecked()) {
                    result.append("\nRedbull 100ml");
                    amount += 130;
                }
                if (c18.isChecked()) {
                    result.append("\nMonster 100ml");
                    amount += 170;
                }
                if (c19.isChecked()) {
                    result.append("\nMountain Dew 100ml");
                    amount += 145;
                }
                if (c20.isChecked()) {
                    result.append("\nLays 28gm ");
                    amount += 5;
                }
                if (c21.isChecked()) {
                    result.append("\nLays 64gm ");
                    amount += 10;
                }
                if (c22.isChecked()) {
                    result.append("\nLays 98gm");
                    amount += 20;
                }
                if (c23.isChecked()) {
                    result.append("\nUncle Chips 38gm");
                    amount += 5;
                }
                if (c24.isChecked()) {
                    result.append("\nUncle Chips 78gm ");
                    amount += 10;
                }
                if (c25.isChecked()) {
                    result.append("\nUncle Chips 128gm ");
                    amount += 20;
                }
                if (c26.isChecked()) {
                    result.append("\nKurkure 38gm ");
                    amount += 5;
                }
                if (c27.isChecked()) {
                    result.append("\nKurkure 78gm");
                    amount += 10;
                }
                if (c28.isChecked()) {
                    result.append("\nKurkure 138gm ");
                    amount += 20;
                }
                if (c29.isChecked()) {
                    result.append("\nHaldiram 0.5kg ");
                    amount += 145;
                }

                String s=String.valueOf(amount);
                String string=result.toString();

                Intent i=new Intent(products.this,payout.class);

                i.putExtra("s",string);
                i.putExtra("a",s);
                i.putExtra("p",cusn);
                i.putExtra("q",des);
                i.putExtra("r",comn);
                startActivity(i);
            }
        });

    }
}



