package fr.wcs.appsimple;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkbox = (CheckBox) findViewById(R.id.checkbox);
        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editfirstname = (EditText) findViewById(R.id.firstname);
                EditText editlastname = (EditText) findViewById(R.id.lastname);
                Button button = (Button) findViewById(R.id.button);
                if (checkbox.isChecked()) {

                    editfirstname.setEnabled(true);
                    editlastname.setEnabled(true);
                    button.setEnabled(true);

                } else {

                    editfirstname.setEnabled(false);
                    editlastname.setEnabled(false);
                    button.setEnabled(false);

                }

            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editfirstname = (EditText) findViewById(R.id.firstname);
                EditText editlastname = (EditText) findViewById(R.id.lastname);
                if (editfirstname.getText().toString().isEmpty()
                        || editlastname.getText().toString().isEmpty()){

                    Context context = getApplicationContext();
                    CharSequence text = getResources().getString(R.string.refut);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
                else {

                    TextView textCongratulations = (TextView) findViewById(R.id.Congratulations);
                    textCongratulations.setText(getResources().getString(R.string.Congratulations)

                            +" " + editfirstname.getText().toString()
                                +" " + editlastname.getText().toString()
                    );

                }
            }
        });

    }
}
