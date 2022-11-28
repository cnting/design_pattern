package day_72_interpreter;

import java.util.Map;

import day_72_interpreter.expression.Expression;
import day_72_interpreter.expression.OrExpression;

/**
 * Created by cnting on 2022/11/28
 * 我们假设自定义的告警规则只包含“||、&&、>、<、==”这五个运算符，
 * 其中，“>、<、==”运算符的优先级高于“||、&&”运算符，“&&”运算符优先级高于“||”。
 * 在表达式中，任意元素之间需要通过空格来分隔。
 */
public class AlertRuleInterpreter {
    private Expression expression;


    //例子:"key1 > 100 && key2 < 30 || key3 < 100 || key4 == 88"
    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}
