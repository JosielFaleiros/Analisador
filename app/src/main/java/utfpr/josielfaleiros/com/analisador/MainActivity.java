package utfpr.josielfaleiros.com.analisador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1, Menu.FIRST, Menu.FIRST, "About");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                // write your code here
                Toast msg = Toast.makeText(MainActivity.this, "Menu 1", Toast.LENGTH_LONG);
                msg.show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
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
