package day_49_bridge.notification;


import day_49_bridge.msg_sender.MsgSender;

import java.util.List;

public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }


    public abstract void notify(String msg);
}
