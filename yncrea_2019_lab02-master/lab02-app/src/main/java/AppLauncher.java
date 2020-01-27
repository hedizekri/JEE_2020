import yncreea.lab02.core.service.impl.QuoteServiceImpl;
import yncrea.lab02.provider.CNFProvider;;



public class AppLauncher {
    public static void main(String[] args) {
        QuoteProvider provider = new CNFProvider();
        QuoteService service = new QuoteServiceImpl(provider);
        Application application = new Application(service);
        application.printQuoteInConsole();
    }
}
