package mbill.khandelwal.harsh.m_bill;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class payout extends AppCompatActivity {
    Bundle bundle;
    TextView tv1,tv2,tv3;
    Button b1,b2,b3;
    int amount,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payout);

        b3=(Button)findViewById(R.id.button27);
        b1=(Button)findViewById(R.id.button25);

        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView7);
        tv3=(TextView)findViewById(R.id.textView9);


        bundle=getIntent().getExtras();
        final String products=bundle.getString("s");
        final String amount=bundle.getString("a");
        final String customer_name=bundle.getString("r");
        final String company_name=bundle.getString("p");

        //final String cooldrinkproducts=bundle.getString("q");
        // final String amountcooldrink=bundle.getString("w");

        // Toast.makeText(getApplicationContext(),""+s,Toast.LENGTH_SHORT).show();

        // c = Integer.parseInt(amounthotdrink);
        //  d = Integer.parseInt(amountcooldrink);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv2.setMovementMethod(new ScrollingMovementMethod());
                tv1.setText("The Products Are : ");
                tv2.setText(products);
                tv3.setText("Total= Rs "+amount);
                b3.setVisibility(View.VISIBLE);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String to="abhishek@gmail.com";
                String subject="Invoice";
                String message=products+"\n\nTotal=Rs "+amount;

                Intent email=new Intent(Intent.ACTION_SEND);

                email.setData(Uri.parse("mailto:"));
                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_EMAIL,"");
                email.putExtra(Intent.EXTRA_CC,"");
                email.putExtra(Intent.EXTRA_SUBJECT,"Invoice");
                email.putExtra(Intent.EXTRA_TEXT,"COMPANY/STORE NAME : "+customer_name+"\n\nCustomer Name : "
                        + company_name+"\n\nPRODUCT LIST: \n"+products+"\n\n\n"+"Total = Rs "+amount);
                startActivity(Intent.createChooser(email, "Send email"));

            }
        });
    }
}

