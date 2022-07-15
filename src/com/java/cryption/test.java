package com.java.cryption;

public class test {
	public static void main(String[] args) {
		int[] k = { 1, 124, 1212, 3523, 522, 68, 8};
		arrraylist a1 = new arrraylist(k);
		k = a1.Add(18);

		for (int s : k) {
			System.out.println(s);
		}
	}
}
