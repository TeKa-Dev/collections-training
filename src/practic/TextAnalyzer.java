package practic;

class Analyse {
    public static void main(String[] args) {
        String[] keywords = {"купи", "реклама", "казино"};
        SpamAnalyzer sa = new SpamAnalyzer(keywords);
        NegativeTextAnalyzer nta = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tla = new TooLongTextAnalyzer(10);
        String text = "ыва ун пло ун купи  вр во аот :(";
        TextAnalyzer[] ta = {sa,nta,tla};
        Label l = Analyse.checkLabels(ta, text);
        System.out.println(l);
    }

//    метод запускает анализ текста на проверку и передает ему текст.
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer ta: analyzers
        ) {
            if (ta.processText(text) != Label.OK)return ta.processText(text);
        }
        return Label.OK;
    }
}

interface TextAnalyzer {
    Label processText(String text);
}
enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}
class SpamAnalyzer extends KeywordAnalyzer{
    private String[] keywords;
    public SpamAnalyzer(String[] keywords) {this.keywords = keywords;}
    @Override
    protected String[] getKeywords() {return keywords;}
    @Override
    protected Label getLabel() {return Label.SPAM;}
}
class NegativeTextAnalyzer extends KeywordAnalyzer{
    @Override
    protected String[] getKeywords() {return new String[]{":(", "=(", ":|"};}
    @Override
    protected Label getLabel() {return Label.NEGATIVE_TEXT;}
}
class TooLongTextAnalyzer implements TextAnalyzer{
    int maxLength;
    public TooLongTextAnalyzer(int maxLength) {this.maxLength = maxLength;}
    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) return Label.TOO_LONG;
    return Label.OK;
    }
}
abstract class KeywordAnalyzer implements TextAnalyzer{
    @Override
    public Label processText(String text) {
        for (String keyword: getKeywords()
             ) {
            if(text.contains(keyword)) {return getLabel();}
        }
        return Label.OK;
    }
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
}
