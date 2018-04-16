package utfpr.josielfaleiros.com.analisador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MessageActivity extends AppCompatActivity {
    public static final String KEY_NOME = "NOME";
    public static final String KEY_OCCUPATION = "OCCUPATION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }
}
