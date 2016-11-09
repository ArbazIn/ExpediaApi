package com.example.arbaz.expediaexmple.model;

public class HotelRoomAvailabilityResponse{
	private String hotelStateProvince;
	private int numberOfRoomsRequested;
	private int tripAdvisorReviewCount;
	private HotelRoomResponse hotelRoomResponse;
	private String hotelCountry;
	private String customerSessionId;
	private String hotelAddress;
	private int hotelId;
	private String hotelName;
	private String tripAdvisorRatingUrl;
	private String arrivalDate;
	private double tripAdvisorRating;
	private String hotelCity;
	private String checkInInstructions;
	private String size;
	private String departureDate;

	public void setHotelStateProvince(String hotelStateProvince){
		this.hotelStateProvince = hotelStateProvince;
	}

	public String getHotelStateProvince(){
		return hotelStateProvince;
	}

	public void setNumberOfRoomsRequested(int numberOfRoomsRequested){
		this.numberOfRoomsRequested = numberOfRoomsRequested;
	}

	public int getNumberOfRoomsRequested(){
		return numberOfRoomsRequested;
	}

	public void setTripAdvisorReviewCount(int tripAdvisorReviewCount){
		this.tripAdvisorReviewCount = tripAdvisorReviewCount;
	}

	public int getTripAdvisorReviewCount(){
		return tripAdvisorReviewCount;
	}

	public void setHotelRoomResponse(HotelRoomResponse hotelRoomResponse){
		this.hotelRoomResponse = hotelRoomResponse;
	}

	public HotelRoomResponse getHotelRoomResponse(){
		return hotelRoomResponse;
	}

	public void setHotelCountry(String hotelCountry){
		this.hotelCountry = hotelCountry;
	}

	public String getHotelCountry(){
		return hotelCountry;
	}

	public void setCustomerSessionId(String customerSessionId){
		this.customerSessionId = customerSessionId;
	}

	public String getCustomerSessionId(){
		return customerSessionId;
	}

	public void setHotelAddress(String hotelAddress){
		this.hotelAddress = hotelAddress;
	}

	public String getHotelAddress(){
		return hotelAddress;
	}

	public void setHotelId(int hotelId){
		this.hotelId = hotelId;
	}

	public int getHotelId(){
		return hotelId;
	}

	public void setHotelName(String hotelName){
		this.hotelName = hotelName;
	}

	public String getHotelName(){
		return hotelName;
	}

	public void setTripAdvisorRatingUrl(String tripAdvisorRatingUrl){
		this.tripAdvisorRatingUrl = tripAdvisorRatingUrl;
	}

	public String getTripAdvisorRatingUrl(){
		return tripAdvisorRatingUrl;
	}

	public void setArrivalDate(String arrivalDate){
		this.arrivalDate = arrivalDate;
	}

	public String getArrivalDate(){
		return arrivalDate;
	}

	public void setTripAdvisorRating(double tripAdvisorRating){
		this.tripAdvisorRating = tripAdvisorRating;
	}

	public double getTripAdvisorRating(){
		return tripAdvisorRating;
	}

	public void setHotelCity(String hotelCity){
		this.hotelCity = hotelCity;
	}

	public String getHotelCity(){
		return hotelCity;
	}

	public void setCheckInInstructions(String checkInInstructions){
		this.checkInInstructions = checkInInstructions;
	}

	public String getCheckInInstructions(){
		return checkInInstructions;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setDepartureDate(String departureDate){
		this.departureDate = departureDate;
	}

	public String getDepartureDate(){
		return departureDate;
	}
}
