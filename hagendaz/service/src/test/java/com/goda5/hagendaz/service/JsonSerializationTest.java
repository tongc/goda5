package com.goda5.hagendaz.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.testng.annotations.Test;

import java.util.Optional;

import static org.testng.Assert.assertEquals;

/**
 * Created by tong on 22/02/2015.
 */
public class JsonSerializationTest {
    public class J {
        private Optional<String> x;
        private String y;
        private Optional<String> z;

        public String getY() {
            return y;
        }

        public void setY(String y) {
            this.y = y;
        }

        public Optional<String> getX() {
            return x;
        }

        public void setX(Optional<String> x) {
            this.x = x;
        }

        public Optional<String> getZ() {
            return z;
        }

        public void setZ(Optional<String> z) {
            this.z = z;
        }
    }

    @Test
    public void test() throws JsonProcessingException {
       J j = new J();
        j.setX(Optional.of("a"));
        j.setY("b");
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new Jdk8Module());
        assertEquals("{\"x\":\"a\",\"y\":\"b\",\"z\":null}", mapper.writeValueAsString(j));
    }
}
