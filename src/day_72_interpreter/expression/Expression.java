package day_72_interpreter.expression;

import java.util.Map;

/**
 * Created by cnting on 2022/11/28
 */
public interface Expression {
    boolean interpret(Map<String,Long> stats);
}
