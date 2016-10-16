package com.example.eventbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by Anand on 16/10/2016.
 */

public class NewActivity extends AppCompatActivity {

    private EventBus eventBus;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        eventBus = EventBusProvider.provideEventBus();
    }

    @Override
    protected void onStart() {
        super.onStart();
        eventBus.register(this);
    }

    @Override
    protected void onStop() {
        eventBus.unregister(this);
        super.onStop();
    }

    @Subscribe(sticky = true)
    public void onEvent(StickyEvent event) {
        textView = (TextView) findViewById(R.id.text_new);
        textView.setText(event.getStickyMessage());
    }
}
