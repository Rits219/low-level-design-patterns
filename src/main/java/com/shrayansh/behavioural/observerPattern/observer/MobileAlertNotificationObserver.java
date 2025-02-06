package com.shrayansh.behavioural.observerPattern.observer;

import com.shrayansh.behavioural.observerPattern.observable.StockObservable;

public class MobileAlertNotificationObserver implements NotificationAlertObserver {
    StockObservable observable;

    public MobileAlertNotificationObserver(StockObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("mobile notification with" + observable);
    }
}
