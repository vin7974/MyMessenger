package com.example.vinod.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    public void onSendMessage(View view)
    {
        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, ReceiveMessageAcitivity.class);
        intent.putExtra(ReceiveMessageAcitivity.EXTRA_MESSAGE, messageText);
        // another messsage with different key word
        intent.putExtra("SampleKey", messageText);
        startActivity(intent);

    }

}
