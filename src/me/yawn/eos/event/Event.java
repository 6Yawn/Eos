package me.yawn.eos.event;

/**
 * Created by yawn on 12/5/2014.
 */
public abstract class Event {

    public String getName() {
        return Name;
    }

    private String Name;

    public Event(final String NAME){
        this.Name = NAME;
        EventManager.getEventList().put(this, true);
    }

    public abstract void executeEventProcess();

}
