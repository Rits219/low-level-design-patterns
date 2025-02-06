package com.shrayansh.behavioural.observerPattern.observable;

import com.shrayansh.behavioural.observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver obj);
    void remove(NotificationAlertObserver obj);
    void sendNotification();
    void updateStockCount(int StockCount);
    int getStockCount();
}
