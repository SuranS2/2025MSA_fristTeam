package kr.or.kosa.utils;

import java.io.IOException;

/*
���赵
A ����
B ����

A������ Ŭ������ �� �� ����� ���״� ���� ����ó���� �ϰ� ��
B������ �׷��� ����ó���� ���� �ʾƵ� �ڵ�����... ����ó��
����ó�� Ŭ����

A���� ���� ���� >> throws >> try ~ ... ����
���ܸ� ���� �� ���� �� �־ s�� ����

 */

public class ExClass {
	public ExClass(String path) throws IOException, NullPointerException{//������ ���� ����ó�� ����
		System.out.println("path: " + path);
	}
}
