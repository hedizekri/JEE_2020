public class Application {
    private QuoteService quoteService;

    public Application(final QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    public void printQuoteInConsole(){
        System.out.println(quoteService.getRandomQuote());
    }
}
