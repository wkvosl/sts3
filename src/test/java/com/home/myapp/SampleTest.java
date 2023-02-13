package com.home.myapp;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTest {

	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("-----------------");
		log.info(restaurant.getChef());
	}
}

/*

생성자 주입 테스트
결과 : 
INFO : com.home.myapp.SampleTest - SampleHotel(chef=chef())
INFO : com.home.myapp.SampleTest - -----------------
INFO : com.home.myapp.SampleTest - Chef()

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HotelTests() {
	
	@Setter(onMethod_=@Autowired)
	private SampleHotel hotel;
	
	@Test
	public void testExist() {
		assertNotNull(hotel);
		
		log.info(hotel);
		log.info("-----------------");
		log.info(hotel.getChef());
	}
}


*/


