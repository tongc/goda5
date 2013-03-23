
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.ean.wsapi.hotel.v3;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-03-23T21:22:12.948Z
 * Generated source version: 2.7.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "HotelServicesImplService",
                      portName = "HotelServicesImplPort",
                      targetNamespace = "http://v3.hotel.wsapi.ean.com/",
                      wsdlLocation = "file:/Users/tonchen/dev/git/goda5/hagendaz/service/src/main/resources/eanv3.wsdl",
                      endpointInterface = "com.ean.wsapi.hotel.v3.HotelServices")
                      
public class HotelServicesImpl implements HotelServices {

    private static final Logger LOG = Logger.getLogger(HotelServicesImpl.class.getName());

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getList(com.ean.wsapi.hotel.v3.HotelListRequest  hotelListRequest )*
     */
    public com.ean.wsapi.hotel.v3.HotelListResponse getList(com.ean.wsapi.hotel.v3.HotelListRequest hotelListRequest) { 
        LOG.info("Executing operation getList");
        System.out.println(hotelListRequest);
        try {
            com.ean.wsapi.hotel.v3.HotelListResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getAvailability(com.ean.wsapi.hotel.v3.HotelRoomAvailabilityRequest  hotelRoomAvailabilityRequest )*
     */
    public com.ean.wsapi.hotel.v3.HotelRoomAvailabilityResponse getAvailability(com.ean.wsapi.hotel.v3.HotelRoomAvailabilityRequest hotelRoomAvailabilityRequest) { 
        LOG.info("Executing operation getAvailability");
        System.out.println(hotelRoomAvailabilityRequest);
        try {
            com.ean.wsapi.hotel.v3.HotelRoomAvailabilityResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getRoomImage(com.ean.wsapi.hotel.v3.HotelRoomImageRequest  hotelRoomImageRequest )*
     */
    public com.ean.wsapi.hotel.v3.HotelRoomImageResponse getRoomImage(com.ean.wsapi.hotel.v3.HotelRoomImageRequest hotelRoomImageRequest) { 
        LOG.info("Executing operation getRoomImage");
        System.out.println(hotelRoomImageRequest);
        try {
            com.ean.wsapi.hotel.v3.HotelRoomImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getCancellation(com.ean.wsapi.hotel.v3.HotelRoomCancellationRequest  hotelRoomCancellationRequest )*
     */
    public com.ean.wsapi.hotel.v3.HotelRoomCancellationResponse getCancellation(com.ean.wsapi.hotel.v3.HotelRoomCancellationRequest hotelRoomCancellationRequest) { 
        LOG.info("Executing operation getCancellation");
        System.out.println(hotelRoomCancellationRequest);
        try {
            com.ean.wsapi.hotel.v3.HotelRoomCancellationResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getItinerary(com.ean.wsapi.hotel.v3.HotelItineraryRequest  hotelItineraryRequest )*
     */
    public com.ean.wsapi.hotel.v3.HotelItineraryResponse getItinerary(com.ean.wsapi.hotel.v3.HotelItineraryRequest hotelItineraryRequest) { 
        LOG.info("Executing operation getItinerary");
        System.out.println(hotelItineraryRequest);
        try {
            com.ean.wsapi.hotel.v3.HotelItineraryResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getAlternateProperties(com.ean.wsapi.hotel.v3.AlternatePropertyListRequest  alternatePropertyListRequest )*
     */
    public com.ean.wsapi.hotel.v3.AlternatePropertyListResponse getAlternateProperties(com.ean.wsapi.hotel.v3.AlternatePropertyListRequest alternatePropertyListRequest) { 
        LOG.info("Executing operation getAlternateProperties");
        System.out.println(alternatePropertyListRequest);
        try {
            com.ean.wsapi.hotel.v3.AlternatePropertyListResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getPing(com.ean.wsapi.hotel.v3.PingRequest  pingRequest )*
     */
    public com.ean.wsapi.hotel.v3.PingResponse getPing(com.ean.wsapi.hotel.v3.PingRequest pingRequest) { 
        LOG.info("Executing operation getPing");
        System.out.println(pingRequest);
        try {
            com.ean.wsapi.hotel.v3.PingResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getGeoLocation(com.ean.wsapi.hotel.v3.LocationInfoRequest  locationInfoRequest )*
     */
    public com.ean.wsapi.hotel.v3.LocationInfoResponse getGeoLocation(com.ean.wsapi.hotel.v3.LocationInfoRequest locationInfoRequest) { 
        LOG.info("Executing operation getGeoLocation");
        System.out.println(locationInfoRequest);
        try {
            com.ean.wsapi.hotel.v3.LocationInfoResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getPaymentInfo(com.ean.wsapi.hotel.v3.V3HotelPaymentRequest  hotelPaymentRequest )*
     */
    public com.ean.wsapi.hotel.v3.HotelPaymentResponse getPaymentInfo(com.ean.wsapi.hotel.v3.V3HotelPaymentRequest hotelPaymentRequest) { 
        LOG.info("Executing operation getPaymentInfo");
        System.out.println(hotelPaymentRequest);
        try {
            com.ean.wsapi.hotel.v3.HotelPaymentResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getReservation(com.ean.wsapi.hotel.v3.HotelRoomReservationRequest  hotelRoomReservationRequest )*
     */
    public com.ean.wsapi.hotel.v3.HotelRoomReservationResponse getReservation(com.ean.wsapi.hotel.v3.HotelRoomReservationRequest hotelRoomReservationRequest) { 
        LOG.info("Executing operation getReservation");
        System.out.println(hotelRoomReservationRequest);
        try {
            com.ean.wsapi.hotel.v3.HotelRoomReservationResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getInformation(com.ean.wsapi.hotel.v3.HotelInformationRequest  hotelInformationRequest )*
     */
    public com.ean.wsapi.hotel.v3.HotelInformationResponse getInformation(com.ean.wsapi.hotel.v3.HotelInformationRequest hotelInformationRequest) { 
        LOG.info("Executing operation getInformation");
        System.out.println(hotelInformationRequest);
        try {
            com.ean.wsapi.hotel.v3.HotelInformationResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.ean.wsapi.hotel.v3.HotelServices#getRateRules(com.ean.wsapi.hotel.v3.HotelRateRulesRequest  hotelRateRulesRequest )*
     */
    public com.ean.wsapi.hotel.v3.HotelRateRulesResponse getRateRules(com.ean.wsapi.hotel.v3.HotelRateRulesRequest hotelRateRulesRequest) { 
        LOG.info("Executing operation getRateRules");
        System.out.println(hotelRateRulesRequest);
        try {
            com.ean.wsapi.hotel.v3.HotelRateRulesResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
