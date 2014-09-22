package com.goda5.hagendaz.service;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.Response;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by tong on 22/09/2014.
 */
public class HttpClientTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        new HttpClientTest().test();
    }
    public void test() throws IOException, ExecutionException, InterruptedException {
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        try {
            Future<Response> f = asyncHttpClient.prepareGet("https://www.paypal.com/uk/webapps/mpp/home").execute();
            Response r = f.get();
            System.out.println(r.getStatusCode());
        } finally {
            asyncHttpClient.closeAsynchronously();
        }
    }
}
