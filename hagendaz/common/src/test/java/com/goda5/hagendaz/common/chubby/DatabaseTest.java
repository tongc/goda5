package com.goda5.hagendaz.common.chubby;

import org.junit.Before;
import org.testng.annotations.Test;

/**
 * Created by tong on 25/03/2016.
 */
public class DatabaseTest {
    private Database database;

    @Before
    public void setup() {
        database = new Database();
    }

    @Test
    public void shouldSaveAndDelete() {
        String anyTestValue = "test value";
        String anyTestKey = "test key";
        database.save(anyTestKey, anyTestValue);
        database.delete(anyTestKey);
    }
}
