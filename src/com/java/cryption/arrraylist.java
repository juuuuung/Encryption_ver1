package com.java.cryption;

public class arrraylist {
	int[] IntArray = {0};

	// ? LastIndex는 배열마지막 인덱스를 알려줌 (배열의 크기에서 -1)
	public arrraylist(int[] IntArray) {
		this.IntArray = IntArray;
	}

	int LastIndex;

	public int[] Add(int item) {
		LastIndex = IntArray.length-1;

			int[] TempArray = new int[IntArray.length +1];
			//? temp에 처음 데이터를 넣어줌
			for(int i=0; i < IntArray.length; i++) {
				TempArray[i] = IntArray[i];
			}
			IntArray = TempArray;

		// ? 커진 배열에서 LastIndex+1을 해준 곳에 item 저장
		IntArray[LastIndex + 1] = item;
		LastIndex += 1;
		return IntArray;
	}
}
