package com.example.eventbus;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by Anand on 15/10/2016.
 */

public class EventBusProvider {

    private static EventBus eventBus;

    public static EventBus provideEventBus() {
        if (eventBus == null) {
            eventBus = EventBus.builder()
                    .logNoSubscriberMessages(BuildConfig.DEBUG)
                    .sendNoSubscriberEvent(BuildConfig.DEBUG)
                    .build();
        }
        return eventBus;
    }
}
