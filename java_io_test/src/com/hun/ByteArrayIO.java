package com.hun;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ByteArrayIO {

	public static void main(String[] args) throws IOException {
		int c;
		byte b [] = {'a', 'b', 'c', 'd'};
		
		//배열b 를 읽는 ByteArrayInputStream 객체를 생성
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);// byte 값 유니코드
		ByteArrayOutputStream  bOutput = new ByteArrayOutputStream ();
		System.out.println("문자를 읽어 대문자로 출력");
		while ((c = bInput.read()) != -1) {
			System.out.println((char)c);
			
			//객체 ByteArrayOutputStream에 대문자를 출력
			bOutput.write(Character.toUpperCase(((char)c)));
				}
		System.out.println();
		//객체 ByteArrayOutputStream을 출력하면 출력된 자료가 그대로 출력
		System.out.println(bOutput);
		
		// 배열 Arrays 메소드 toString() 사용하여 각각 입력 값과 출력 값을 출력
		System.out.println(Arrays.toString(b)); /// 배열 값을 모두 확인해 놓을수 있는 함수 
		System.out.println(Arrays.toString(bOutput.toByteArray()));
	}//main() END

}
