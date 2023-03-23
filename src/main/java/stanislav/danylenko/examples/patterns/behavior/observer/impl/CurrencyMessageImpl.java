package stanislav.danylenko.examples.patterns.behavior.observer.impl;

import stanislav.danylenko.examples.patterns.behavior.observer.CurrencyMessage;

public class CurrencyMessageImpl implements CurrencyMessage {

    private final double usd;
    private final double eur;

    public CurrencyMessageImpl(double usd, double eur) {
        this.usd = usd;
        this.eur = eur;
    }

    @Override
    public double getUsd() {
        return usd;
    }

    @Override
    public double getEur() {
        return eur;
    }
}
