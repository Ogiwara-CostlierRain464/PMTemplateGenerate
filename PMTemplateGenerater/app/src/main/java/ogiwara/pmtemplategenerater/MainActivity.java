package ogiwara.pmtemplategenerater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.finish);
        assert btn != null;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make object
                EditText Owser     = (EditText)findViewById(R.id.Owser);
                EditText PluginName     = (EditText)findViewById(R.id.PluginName);
                EditText Version     = (EditText)findViewById(R.id.Version);
                Spinner spinner = (Spinner)findViewById(R.id.API);
                // 選択されているアイテムのIndexを取得
                int idx = spinner.getSelectedItemPosition();
                // 選択されているアイテムを取得
                String strAPI = (String)spinner.getSelectedItem();

            String strOwser   = Owser.getText().toString();
                String strPluginName   = PluginName.getText().toString();
                String strVersion   = Version.getText().toString();
                Intent intent = new Intent(MainActivity.this, MyActivity.class);
                intent.putExtra("Owser",strOwser);
                intent.putExtra("PluginName",strPluginName);
                intent.putExtra("Version",strVersion);
                intent.putExtra("API",strAPI);
                startActivity(intent);
            }
        });
    }
}
