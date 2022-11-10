package day_49_bridge;

import day_49_bridge.handler.ErrorAlertHandler;
import day_49_bridge.handler.TimeoutAlertHandler;
import day_49_bridge.handler.TpsAlertHandler;
import day_49_bridge.msg_sender.EmailMsgSender;
import day_49_bridge.msg_sender.TelephoneMsgSender;
import day_49_bridge.msg_sender.WechatMsgSender;
import day_49_bridge.notification.NormalNotification;
import day_49_bridge.notification.Notification;
import day_49_bridge.notification.SevereNotification;
import day_49_bridge.notification.UrgencyNotification;

import java.util.ArrayList;

public class ApplicationContext {
    private AlertRule alertRule;
    private Alert alert;

    public void initializeBeans() {
        //MsgSender和Notification是两个维度，它们可以定义多个实现，然后组合在一起
        TelephoneMsgSender telephoneMsgSender = new TelephoneMsgSender(new ArrayList<>());
        EmailMsgSender emailMsgSender = new EmailMsgSender(new ArrayList<>());
        WechatMsgSender wechatMsgSender = new WechatMsgSender(new ArrayList<>());

        UrgencyNotification urgencyNotification = new UrgencyNotification(telephoneMsgSender);
        SevereNotification severeNotification = new SevereNotification(wechatMsgSender);
        NormalNotification normalNotification = new NormalNotification(emailMsgSender);


        alertRule = new AlertRule();
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule, urgencyNotification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule, severeNotification));
        alert.addAlertHandler(new TimeoutAlertHandler(alertRule, normalNotification));
    }

    public Alert getAlert() {
        return alert;
    }

    private static final ApplicationContext instance = new ApplicationContext();

    private ApplicationContext() {
        initializeBeans();
    }

    public static ApplicationContext getInstance() {
        return instance;
    }
}
