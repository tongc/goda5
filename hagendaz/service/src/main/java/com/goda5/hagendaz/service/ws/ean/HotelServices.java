package com.goda5.hagendaz.service.ws.ean;

import java.net.URL;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.ean.wsapi.hotel.v3.HotelServicesImplService;
import com.ean.wsapi.hotel.v3.HotelSummary;

@Service
public class HotelServices {
    private static final QName SERVICE_NAME = new QName("http://v3.hotel.wsapi.ean.com/", "HotelServicesImplService");
    
	public void getHotels() {
        URL wsdlURL = HotelServicesImplService.WSDL_LOCATION;
      
        HotelServicesImplService ss = new HotelServicesImplService(wsdlURL, SERVICE_NAME);
        com.ean.wsapi.hotel.v3.HotelServices port = ss.getHotelServicesImplPort();  
        
        {
        System.out.println("Invoking getList...");
        com.ean.wsapi.hotel.v3.HotelListRequest _getList_hotelListRequest = new com.ean.wsapi.hotel.v3.HotelListRequest();
        _getList_hotelListRequest.setApiKey("nzujt9urth9ebncw7qycfygv");
        _getList_hotelListRequest.setCity("Beijing");
        long start = System.currentTimeMillis();
        com.ean.wsapi.hotel.v3.HotelListResponse _getList__return = port.getList(_getList_hotelListRequest);
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start));
        System.out.println("getList.result=" + _getList__return);
        for(HotelSummary hotelSummary:_getList__return.getHotelList().getHotelSummary()) {
        	System.out.println(hotelSummary.getName());
        }
        }
	}
	
	public static void main(String[] args) {
		HotelServices s = new HotelServices();
		s.getHotels();
	}
}
