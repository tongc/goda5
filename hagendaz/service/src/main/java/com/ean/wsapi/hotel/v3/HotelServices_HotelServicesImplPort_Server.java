
package com.ean.wsapi.hotel.v3;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-05-16T16:54:26.968+01:00
 * Generated source version: 2.7.2
 * 
 */
 
public class HotelServices_HotelServicesImplPort_Server{

    protected HotelServices_HotelServicesImplPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new HotelServicesImpl();
        String address = "http://api.ean.com/ean-services/ws/hotel/v3";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new HotelServices_HotelServicesImplPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
