public class TextBlockDemo {

    public static void main(String[] args) {
        String text = """
                This is
                a multi-line
                String""";
        System.out.println(text);
        System.out.println("================");
        showWhitespace(text);
        System.out.println("================");

        String textNewLineAtTheEnd = """
                This is
                a multi-line
                String
                """;
        System.out.println(textNewLineAtTheEnd);
        System.out.println("================");
        showWhitespace(textNewLineAtTheEnd);
        System.out.println("================");

        String textWithMoreWhitespace = """
                        This is
                        a multi-line
                        String
                """;
        System.out.println(textWithMoreWhitespace);
        System.out.println("================");
        showWhitespace(textWithMoreWhitespace);
        System.out.println("================");

        String textWithQuotes = """
                        This is "definitely"
                        a multi-line
                        String
                """;
        System.out.println(textWithQuotes);
        System.out.println("================");
        showWhitespace(textWithQuotes);
        System.out.println("================");

    }

    private static void showWhitespace(String string) {
        System.out.println(string.replaceAll(" ", ".").replaceAll("\n", "\\\\n\n"));
    }
}
