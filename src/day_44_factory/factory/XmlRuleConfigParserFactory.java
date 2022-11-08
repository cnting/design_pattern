package day_44_factory.factory;

import day_44_factory.parser.IRuleConfigParser;
import day_44_factory.parser.XmlRuleConfigParser;

public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
