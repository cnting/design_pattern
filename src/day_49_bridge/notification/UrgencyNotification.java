package day_49_bridge.notification;

import day_49_bridge.msg_sender.MsgSender;

public class UrgencyNotification extends Notification {
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String msg) {
        msgSender.send(msg);
    }
}
