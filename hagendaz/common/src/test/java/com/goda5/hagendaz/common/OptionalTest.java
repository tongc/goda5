package com.goda5.hagendaz.common;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by tong on 09/05/2016.
 */
public class OptionalTest {
    @Test
    public void testOptional() {
        Optional<String> aa = Optional.of("abc");
        aa.ifPresent(getConsumer());
        Optional<String> bb = Optional.empty();
        bb.ifPresent(getConsumer());
    }

    Consumer<String> getConsumer() {
        return (s -> System.out.println(s));
    }
}
