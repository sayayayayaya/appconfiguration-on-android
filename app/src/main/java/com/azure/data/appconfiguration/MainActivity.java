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

        // Sample main method calls
        // Comment out any call that you don't want

        //HelloWorld.main(connectionString);
        //WatchFeature.main(connectionString);
        SecretReferenceConfigurationSettingSample.main(connectionString);
        //ReadRevisionHistoryAsync.main(connectionString);
        //ReadRevisionHistory.main(connectionString);
        //ReadOnlySampleAsync.main(connectionString);
        //ReadOnlySample.main(connectionString);
        //ListSnapshots.main(connectionString);
        //FeatureFlagConfigurationSettingSample.main(connectionString);
        //CreateSnapshot.main(connectionString);
        //ConditionalRequest.main(connectionString);

        //ProxyOptionsSample.main(connectionString); // HostName??
        //PipelineSample.main(connectionString); // Error 412
        // Missing: AadAutentication, ConfiguarationSets, ReadMeSamples

        //try {
            //FeatureFlagConfigurationSettingSampleAsync.main(connectionString);
            //ConditionalRequestAsync.main(connectionString);
            //CreateSnapshotAsync.main(connectionString);
            //HelloWorldAsync.main(connectionString);
            //ListSnapshotsAsync.main(connectionString);
            //SecretReferenceConfigurationSettingSampleAsync.main(connectionString);
            //WatchFeatureAsync.main(connectionString);
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}

        TextView text = findViewById(R.id.mainText);
        text.setText(randomStringFromAppConfig);
        Log.i("Tests", randomStringFromAppConfig);
    }
}