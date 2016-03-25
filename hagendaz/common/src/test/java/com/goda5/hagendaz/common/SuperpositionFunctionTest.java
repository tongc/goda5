package com.goda5.hagendaz.common;

import org.junit.Test;
import rx.functions.Func1;

import java.util.Objects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by tong on 25/03/2016.
 */
public class SuperpositionFunctionTest {
    private boolean isSuperposition(Func1<Integer, Integer> func1) {
        boolean isLinear = true;
        if(func1.call(1) + func1.call(2) != func1.call(3)) {
            isLinear = false;
        }

        if(func1.call(-10) + func1.call(20) != func1.call(10)) {
            isLinear = false;
        }

        if(func1.call(12345) + func1.call(23456) != func1.call(35801)) {
            isLinear = false;
        }

        if(func1.call(123 * 10) != 123 * func1.call(10)) {
            isLinear = false;
        }
        return isLinear;
    }

    private boolean isSuperpositionStr(Func1<String, String> func1) {
        boolean isLinear = true;
        if(!Objects.equals(func1.call("abc") + func1.call("cde"), func1.call("abccde"))) {
            isLinear = false;
        }

        return isLinear;
    }


    @Test
    public void isSuperposition() {
        assertTrue(isSuperposition((a) -> a + a));
        assertFalse(isSuperposition((a) -> a + 5));
        assertFalse(isSuperposition((a) -> a ^ 2));
        assertTrue(isSuperposition((a) -> a * 10));
        assertTrue(isSuperpositionStr(""::concat));
    }


}
