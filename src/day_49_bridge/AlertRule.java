package day_49_bridge;

import java.util.HashMap;
import java.util.Map;

public class AlertRule {

    private Map<String, Rule> apiRules = new HashMap<>();

    public Rule getMatchedRule(String api) {
        return apiRules.get(api);
    }


    public static class Rule {
        public int getMaxErrorCount() {
            return 1;
        }

        public int getMaxTimeoutTps(){
            return 1;
        }

        public int getMaxTps(){
            return 1;
        }
    }
}
