package com.goda5.hagendaz.common;

import com.beust.jcommander.internal.Lists;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;

/**
 * Created by tong on 07/11/2015.
 */
public class PhantomReferenceTest {
    private LinkedList phantomReferences = new LinkedList();
    private ReferenceQueue queue = new ReferenceQueue();

    public static class TestObj {
        @Override
        public void finalize() {
            System.out.println(Thread.currentThread().getName() + " finalized");
        }
    }

    public class ConnectionPhantomReference extends PhantomReference {
        private TestObj obj;

        public ConnectionPhantomReference(TestObj obj, ReferenceQueue queue) {
            super(obj, queue);
        }

        public void cleanup() {
            System.out.println("cleaned up");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PhantomReferenceTest phantomReferenceTest = new PhantomReferenceTest();
        TestObj strongRef = new TestObj();
        phantomReferenceTest.phantomReferences.add(phantomReferenceTest.new ConnectionPhantomReference(strongRef, phantomReferenceTest.queue));

        Thread referenceThread = new Thread() {
            public void run() {
                while (true) {
                    try {
                        ConnectionPhantomReference ref = (ConnectionPhantomReference)phantomReferenceTest.queue.remove();
                        ref.cleanup();
                        phantomReferenceTest.phantomReferences.remove(ref);
                    } catch (Exception ex) {
                        // log exception, continue
                    }
                }
            }
        };
        referenceThread.setDaemon(true);
        referenceThread.start();

        strongRef = null;

        for(int i = 0; i<1000;i++) {
            System.gc();
        }
        System.gc();
//        for(int i=0;i<1000000;i++) {
//            TestObj t = new TestObj();
//            t = null;
//        }
        Thread.sleep(3000);
    }
}
