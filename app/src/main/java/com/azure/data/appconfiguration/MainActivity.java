package com.azure.data.appconfiguration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.azure.data.appconfiguration.implementation.ClientConstants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Proving that the app is interacting with appconfiguration
        String randomStringFromAppConfig = ClientConstants.APP_CONFIG_TRACING_NAMESPACE_VALUE;
        TextView text = findViewById(R.id.mainText);
        text.setText(randomStringFromAppConfig);
    }
}