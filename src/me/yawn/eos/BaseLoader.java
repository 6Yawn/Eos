package me.yawn.eos;

import me.yawn.eos.event.Event;
import me.yawn.eos.event.EventManager;
import me.yawn.eos.ui.Window;

import java.util.Map;

/**
 * Created by yawn on 12/5/2014.
 */
public class BaseLoader {

    public static Window getWindow() {
        return w;
    }

    private static Window w;

    public static void main(String[] arguments){
        new BaseLoader();
        while(EventManager.getEventList().size()>0){
           for(Map.Entry e : EventManager.getEventList().entrySet()){
                if(!(Boolean)e.getValue()==false){
                    Event event = (Event) e.getKey();
                    event.executeEventProcess();
                    e.setValue(false);
                    // EventManager.getEventList().remove(e);
                }
            }
        }
        System.exit(420);
    }

    public BaseLoader(){
        w = new Window("Eos v1");
        EventManager.registerSampleEvents();
    }
}
