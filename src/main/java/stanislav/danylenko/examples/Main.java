package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.behavior.observer.impl.Bank;
import stanislav.danylenko.examples.patterns.behavior.observer.impl.CurrencyProvider;

@Slf4j
public class Main {

    public static void main(String[] args) {
        CurrencyProvider provider = new CurrencyProvider();
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        provider.registerObserver(bank1);
        provider.registerObserver(bank2);

        provider.updateUsd(1.25);
        provider.updateEur(4.25);
    }

}
