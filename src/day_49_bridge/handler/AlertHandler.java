package day_49_bridge.handler;

import day_49_bridge.AlertRule;
import day_49_bridge.ApiStatInfo;
import day_49_bridge.notification.Notification;

public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;
    public AlertHandler(AlertRule rule,Notification notification){
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
