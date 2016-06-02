package ogiwara.pmtemplategenerater;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_my);
        TextView Owser = (TextView) findViewById(R.id.showOwser);
        TextView PluginName = (TextView) findViewById(R.id.showPluginName);
        TextView Version = (TextView) findViewById(R.id.showVersion);
        TextView API = (TextView) findViewById(R.id.showAPI);
        Owser.setText(intent.getStringExtra("Owser"));
        PluginName.setText(intent.getStringExtra("PluginName"));
        Version.setText(intent.getStringExtra("Version"));
        API.setText(intent.getStringExtra("API"));
    }

}
