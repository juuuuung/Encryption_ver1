package com.java.cryption;

import javax.naming.spi.DirStateFactory.Result;

public class RealEncryption extends MakeCryption {

	public RealEncryption(String K, String C) {
		super(K, C);
	}

	@Override
	public void MakeStringNumber() {
		SplitK();
		super.MakeStringNumber();
		MyRandom ran = new MyRandom(Yet);

		// ? 암호문 배열을 shuffle 함
		Yet = ran.ShuffleArray();
		

		for (int s : Yet)
			System.out.println("Yet : "+s);

		// ? shuffle한 암호문을 풀 수 있는 키 같은 용도
		super.RandHIstory = ran.ReturnRandHistory();
		for (int s : RandHIstory)
			System.out.println("Key : " + s);
	}

	// ? 복호화
	@Override
	public String MakeNumberString() {
		//! 복호화 작업이 너무 어려움 랜덤으로 섞은 배열을 
		//! 어떻게 다시 풀어야 할지 모르겠음
		for (int i = 0; i < Yet.length; i++) {
			
		}

		for (int s : Yet)
			System.out.println(s);

		//? return Result = C;
		super.MakeNumberString();

		return C;
	}
}
