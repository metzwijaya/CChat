package com.example.andre.cchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // bkin splash screen
        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    // memunculkan welcome screen selama 3 detik
                    sleep(3000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

                // screen mana setelah splash screen
                finally
                {
                    Intent mainIntent = new Intent(WelcomeActivity.this, MainActivity.class);
                    startActivity(mainIntent);
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }
}
