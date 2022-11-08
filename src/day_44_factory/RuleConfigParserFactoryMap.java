package day_44_factory;

import day_44_factory.factory.IRuleConfigParserFactory;
import day_44_factory.factory.JsonRuleConfigParserFactory;
import day_44_factory.factory.XmlRuleConfigParserFactory;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RuleConfigParserFactoryMap {
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return cachedFactories.get(type.toLowerCase());
    }
}
