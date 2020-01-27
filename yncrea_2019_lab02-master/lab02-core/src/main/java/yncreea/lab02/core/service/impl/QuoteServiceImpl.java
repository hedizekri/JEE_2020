package core.service.impl;
import core.service.QuoteService;
import yncrea.security.SecureRandom;

public class QuoteServiceImpl implements QuoteService {
    private final SecureRandom random = new SecureRandom();

    //TODO inject a QuoteProvider


    @Override
    public String getRandomQuote(){
        //TODO Be Smart
        //TIP : nextInt(bound int)
        //TIP : rely on the QuoteProvider methods

        random.nextInt(quoteProvider.getNumberOfQuotes());
        return quoteProvider.getOneQuote(index);
    }
}
