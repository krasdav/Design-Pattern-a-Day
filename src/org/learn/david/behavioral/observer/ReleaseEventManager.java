package org.learn.david.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReleaseEventManager {
    Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public ReleaseEventManager(String... releaseTypes) {
        for( String releaseType : releaseTypes){
            subscribers.put(releaseType, new ArrayList<>());
        }
    }

    public void subscribe(String releaseType, Subscriber subscriber){
        List<Subscriber> users = this.subscribers.get(releaseType);
        users.add(subscriber);
    }

    public void unsubscribe(String releaseType, Subscriber subscriber){
        List<Subscriber> users = this.subscribers.get(releaseType);
        users.remove(subscriber);
    }

    public void notify(String releaseType,String product ){
        List<Subscriber> users = this.subscribers.get(releaseType);
        for( Subscriber user : users){
            user.update(product);
        }
    }
}
