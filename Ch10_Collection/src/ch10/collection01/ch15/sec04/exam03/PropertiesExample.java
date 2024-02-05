package ch10.collection01.ch15.sec04.exam03;

import java.util.Properties;

public class PropertiesExample {
	
	public class PropertiesEample{
		public static void main(String[] args) {
			// Properties 컬렉션 생성
			Properties properties = new Properties();
			
			//PropertiesExample.class와 동일한 ClassPath 에 있는 database.properties 파일로드
			properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
			
			// 주어진 키에 대한 값 읽기
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			String admin = properties.getProperty("admin");
			
			// 값출력
			System.out.println("driver : " + driver);
			System.out.println("url : " + url);
			System.out.println("username : " + username);
			System.out.println("password : " + password);
			System.out.println("admin : " + admin);
			
		}
	}

}
