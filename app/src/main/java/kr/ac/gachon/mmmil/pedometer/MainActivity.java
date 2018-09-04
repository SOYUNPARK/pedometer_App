package kr.ac.gachon.mmmil.pedometer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_Extractor = (Button)findViewById(R.id.btn_Extractor);
        btn_Extractor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(), ExtractorActivity.class);
                startActivity(intent);
            }
        });

        Button btn_Analyzer = (Button)findViewById(R.id.btn_Analyzer);
        btn_Analyzer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicked an Analyzer!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
