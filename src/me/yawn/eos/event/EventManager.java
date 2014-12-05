package me.yawn.eos.event;

import me.yawn.eos.event.Event;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by yawn on 12/5/2014.
 */
public class EventManager {

    public static HashMap<Event, Boolean> eventList = new LinkedHashMap<>();

    public static HashMap<Event, Boolean> getEventList() {
        return eventList;
    }

    /*
    But Yawn, How do I register my events!!!!!!
    simple yUng gods..
     */
    /*
    make ur own dont use mine btw
     */
    public static void registerSampleEvents(){
        new SampleEvent();
    }
    // ez.

}
