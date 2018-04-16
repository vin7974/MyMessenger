package com.example.vinod.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class ReceiveMessageAcitivity extends Activity {

    public  static  final  String EXTRA_MESSAGE = "Static Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message_acitivity);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(messageText);
    }
}
