package com.shrayansh.behavioural.observerPattern.observer;

import com.shrayansh.behavioural.observerPattern.observable.StockObservable;

public class EmailAlertNotificationObserver implements NotificationAlertObserver {
    StockObservable observable;

    public EmailAlertNotificationObserver(StockObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("email notification with" + observable);
    }
}
