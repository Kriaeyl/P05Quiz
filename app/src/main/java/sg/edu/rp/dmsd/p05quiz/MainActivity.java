package sg.edu.rp.dmsd.p05quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1;
    CheckBox cb2;
    Button b1;
    Button b2;
    TextView num;
    Button sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.one);
        cb2 = findViewById(R.id.two);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        num = findViewById(R.id.textView3);
        sub = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int uwu = Integer.parseInt(num.getText().toString());
                if (uwu <= 0) {
                    Toast.makeText(MainActivity.this,"No. of pax should not be negative",Toast.LENGTH_LONG).show();
                }
                else {
                    uwu -= 1;
                    num.setText(uwu + "");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int uwu = Integer.parseInt(num.getText().toString());
                uwu += 1;
                num.setText(uwu+"");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((cb1.isChecked() && cb2.isChecked())) {
                    Toast.makeText(MainActivity.this, "Both Checkboxes Selected", Toast.LENGTH_LONG).show();
                }
                else if (!cb1.isChecked() && !cb2.isChecked()) {
                    Toast.makeText(MainActivity.this, "None Selected", Toast.LENGTH_LONG).show();

                }
                else if (Integer.parseInt(num.getText().toString()) <= 0) {
                    Toast.makeText(MainActivity.this, "Invalid pax; pax should be more than 0", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("unu", num.getText().toString());
                    intent.putExtra("lul", cb1.isChecked());
                    intent.putExtra("lul2", cb2.isChecked());
                    startActivity(intent);

                }

            }
        });


    }
}
