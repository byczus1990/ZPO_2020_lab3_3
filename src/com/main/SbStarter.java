package com.main;

public class SbStarter {

	
	
	public static void main(String[] args) {
		
		SbDateTimeOperations dTO = new SbDateTimeOperations();
		
		System.out.print("Number of days between 2 dates: " + dTO.NumberOfDaysBetweenDates("1939-09-01", "1945-05-08") + "\n");
		System.out.print(dTO.whatDateIsGivenDay(68, 2020) + "\n");
		System.out.print("Number hour + minute = 15 between 2 LocalTimes: " + dTO.calculateNumberOfSumEqual15("11:00", "11:04") + "\n");
		System.out.print("Number of 29 Feb in your Life: " + dTO.calculateHowManyTimesYouHad29OfFeb("1990-03-31"));
	}
}
