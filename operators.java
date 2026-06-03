package com.tcs.prep;

import java.util.*;
import java.lang.*;
import java.io.*;

public class operators {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A > B) {
			System.out.print(">");

		} else if (A < B) {
			System.out.print("<");
		} else if (A == B) {
			System.out.print("=");
		}
	}

}
