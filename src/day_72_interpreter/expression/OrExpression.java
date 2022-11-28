package day_72_interpreter.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by cnting on 2022/11/28
 */
public class OrExpression implements Expression {

    private List<Expression> expressionList = new ArrayList<>();


    public OrExpression(String strOrExpression) {
        String[] andExpressions = strOrExpression.split("\\|\\|");
        for (String andExpr : andExpressions) {
            expressionList.add(new AndExpression(andExpr));
        }
    }

    public OrExpression(List<Expression> list) {
        this.expressionList.addAll(list);
    }


    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expr : expressionList) {
            if (expr.interpret(stats)) {
                return true;
            }
        }
        return false;
    }
}
