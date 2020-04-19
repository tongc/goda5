package com.goda5.hagendaz.data.dao;

import java.util.ArrayList;
import java.util.List;

public class DataAggregator {

    private List<String> dataList = new ArrayList<>();

    public DataAggregator add(Long data) {
        System.out.println(data);
        return this;
    }

    public List<String> getDataList() {
        return dataList;
    }
}
