package com.main;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class SbDateTimeOperations {

	public Long NumberOfDaysBetweenDates(String startDate, String endDate)
	{		
		LocalDate sDate = LocalDate.parse(startDate);
		LocalDate eDate = LocalDate.parse(endDate);
		
		long numberOfDaysBetween = ChronoUnit.DAYS.between(sDate, eDate);
		numberOfDaysBetween += 1;
		
		return numberOfDaysBetween;
	}
	
	public String whatDateIsGivenDay(Integer numberOfDay, Integer yr )
	{
		LocalDate dateOfDay = LocalDate.ofYearDay(yr, numberOfDay);
		MonthDay monthDay = MonthDay.from(dateOfDay);
		String output = monthDay.toString();

		return "Given day of given year is date(--Month-Day): " + output;
	}
	public Integer calculateNumberOfSumEqual15(String startTime, String endTime)
	{
		Integer lScore = 0;
		LocalTime lSTime = LocalTime.parse(startTime);
		LocalTime lETime = LocalTime.parse(endTime);
		Long mBetween = ChronoUnit.MINUTES.between(lSTime, lETime);
		mBetween += 1;
		
		for(int i = 0; i < mBetween; i++)
		{
			if(lSTime.getHour() + lSTime.getMinute() == 15)
			{
				lScore++;
			}
			lSTime = lSTime.plusMinutes(1);
		}
		return lScore;
	}
	
	public Integer calculateHowManyTimesYouHad29OfFeb(String birthDate)
	{
		LocalDate lBirthDate = LocalDate.parse(birthDate);
		Integer lYearOfBirth = lBirthDate.getYear();
		Integer lScore = 0;
		String l29FebOfYourYearString = String.valueOf(lYearOfBirth) + "-02-29";
		
		LocalDate l29FebOfYourYear = null;
		
		if(lBirthDate.isLeapYear())
		{
			l29FebOfYourYear = LocalDate.parse(l29FebOfYourYearString);
			if(l29FebOfYourYear.isBefore(lBirthDate))
			{				
				lBirthDate = lBirthDate.plusYears(1);			
			}
		}
		
		
		Long lYearsBetweenToday = ChronoUnit.YEARS.between(lBirthDate, LocalDate.now());
		
		for(int i = 0; i < lYearsBetweenToday; i++)
		{
			if(lBirthDate.isLeapYear())
			{
				lScore++;
			}
			lBirthDate = lBirthDate.plusYears(1);
		}
		
	
		return lScore;
	}
}
