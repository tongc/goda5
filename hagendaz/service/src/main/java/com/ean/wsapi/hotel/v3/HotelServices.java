package com.ean.wsapi.hotel.v3;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-04-27T22:46:46.751+01:00
 * Generated source version: 2.7.2
 * 
 */
@WebService(targetNamespace = "http://v3.hotel.wsapi.ean.com/", name = "HotelServices")
@XmlSeeAlso({ObjectFactory.class})
public interface HotelServices {

    @WebResult(name = "HotelListResponse", targetNamespace = "")
    @RequestWrapper(localName = "getList", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetList")
    @WebMethod
    @ResponseWrapper(localName = "getListResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetListResponse")
    public com.ean.wsapi.hotel.v3.HotelListResponse getList(
        @WebParam(name = "HotelListRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.HotelListRequest hotelListRequest
    );

    @WebResult(name = "HotelRoomAvailabilityResponse", targetNamespace = "")
    @RequestWrapper(localName = "getAvailability", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetAvailability")
    @WebMethod
    @ResponseWrapper(localName = "getAvailabilityResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetAvailabilityResponse")
    public com.ean.wsapi.hotel.v3.HotelRoomAvailabilityResponse getAvailability(
        @WebParam(name = "HotelRoomAvailabilityRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.HotelRoomAvailabilityRequest hotelRoomAvailabilityRequest
    );

    @WebResult(name = "HotelRoomImageResponse", targetNamespace = "")
    @RequestWrapper(localName = "getRoomImage", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetRoomImage")
    @WebMethod
    @ResponseWrapper(localName = "getRoomImageResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetRoomImageResponse")
    public com.ean.wsapi.hotel.v3.HotelRoomImageResponse getRoomImage(
        @WebParam(name = "HotelRoomImageRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.HotelRoomImageRequest hotelRoomImageRequest
    );

    @WebResult(name = "HotelRoomCancellationResponse", targetNamespace = "")
    @RequestWrapper(localName = "getCancellation", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetCancellation")
    @WebMethod
    @ResponseWrapper(localName = "getCancellationResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetCancellationResponse")
    public com.ean.wsapi.hotel.v3.HotelRoomCancellationResponse getCancellation(
        @WebParam(name = "HotelRoomCancellationRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.HotelRoomCancellationRequest hotelRoomCancellationRequest
    );

    @WebResult(name = "HotelItineraryResponse", targetNamespace = "")
    @RequestWrapper(localName = "getItinerary", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetItinerary")
    @WebMethod
    @ResponseWrapper(localName = "getItineraryResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetItineraryResponse")
    public com.ean.wsapi.hotel.v3.HotelItineraryResponse getItinerary(
        @WebParam(name = "HotelItineraryRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.HotelItineraryRequest hotelItineraryRequest
    );

    @WebResult(name = "AlternatePropertyListResponse", targetNamespace = "")
    @RequestWrapper(localName = "getAlternateProperties", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetAlternateProperties")
    @WebMethod
    @ResponseWrapper(localName = "getAlternatePropertiesResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetAlternatePropertiesResponse")
    public com.ean.wsapi.hotel.v3.AlternatePropertyListResponse getAlternateProperties(
        @WebParam(name = "AlternatePropertyListRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.AlternatePropertyListRequest alternatePropertyListRequest
    );

    @WebResult(name = "PingResponse", targetNamespace = "")
    @RequestWrapper(localName = "getPing", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetPing")
    @WebMethod
    @ResponseWrapper(localName = "getPingResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetPingResponse")
    public com.ean.wsapi.hotel.v3.PingResponse getPing(
        @WebParam(name = "PingRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.PingRequest pingRequest
    );

    @WebResult(name = "LocationInfoResponse", targetNamespace = "")
    @RequestWrapper(localName = "getGeoLocation", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetGeoLocation")
    @WebMethod
    @ResponseWrapper(localName = "getGeoLocationResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetGeoLocationResponse")
    public com.ean.wsapi.hotel.v3.LocationInfoResponse getGeoLocation(
        @WebParam(name = "LocationInfoRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.LocationInfoRequest locationInfoRequest
    );

    @WebResult(name = "HotelPaymentResponse", targetNamespace = "")
    @RequestWrapper(localName = "getPaymentInfo", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetPaymentInfo")
    @WebMethod
    @ResponseWrapper(localName = "getPaymentInfoResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetPaymentInfoResponse")
    public com.ean.wsapi.hotel.v3.HotelPaymentResponse getPaymentInfo(
        @WebParam(name = "HotelPaymentRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.V3HotelPaymentRequest hotelPaymentRequest
    );

    @WebResult(name = "HotelRoomReservationResponse", targetNamespace = "")
    @RequestWrapper(localName = "getReservation", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetReservation")
    @WebMethod
    @ResponseWrapper(localName = "getReservationResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetReservationResponse")
    public com.ean.wsapi.hotel.v3.HotelRoomReservationResponse getReservation(
        @WebParam(name = "HotelRoomReservationRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.HotelRoomReservationRequest hotelRoomReservationRequest
    );

    @WebResult(name = "HotelInformationResponse", targetNamespace = "")
    @RequestWrapper(localName = "getInformation", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetInformation")
    @WebMethod
    @ResponseWrapper(localName = "getInformationResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetInformationResponse")
    public com.ean.wsapi.hotel.v3.HotelInformationResponse getInformation(
        @WebParam(name = "HotelInformationRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.HotelInformationRequest hotelInformationRequest
    );

    @WebResult(name = "HotelRateRulesResponse", targetNamespace = "")
    @RequestWrapper(localName = "getRateRules", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetRateRules")
    @WebMethod
    @ResponseWrapper(localName = "getRateRulesResponse", targetNamespace = "http://v3.hotel.wsapi.ean.com/", className = "com.ean.wsapi.hotel.v3.GetRateRulesResponse")
    public com.ean.wsapi.hotel.v3.HotelRateRulesResponse getRateRules(
        @WebParam(name = "HotelRateRulesRequest", targetNamespace = "")
        com.ean.wsapi.hotel.v3.HotelRateRulesRequest hotelRateRulesRequest
    );
}
