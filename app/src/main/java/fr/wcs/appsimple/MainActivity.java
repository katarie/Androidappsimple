package fr.wcs.appsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

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
    }
}
