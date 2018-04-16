package utfpr.josielfaleiros.com.analisador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {
    public static final String KEY_NOME = "NOME";
    public static final String KEY_OCCUPATION = "OCCUPATION";
    private static TextView tvTip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        tvTip = findViewById(R.id.tvTip);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString(KEY_NOME);
        String occupation = bundle.getString(KEY_OCCUPATION);
        String mensagem = "";
        if (occupation.equals(getString(R.string.rbEmployee)))
            mensagem = getString(R.string.str_congrats);
        if (occupation.equals(getString(R.string.rbUnemployed)))
            mensagem = getString(R.string.str_dont_worry);
        if (occupation.equals(getString(R.string.rbDoNotSeekOccupation)))
            mensagem = getString(R.string.str_good_life);
        tvTip.setText(mensagem + name + getString(R.string.mark_point));
    }

}
