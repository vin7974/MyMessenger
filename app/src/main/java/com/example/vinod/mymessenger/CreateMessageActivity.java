package com.example.vinod.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    public void onSendMessage(View view)
    {
        Intent intent = new Intent(this, ReceiveMessageAcitivity.class);
        startActivity(intent);

    }

}
