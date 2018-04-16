package utfpr.josielfaleiros.com.analisador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText inputName;
    private RadioGroup statusGroup;
    String name;
    String occupation;

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

    public void getTip (View view) {
        Intent intent = new Intent(this, MessageActivity.class);
        if (validData()) {
            intent.putExtra(MessageActivity.KEY_NOME, name);
            intent.putExtra(MessageActivity.KEY_OCCUPATION, occupation);
            startActivity(intent);
        }
    }

    private boolean validData() {
        name = inputName.getText().toString();
        if (name.equals("")) return false;

        RadioButton rbutton = (RadioButton)  statusGroup.findViewById(statusGroup.getCheckedRadioButtonId());
        if (rbutton == null) return false;
        occupation = rbutton.getText().toString();
        return true;
    }
}
