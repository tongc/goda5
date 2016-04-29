package com.goda5.hagendaz.common;

import org.junit.Test;
import rx.Observable;
import rx.observables.BlockingObservable;

import java.util.concurrent.ExecutionException;

/**
 * Created by tong on 29/04/2016.
 */
public class ReactJavaTest {
    @Test
    public void testReact() throws ExecutionException, InterruptedException {
        BlockingObservable observable = Observable.just("sync data", "sync data2", "sync data3").toBlocking();
        System.out.println(observable.last());
        System.out.println(observable.first());
        System.out.println(observable.firstOrDefault("test"));
        System.out.println(observable.toFuture().isDone());
        System.out.println(observable.toFuture().get());
    }
}


