package com.java.cryption;

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
			System.out.println(s);

		// ? shuffle한 암호문을 풀 수 있는 키 같은 용도
		super.RandHIstory = ran.ReturnRandHistory();
		for (int s : RandHIstory)
			System.out.println("dd" + s);
	}

	// ? 복호화
	@Override
	public void MakeNumberString() {
		int temp;
		for (int i = 0; i < Yet.length; i++) {
			temp = Yet[i];
			Yet[i] = Yet[RandHIstory[i]];
			Yet[RandHIstory[i]] = temp;
		}

		for (int s : Yet)
			System.out.println(s);

		super.MakeNumberString();

	}
}
