package com.home.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 *Spring 의존성 주입은 크게 2가지
 
 1.Setter 주입 : 
 setXXX()와 같은 메서드 작성 후(혹은 아래와 같이 Lombok으로 생성 후) 
 Autowired와 같은 어노테이션을 통해 스프링으로부터 자신이 필요한 객체를 주입해 주도록 함.
 
*/

@Component
@Data
public class Restaurant {

	
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	
	
}

/* 
 2.생성자 주입 : 
 객체 생성 시 의존성 주입이 필요하므로 좀 더 엄격하게 의존성 주입을 체크하는 장점이 있다.
 
@Component
@ToString
@Getter
public class SampleHotel() {
	private Chef chef;
	public SampleHotel(Chef chef) {
		this.chef = chef;
	}
}

-------------------------------------
생성자의 자동 주입과 Lombok을 결합하여 아래와 같이 변경가능

@Component
@ToString
@Getter
@AllArgsConstructor
public class SampleHotel(){
	private Chef chef;
}

@AllArgsConstructor는 인스턴스 변수로 선언된 모든 것을 파라미터로 받는 생성자를 작성하게 된다.
--------------------------------------
특정한 변수에 대해서만 생성자를 작성할때

@Component
@ToString
@Getter
@RequiredArgsConstructor
public class SampleHotel(){

	@NotNull
	private Chef chef;
}

@RequiredArgsConstructor는 @NotNull 이나 final이 붙은 인스턴스 변수에 대한 생성자를 만듦.

*/