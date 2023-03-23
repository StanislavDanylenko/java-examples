package stanislav.danylenko.examples.patterns.behavior.observer.impl;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.examples.patterns.behavior.observer.CurrencyMessage;
import stanislav.danylenko.examples.patterns.behavior.observer.Observable;
import stanislav.danylenko.examples.patterns.behavior.observer.Observer;

public class CurrencyProvider implements Observable {

    private double usd;
    private double eur;

    private final List<Observer> observers = new ArrayList<>();

    public void updateUsd(double usd) {
        if (this.usd != usd) {
            this.usd = usd;
            notifyObservers(new CurrencyMessageImpl(usd, eur));
        }
    }

    public void updateEur(double eur) {
        if (this.eur != eur) {
            this.eur = eur;
            notifyObservers(new CurrencyMessageImpl(usd, eur));
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(CurrencyMessage message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
