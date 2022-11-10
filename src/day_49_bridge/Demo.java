package day_49_bridge;

public class Demo {
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        apiStatInfo.setDurationOfSeconds(100);
        apiStatInfo.setTimeoutCount(200);
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
