package com.azure.data.appconfiguration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.azure.data.appconfiguration.implementation.ClientConstants;
import com.azure.data.appconfiguration.samples.appconfiguration.HelloWorld;
import com.azure.data.appconfiguration.samples.appconfiguration.*;
import com.azure.data.appconfiguration.samples.appconfiguration.ReadRevisionHistory;
import com.azure.data.appconfiguration.samples.appconfiguration.ReadRevisionHistoryAsync;
import com.azure.data.appconfiguration.samples.appconfiguration.SecretReferenceConfigurationSettingSample;
import com.azure.data.appconfiguration.samples.appconfiguration.SecretReferenceConfigurationSettingSampleAsync;
import com.azure.data.appconfiguration.samples.appconfiguration.WatchFeature;
import com.azure.data.appconfiguration.samples.appconfiguration.WatchFeatureAsync;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Proving that the app is interacting with appconfiguration
        String randomStringFromAppConfig = ClientConstants.APP_CONFIG_TRACING_NAMESPACE_VALUE;
        String[] connectionString = {"[Insert Connection String Here]"};

        HelloWorld.main(connectionString);
        try {
            WatchFeatureAsync.main(connectionString);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WatchFeature.main(connectionString);
        try {
            SecretReferenceConfigurationSettingSampleAsync.main(connectionString);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SecretReferenceConfigurationSettingSample.main(connectionString);
        ReadRevisionHistoryAsync.main(connectionString);
        ReadRevisionHistory.main(connectionString);
        ReadOnlySampleAsync.main(connectionString);
        ReadOnlySample.main(connectionString);
        //ProxyOptionsSample.main(connectionString); // HostName??
        //PipelineSample.main(connectionString); // Error 412
        // Missing: AadAutentication, ConfiguarationSets, ReadMeSamples
        try {
            ListSnapshotsAsync.main(connectionString);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ListSnapshots.main(connectionString);
        try {
            HelloWorldAsync.main(connectionString);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            FeatureFlagConfigurationSettingSampleAsync.main(connectionString);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        FeatureFlagConfigurationSettingSample.main(connectionString);
        try {
            CreateSnapshotAsync.main(connectionString);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        CreateSnapshot.main(connectionString);
        try {
            ConditionalRequestAsync.main(connectionString);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ConditionalRequest.main(connectionString);


        TextView text = findViewById(R.id.mainText);
        text.setText(randomStringFromAppConfig);
        Log.i("Tests", randomStringFromAppConfig);
    }
}