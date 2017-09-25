package id.decoded.moeslim.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class mainActivity extends AppCompatActivity {

    Button btToasts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btToasts = (Button)findViewById(R.id.btnToasts);

        final Context context = getApplicationContext();
        final CharSequence text = "This is Toasts";
        final int duration = Toast.LENGTH_SHORT;

        btToasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }
}
