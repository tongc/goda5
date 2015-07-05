package com.goda5.hagendaz.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tong on 03/07/2015.
 */
public class MyRxJavaAdventure {
    final static Logger LOGGER = LoggerFactory.getLogger(MyRxJavaAdventure.class);
    public static void main(String[] args) {
        MyRxJavaAdventure a = new MyRxJavaAdventure();
        Observable<String> o = a.obs();

        new Thread(new Runnable() {
            @Override
            public void run() {
                o.subscribe(data -> LOGGER.info("DDD" + data));
            }
        }).start();

//        LOGGER.error(String.valueOf(o.isEmpty().toBlocking().first()));
//        LOGGER.warn(String.valueOf(o.cache().toBlocking().first()));
        new Thread(new Runnable() {
            @Override
            public void run() {
                o.subscribe(data -> LOGGER.info("EEE" + data));
            }
        }).start();

        Observable
                .just("doc1", "doc2", "doc3")
                .subscribe(document -> LOGGER.warn("Got: " + document));
    }

    public Observable obs() {
        Set<? extends Object> a = new HashSet<String>();

        return Observable.create((Subscriber<? super String> sub) -> {
            int i = 0;
            while(i<3) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ++i;
                LOGGER.info("emitted");
                sub.onNext("data");
            }
        });
    }
}
