package day_49_bridge.msg_sender;

import java.util.List;

public class EmailMsgSender implements MsgSender {
    private List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String msg) {

    }
}
