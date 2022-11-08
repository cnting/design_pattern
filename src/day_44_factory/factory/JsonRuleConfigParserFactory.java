package day_44_factory.factory;

import day_44_factory.parser.IRuleConfigParser;
import day_44_factory.parser.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
