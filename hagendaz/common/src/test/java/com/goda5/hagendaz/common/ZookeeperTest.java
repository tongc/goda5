package com.goda5.hagendaz.common;

import com.google.common.collect.Lists;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;

/**
 * Created by tong on 15/05/2016.
 */
public class ZookeeperTest {
    public static void main(String[] args) {
        try {
            ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:12181", 3000, null);
            System.out.println(zooKeeper.getState());
            System.out.println(zooKeeper.getSessionId());
            System.out.println(zooKeeper.getSessionTimeout());
            zooKeeper.getData("/mycluster1/mytopic1", false, null);
            zooKeeper.create("/abc", "".getBytes(), Lists.newArrayList(new ACL(1, new Id("a", "b"))), CreateMode.PERSISTENT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
