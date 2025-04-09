package chapter07._interface;

public class ParserTest {

    interface Parseable {
        void parse(String fileName);
    }

    static class ParseManager {
        public static Parseable getParser(String type) { //리턴 타입이 인터페이스의 타입이여도 무관하다.
            if (type.equals("XML")) {
                return new XmlParser();
            }
            return new HtmlParser();
        }
    }

    static class XmlParser implements Parseable {
        @Override
        public void parse(String fileName) {
            System.out.println(fileName + " - XML parsing completed.");
        }
    }

    static class HtmlParser implements Parseable {
        @Override
        public void parse(String fileName) {
            System.out.println(fileName + " - HTML parsing completed.");
        }
    }

    public static void main(String[] args) {
        Parseable parser = ParseManager.getParser("XML");
        parser.parse("document.xml");

        parser = ParseManager.getParser("HTML");
        parser.parse("document2.html");
    }

}
