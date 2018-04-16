package utfpr.josielfaleiros.com.analisador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText inputName;
    private RadioGroup statusGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.etName);
        statusGroup = findViewById(R.id.radioGroup);
    }

    public void cleanData (View view) {
        inputName.setText("");
        statusGroup.clearCheck();
    }
}
