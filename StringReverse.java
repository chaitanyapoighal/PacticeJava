package com.anudip.adv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReverse {

	public StringBuffer reverseString(String str) {
		char[] arr = str.toCharArray();
		StringBuffer strBuffer = new StringBuffer(str.length());
		int j = 0;

		for (int i = arr.length - 1; i >= 0; i--, j++) {

			if (arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z')
				strBuffer.append(arr[i]);
			
		}
		for (int i = 0; i <= arr.length-1; i++) {

			if (arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z')
				
		             ;
			else
				strBuffer.insert(i, arr[i]);
		}

		return strBuffer;
	}

	public static void main(String[] args) {
		StringReverse strReverse = new StringReverse();
       System.out.println("Ab#cdefg@i");
		System.out.println(strReverse.reverseString("Ab#cdefg@i"));
	}

}
