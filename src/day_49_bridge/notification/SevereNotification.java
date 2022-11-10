package day_49_bridge.notification;

import day_49_bridge.msg_sender.MsgSender;

public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String msg) {
        msgSender.send(msg);
    }
}
