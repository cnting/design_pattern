package day_72_interpreter.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by cnting on 2022/11/28
 */
public class AndExpression implements Expression {

    private List<Expression> expressionList = new ArrayList<>();

    public AndExpression(String strAndExpression) {
        String[] strExpressions = strAndExpression.split("&&");
        for (String strExpr : strExpressions) {
            if (strExpr.contains(">")) {
                expressionList.add(new GreaterExpression(strExpr));
            } else if (strExpr.contains("<")) {
                expressionList.add(new SmallerExpression(strExpr));
            } else if (strExpr.contains("==")) {
                expressionList.add(new EqualsExpression(strExpr));
            } else {
                throw new RuntimeException("Expression is invalid: " + strAndExpression);
            }
        }
    }

    public AndExpression(List<Expression> list) {
        this.expressionList.addAll(list);
    }


    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expression : expressionList) {
            if (!expression.interpret(stats)) {
                return false;
            }
        }
        return true;
    }
}
