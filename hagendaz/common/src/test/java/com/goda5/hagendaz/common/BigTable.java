package com.goda5.hagendaz.common;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tong on 19/03/2016.
 */
public class BigTable {
    //multidimensional map
    Map<String, Object> dimension1 = Maps.newConcurrentMap();
    Map<String, Object> dimension2 = Maps.newConcurrentMap();
    Map<String, Object> dimension3 = Maps.newConcurrentMap();

    public void put(String key1, String key2, String key3, Object val) {
        dimension1.put(key1, val);
        dimension2.put(key2, val);
        dimension3.put(key3, val);
    }

    public Object getByDimension1(String key1) {
        return dimension1.get(key1);
    }

    public Object getByDimension2(String key2) {
        return dimension2.get(key2);
    }

    public Object getByDimension3(String key3) {
        return dimension3.get(key3);
    }

    @Test
    public void test() {
        BigTable bigTable = new BigTable();
        bigTable.put("1981-03-05", "green", "5cm", "a");
        bigTable.put("1981-03-06", "red", "8cm", "b");
        bigTable.put("1981-03-07", "orange", "2cm", "c");

        assertThat(bigTable.getByDimension1("1981-03-06"), is("b"));
        assertThat(bigTable.getByDimension2("red"), is("b"));
        assertThat(bigTable.getByDimension3("2cm"), is("c"));
    }
}
