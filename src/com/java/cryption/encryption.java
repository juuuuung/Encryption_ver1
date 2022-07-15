package com.java.cryption;

import java.util.Scanner;

public class encryption {
	// TODO1: 암호를 맞추지 못한다명 열수 없는 메세지 만들기

	public static void main(String[] args) {
		String C;
		Scanner s = new Scanner(System.in);
		int[] his = {23,2351,2,7,354,2,1};

		while (true) {
			// ? 보낼 문자 적기
			System.out.println("go write: ");
			C = s.nextLine();
			C = C.trim();

			if (C.equals("exit")) {
				break;
			} else {
				MakeCryption m = new MakeCryption("b10", C);
				m.SplitK();
				m.MakeStringNumber();

				for(int i=0; i < m.Yet.length; i++){
					System.out.printf("%d ",m.Yet[i]);
				}

				m.MakeNumberString();

				MyRandom r = new MyRandom(his);
				his = r.ShuffleArray();

				for(int jon : his){
					System.out.println(jon);
				}
			}
		}
		s.close();

	}
}
