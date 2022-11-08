package day_44_factory.factory;

import day_44_factory.parser.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
