package com.java.cryption;

import java.util.Scanner;

public class encryption {
	// TODO1: 암호를 맞추지 못한다명 열수 없는 메세지 만들기

	public static void main(String[] args) {
		String C;
		Scanner s = new Scanner(System.in);

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
				m.MakeNumberString();
			}
			// MakeCryption n = new MakeCryption();
		}
		s.close();

	}
}
