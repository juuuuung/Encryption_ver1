package com.java.cryption;

public class MyRandom {
	int[] IntArray;
	int[] RandHistory;

	public MyRandom(int[] IntArray) {
		this.IntArray = IntArray;
	}

	// ? 배열을 뒤집어줌 return 뒤집어진 배열
	public int[] ReverseArray() {
		int[] reverse = new int[IntArray.length];

		for (int i = 0; i < IntArray.length; i++) {
			// ? 기존배열(IntArray) 의 마지막에서 부터 reverse의 첫번째로 저장함
			reverse[i] = IntArray[IntArray.length - (i + 1)];
		}

		return reverse;
	}

	// ? 배열을 섞어줌
	public int[] ShuffleArray() {
		int temp;
		int[] RandHistory = { 0 }; // ! <=== 0
		arrraylist a = new arrraylist(RandHistory);

		for (int i = 0; i < IntArray.length; i++) { //! <======== 문제 구간 고치기
			int RandInt = (int) (Math.random() * IntArray.length); // ! <==== (IntArray.length -1)
            System.out.println(RandInt);

			// ? RandHIstory 안에 RandInt와 같은 수가 나오지 않았다면 실행
			if (TurnArray(RandHistory, RandInt) == false) { // ? flase 라면
				// ? RandHistory에 새로운 RandInt추가
				RandHistory = a.Add(RandInt);

				temp = IntArray[i];
				IntArray[i] = IntArray[RandInt];
				IntArray[RandInt] = temp;
			} 
            // else {
			// 	i--;
			// }
		}
		this.RandHistory = RandHistory;
		return IntArray;
	}

	// ? 배열을 돌고 원하는 수를 찾음
	public boolean TurnArray(int[] array, int num) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
                System.out.println("array : "+ num);
				return true;
			} else {
				continue;
			}
		}
		return false;
	}

	public int[] ReturnRandHistory() {
		return RandHistory;
	}
}
