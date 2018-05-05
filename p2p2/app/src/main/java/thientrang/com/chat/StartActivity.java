package thientrang.com.chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by THIEN TRANG on 05/05/2018.
 */

public class StartActivity extends AppCompatActivity {
    Button btn_go;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
        init();
        action();
    }

    private void action() {
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,ListPeers.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
        btn_go = (Button) findViewById(R.id.btn_go);
    }

}
