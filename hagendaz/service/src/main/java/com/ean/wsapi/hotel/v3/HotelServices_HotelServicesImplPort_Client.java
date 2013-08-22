
package com.ean.wsapi.hotel.v3;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-05-23T22:25:23.449+01:00
 * Generated source version: 2.7.2
 * 
 */
public final class HotelServices_HotelServicesImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://v3.hotel.wsapi.ean.com/", "HotelServicesImplService");

    private HotelServices_HotelServicesImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = HotelServicesImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        HotelServicesImplService ss = new HotelServicesImplService(wsdlURL, SERVICE_NAME);
        HotelServices port = ss.getHotelServicesImplPort();  
        
        {
        System.out.println("Invoking getList...");
        com.ean.wsapi.hotel.v3.HotelListRequest _getList_hotelListRequest = null;
        com.ean.wsapi.hotel.v3.HotelListResponse _getList__return = port.getList(_getList_hotelListRequest);
        System.out.println("getList.result=" + _getList__return);


        }
        {
        System.out.println("Invoking getAvailability...");
        com.ean.wsapi.hotel.v3.HotelRoomAvailabilityRequest _getAvailability_hotelRoomAvailabilityRequest = null;
        com.ean.wsapi.hotel.v3.HotelRoomAvailabilityResponse _getAvailability__return = port.getAvailability(_getAvailability_hotelRoomAvailabilityRequest);
        System.out.println("getAvailability.result=" + _getAvailability__return);


        }
        {
        System.out.println("Invoking getRoomImage...");
        com.ean.wsapi.hotel.v3.HotelRoomImageRequest _getRoomImage_hotelRoomImageRequest = null;
        com.ean.wsapi.hotel.v3.HotelRoomImageResponse _getRoomImage__return = port.getRoomImage(_getRoomImage_hotelRoomImageRequest);
        System.out.println("getRoomImage.result=" + _getRoomImage__return);


        }
        {
        System.out.println("Invoking getCancellation...");
        com.ean.wsapi.hotel.v3.HotelRoomCancellationRequest _getCancellation_hotelRoomCancellationRequest = null;
        com.ean.wsapi.hotel.v3.HotelRoomCancellationResponse _getCancellation__return = port.getCancellation(_getCancellation_hotelRoomCancellationRequest);
        System.out.println("getCancellation.result=" + _getCancellation__return);


        }
        {
        System.out.println("Invoking getItinerary...");
        com.ean.wsapi.hotel.v3.HotelItineraryRequest _getItinerary_hotelItineraryRequest = null;
        com.ean.wsapi.hotel.v3.HotelItineraryResponse _getItinerary__return = port.getItinerary(_getItinerary_hotelItineraryRequest);
        System.out.println("getItinerary.result=" + _getItinerary__return);


        }
        {
        System.out.println("Invoking getAlternateProperties...");
        com.ean.wsapi.hotel.v3.AlternatePropertyListRequest _getAlternateProperties_alternatePropertyListRequest = null;
        com.ean.wsapi.hotel.v3.AlternatePropertyListResponse _getAlternateProperties__return = port.getAlternateProperties(_getAlternateProperties_alternatePropertyListRequest);
        System.out.println("getAlternateProperties.result=" + _getAlternateProperties__return);


        }
        {
        System.out.println("Invoking getPing...");
        com.ean.wsapi.hotel.v3.PingRequest _getPing_pingRequest = null;
        com.ean.wsapi.hotel.v3.PingResponse _getPing__return = port.getPing(_getPing_pingRequest);
        System.out.println("getPing.result=" + _getPing__return);


        }
        {
        System.out.println("Invoking getGeoLocation...");
        com.ean.wsapi.hotel.v3.LocationInfoRequest _getGeoLocation_locationInfoRequest = null;
        com.ean.wsapi.hotel.v3.LocationInfoResponse _getGeoLocation__return = port.getGeoLocation(_getGeoLocation_locationInfoRequest);
        System.out.println("getGeoLocation.result=" + _getGeoLocation__return);


        }
        {
        System.out.println("Invoking getPaymentInfo...");
        com.ean.wsapi.hotel.v3.V3HotelPaymentRequest _getPaymentInfo_hotelPaymentRequest = null;
        com.ean.wsapi.hotel.v3.HotelPaymentResponse _getPaymentInfo__return = port.getPaymentInfo(_getPaymentInfo_hotelPaymentRequest);
        System.out.println("getPaymentInfo.result=" + _getPaymentInfo__return);


        }
        {
        System.out.println("Invoking getReservation...");
        com.ean.wsapi.hotel.v3.HotelRoomReservationRequest _getReservation_hotelRoomReservationRequest = null;
        com.ean.wsapi.hotel.v3.HotelRoomReservationResponse _getReservation__return = port.getReservation(_getReservation_hotelRoomReservationRequest);
        System.out.println("getReservation.result=" + _getReservation__return);


        }
        {
        System.out.println("Invoking getInformation...");
        com.ean.wsapi.hotel.v3.HotelInformationRequest _getInformation_hotelInformationRequest = null;
        com.ean.wsapi.hotel.v3.HotelInformationResponse _getInformation__return = port.getInformation(_getInformation_hotelInformationRequest);
        System.out.println("getInformation.result=" + _getInformation__return);


        }
        {
        System.out.println("Invoking getRateRules...");
        com.ean.wsapi.hotel.v3.HotelRateRulesRequest _getRateRules_hotelRateRulesRequest = null;
        com.ean.wsapi.hotel.v3.HotelRateRulesResponse _getRateRules__return = port.getRateRules(_getRateRules_hotelRateRulesRequest);
        System.out.println("getRateRules.result=" + _getRateRules__return);


        }

        System.exit(0);
    }

}
