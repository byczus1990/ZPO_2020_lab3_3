package com.main;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class SbDateTimeOperationsTest {

	SbDateTimeOperations dTO = new SbDateTimeOperations();
	@Test
	public void testNumberOfDaysBetweenDates() {
		Long example = (long) 2077;
		Long example2 = (long) 2070;
		Assert.assertEquals(example, dTO.NumberOfDaysBetweenDates("1939-09-01", "1945-05-08"));
		Assert.assertEquals(example2, dTO.NumberOfDaysBetweenDates("1939-09-01", "1945-05-01"));
	}

	@Test
	public void testWhatDateIsGivenDay() {
		Assert.assertTrue(dTO.whatDateIsGivenDay(68, 2020).contains("--03-08"));
		Assert.assertTrue(dTO.whatDateIsGivenDay(70, 2020).contains("--03-10"));
	}

	@Test
	public void testCalculateNumberOfSumEqual15() {
		Integer example = 1;
		Integer example2 = 2;
		Assert.assertEquals(example, dTO.calculateNumberOfSumEqual15("11:00", "11:04"));
		Assert.assertEquals(example2, dTO.calculateNumberOfSumEqual15("11:00", "12:04"));
	}

	@Test
	public void testCalculateHowManyTimesYouHad29OfFeb() {
		Integer example = 7;
		Integer example2 = 1;
		Assert.assertEquals(example, dTO.calculateHowManyTimesYouHad29OfFeb("1990-03-31"));
		Assert.assertEquals(example2, dTO.calculateHowManyTimesYouHad29OfFeb("2015-03-31"));
	}

}
