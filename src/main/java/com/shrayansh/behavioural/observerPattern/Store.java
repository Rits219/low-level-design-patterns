package com.shrayansh.behavioural.observerPattern;

import com.shrayansh.behavioural.observerPattern.observable.IphoneStockObservable;
import com.shrayansh.behavioural.observerPattern.observable.StockObservable;
import com.shrayansh.behavioural.observerPattern.observer.EmailAlertNotificationObserver;
import com.shrayansh.behavioural.observerPattern.observer.MobileAlertNotificationObserver;
import com.shrayansh.behavioural.observerPattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver observer1 = new MobileAlertNotificationObserver(iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertNotificationObserver(iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertNotificationObserver(iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.updateStockCount(10);
        System.out.println("if i increase again");
        iphoneStockObservable.updateStockCount(10);


    }
}
