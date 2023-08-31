package com.azure.data.appconfiguration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.azure.data.appconfiguration.implementation.ClientConstants;
import com.azure.data.appconfiguration.samples.appconfiguration.HelloWorld;
import com.azure.data.appconfiguration.samples.keyvault.keys.HelloWorld_KeyVault_keys;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Proving that the app is interacting with appconfiguration
        String randomStringFromAppConfig = ClientConstants.APP_CONFIG_TRACING_NAMESPACE_VALUE;
        try {
            HelloWorld_KeyVault_keys.main("https://android-key-vault.vault.azure.net/");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        TextView text = findViewById(R.id.mainText);
        text.setText(randomStringFromAppConfig);
        Log.i("Tests", randomStringFromAppConfig);
    }
}