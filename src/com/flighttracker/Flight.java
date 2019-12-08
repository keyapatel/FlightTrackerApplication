package com.flighttracker;
import java.sql.*; 

public class Flight {
	
	/*
	 * 
	 * depart_date
date
arrive_date
date
depart_time
time
arrive_time
time
fare_first
int(11)
fare_economy
int(11)
airline_id
char(3) PK
depart_airport_id
char(3)
arrive_airport_id
char(3)
aircraft_id
int(11)
fare_business
int(11)
available_seats_economy
int(11)
available_seats_first
int(11)
available_seats_business
int(11)
	 */
	
	private int flightNumber, fareFirst, fareEconomy, aircraftId, availableSeatsEconomy, availableSeatsFirst;
	private Date departDate, arriveDate;
	private Time departTime, arriveTime;
	private char airlineId, departAirportId, ArriveAirportId;
	
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getFareFirst() {
		return fareFirst;
	}
	public void setFareFirst(int fareFirst) {
		this.fareFirst = fareFirst;
	}
	public int getFareEconomy() {
		return fareEconomy;
	}
	public void setFareEconomy(int fareEconomy) {
		this.fareEconomy = fareEconomy;
	}
	public int getAircraftId() {
		return aircraftId;
	}
	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}
	public int getAvailableSeatsEconomy() {
		return availableSeatsEconomy;
	}
	public void setAvailableSeatsEconomy(int availableSeatsEconomy) {
		this.availableSeatsEconomy = availableSeatsEconomy;
	}
	public int getAvailableSeatsFirst() {
		return availableSeatsFirst;
	}
	public void setAvailableSeatsFirst(int availableSeatsFirst) {
		this.availableSeatsFirst = availableSeatsFirst;
	}
	public Date getDepartDate() {
		return departDate;
	}
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public Date getArriveDate() {
		return arriveDate;
	}
	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}
	public Time getDepartTime() {
		return departTime;
	}
	public void setDepartTime(Time departTime) {
		this.departTime = departTime;
	}
	public Time getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Time arriveTime) {
		this.arriveTime = arriveTime;
	}
	public char getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(char airlineId) {
		this.airlineId = airlineId;
	}
	public char getDepartAirportId() {
		return departAirportId;
	}
	public void setDepartAirportId(char departAirportId) {
		this.departAirportId = departAirportId;
	}
	public char getArriveAirportId() {
		return ArriveAirportId;
	}
	public void setArriveAirportId(char arriveAirportId) {
		ArriveAirportId = arriveAirportId;
	}

}