package sg.edu.rp.dmsd.p05quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = findViewById(R.id.dfirst);
        tv2 = findViewById(R.id.dsecond);
        Intent OwO = getIntent();
        double cost;
        if (OwO.getBooleanExtra("lul",true) == true) {
            tv1.append("One Way Trip");
            cost = 100 * Double.parseDouble(OwO.getStringExtra("unu"));
            tv2.append(" " + cost);
        }
        else {
            tv1.append("Round Trip");
            cost = 100 * Double.parseDouble(OwO.getStringExtra("unu")) * 2;
            tv2.append(" " + cost);
        }

    }
}
