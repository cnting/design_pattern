package day_72_interpreter.expression;

import java.util.Map;

/**
 * Created by cnting on 2022/11/28
 */
public class EqualsExpression implements Expression {

    private String key;
    private long value;

    public EqualsExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");
        if (elements.length != 3 || !elements[1].trim().equals("==")) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }

    public EqualsExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        if (!stats.containsKey(key)) {
            return false;
        }
        long statValue = stats.get(key);
        return statValue == value;
    }
}
