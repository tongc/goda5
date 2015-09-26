package com.goda5.hagendaz.common;

import org.apache.commons.lang.math.RandomUtils;
import org.testng.annotations.Test;

/**
 * Created by tong on 20/09/2015.
 */
public class HashPrimeTest {

    class MyObject {
        private int field;
        private int field1;
        private String field2;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MyObject myObject = (MyObject) o;

            if (field != myObject.field) return false;
            if (field1 != myObject.field1) return false;
            if (field2 != null ? !field2.equals(myObject.field2) : myObject.field2 != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = field;
            result = 31 * result + field1;
            result = 31 * result + (field2 != null ? field2.hashCode() : 0);
            return result;
        }

        public MyObject(int field, int field1, String field2) {
            this.field = field;
            this.field1 = field1;
            this.field2 = field2;
        }

    }

    @Test
    public void testHash() {
        System.out.println((13 << 1) + 1);

        int[] bucket = new int[11];
        for(int i=0;i<10000;i++) {
            int r = Math.abs(RandomUtils.nextInt(10000));
            int hash = new MyObject(5, 5 + 1, "a" + r).hashCode();
            bucket[hash % 8] = bucket[hash % 8] + 1;
        }
        for(int j=0;j<bucket.length;j++) {
            System.out.println(bucket[j]);
        }

        for(int i=0;i<=52;i++) {
            System.out.println((i+10)%52);
        }
    }
}
