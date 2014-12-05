package me.yawn.eos.event;

import me.yawn.eos.BaseLoader;
import me.yawn.eos.ui.Window;

/**
 * Created by yawn on 12/5/2014.
 */
public class SampleEvent extends Event {


    public SampleEvent(){
        super("Hello World");
    }

    @Override
    public void executeEventProcess(){
        onEnter();
        onLeave();
    }

    public void onEnter(){
        BaseLoader.getWindow().print(Window.ChatIdentifier.GAME, "Welcome to EOS Api v1!");
    }

    public void onLeave(){
        BaseLoader.getWindow().print(Window.ChatIdentifier.PLAYER, "Wow So Cool!");
    }

}
