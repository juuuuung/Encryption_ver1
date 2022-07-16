package com.java.cryption;

import javax.naming.spi.DirStateFactory.Result;
import javax.print.DocFlavor.STRING;

//? ---------
class MakeCryption {
	
	int[] RandHIstory;
	
	// ? 평문
	String C;
	
	//? 배열
	int[] Yet = new int[1];
	
	int[] RandYet = new int[Yet.length];

	// ? 암호 키
	String K;
	
	// ? 암호키 숫자
	int k;
	
	//? 암호문의 숫자들을 저장한 배열
	
	public MakeCryption() {
		this("b1", "NONE");
	}
	
	public MakeCryption(String K, String C) {
		this.K = K;
		this.C = C;
	}
	
	
	// ? 키를 숫자부분만 자르기
	public void SplitK() {
		int k = Integer.parseInt(K.substring(1));
	}
	
	//? 평문을 숫자로 만든후 더함
	public void MakeStringNumber(){
		//? 저장할 배열 생성
		int[] YetString = new int[C.length()];

		for(int i=0; i < C.length(); i++){
			//? YetString에 평문(C)를 아스키 코드로 변환후 키(k)를 더한 값을 저장
			YetString[i] = (int)C.charAt(i) + k;
		}
		//? 암호화 한후 평문을 바꿔줌
		C = "NONE";

		//? Yet에 암호 배열 (YetString) 저장
		Yet = YetString;

		System.out.println("C : none");
	}

	//? 암호문을 평문으로 바꿈
	public String MakeNumberString(){
		C="";
		for(int i=0; i < Yet.length; i++){
			C += (char)(Yet[i]-k);
		}
		return C;
	}
}