package com.smhrd.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 *  Spring boot 시작점
 * 
 * @SpringBootApplication 이라는 annotation은 3개의 annotation 이 집합
 * 
 * 1. SpringBootConfiguration
 * 	 - 전반적인 환경설정 담당하는 annotation
 * 2. EnableAutoConfiguration
 *   - pom.xml 에 jar파일 작성 필요한 객체를 자동으로 생성하고 사용
 *   - DB 접속을 위해 HikariCP, DataSource 객체들을 DB정보 작성만으로 자동으로 생성
 * 3. ComponentScan
 *   - @Controller 같은 객체들을 자동으로 등록
 *   
 *   결론 : @SpringBootApplication 이라는 어노테이션을 활용한 것 만으로 
 *   		복잡한 설정 없이 라이브러리 추가 자동 등록 된다.
 *   
 */





@SpringBootApplication
public class SpringBootBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBoardApplication.class, args);
	}

}
