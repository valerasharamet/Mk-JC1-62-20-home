package strings.additional;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        return 0;
    }
}
