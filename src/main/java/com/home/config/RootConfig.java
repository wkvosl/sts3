package com.home.config;

/*
@Configuration
@ComponentScan(basePackages = {"com.home.myapp"}) //bean 설정
@MapperScan(basePackages = {"com.home.mapper"}) //mybatis mapper 설정, 이걸로 끝.
public class RootConfig {

	//자바로 hikariCP bean설정 하는 경우 
	@Bean
	public DataSource dataSource() {
		HikariConfig hikariconfig = new HikariConfig();
		hikariconfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hikariconfig.setJdbcUrl("jdbc:oracl:thin:@localhost:1521:orcl");
		hikariconfig.setUsername("sun");
		hikariconfig.setPassword("a123");
		
		HikariDataSource dataSource = new HikariDataSource();
		
		return dataSource;
	}
	
	//자바로 log4jdbc log 설정할때 - root-context.xml도 같이 보세요.
	@Bean
	public DataSource dataSource() {
		HikariConfig hikariconfig = new HikariConfig();
		hikariconfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariconfig.setJdbcUrl("jdbc:log4jdbc:thin:@localhost:1521:orcl");
		hikariconfig.setUsername("sun");
		hikariconfig.setPassword("a123");
		
		HikariDataSource dataSource = new HikariDataSource();
		
		return dataSource;
	}
	
	
	//mybatis의 핵심객체인 SqlSessionFactory 
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}
}
*/