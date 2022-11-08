package day_44_factory;

import day_44_factory.factory.IRuleConfigParserFactory;
import day_44_factory.parser.IRuleConfigParser;

public class RuleConfigSource {
    public String load() {
        String fileExtension = "json";
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(fileExtension);
        if (parserFactory == null) {
            throw new RuntimeException("file");
        }
        IRuleConfigParser parser = parserFactory.createParser();
        return parser.parse("ssss");
    }
}
