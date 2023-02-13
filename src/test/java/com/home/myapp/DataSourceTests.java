package com.home.myapp;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import com.home.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//설정 확인만 가능한 수준, 브라우저 최종 결과를 확인하지 못함.

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//java 설정을 사용하는 경우
//@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class DataSourceTests {

	@Setter(onMethod_ = @Autowired)
	private DataSource dataSource;
	
	/*
	@Setter(onMethod_ = @Autowired)
	private SqlSessionFactory sqlSessionFactory;
	*/
	
	@Test
	public void testCoonnection() {
		
		try {
			//SqlSession session = sqlSessionFactory.openSession();
			Connection con = dataSource.getConnection();
			
			//log.info(session);
			log.info(con);
			
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
	
}
