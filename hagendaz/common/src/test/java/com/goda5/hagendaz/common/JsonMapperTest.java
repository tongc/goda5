package com.goda5.hagendaz.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.joda.time.DateTime;
import org.junit.Test;

/**
 * Created by tong on 15/01/2016.
 */
public class JsonMapperTest {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Test
    public void test() throws JsonProcessingException {
        objectMapper.registerModule(new JodaModule());
        System.out.println(objectMapper.writeValueAsString(new DateTime()));
    }
}
