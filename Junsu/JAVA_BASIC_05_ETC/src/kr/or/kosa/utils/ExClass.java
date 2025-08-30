package kr.or.kosa.utils;

import java.io.IOException;

/*
설계도
A 팀장
B 팀원

A팀장이 클래스를 한 개 만들어 줄테니 사용시 예외처리를 하고 써
B팀원이 그런데 예외처리를 하지 않아도 자동으로... 예외처리
예외처리 클래스

A팀장 예외 강제 >> throws >> try ~ ... 강제
예외를 여러 개 던질 수 있어서 s가 붙음

 */

public class ExClass {
	public ExClass(String path) throws IOException, NullPointerException{//생성자 사용시 예외처리 해줘
		System.out.println("path: " + path);
	}
}
