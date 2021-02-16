package strings.additional;



public class RegExSearchDecorator implements ISearchEngine  {
    private ISearchEngine searchE;


    public RegExSearchDecorator (ISearchEngine search) {
        super();
        this.searchE = search;
    }


    public long search(String text, String word) {

        return searchE.search(getTextIgnoreCase(text),word);
    }

    public String getTextIgnoreCase (String text) {
        if (this.searchE instanceof RegExSearch) {
            text = text.toLowerCase();
        }

        return text;
    }
}
