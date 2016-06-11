package com.goda5.hagendaz.common;

import com.google.common.base.Optional;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tong on 11/06/2016.
 */
public class GuavaOptional {
    @Test
    public void testOptional() {
        assertThat(Optional.fromNullable(null).or("test"), is("test"));
        assertThat(Optional.fromNullable(null).transform((val) -> String.valueOf(val)).or("test"), is("test"));
        assertThat(Optional.fromNullable("test").transform((val) -> "test1").or("test2"), is("test1"));
    }
}
