package com.practice.day1;

import java.util.*;

public class PalindromeSwap {

			public static int getSwap(String str)
			{
				int num = str.length();
				char ch[] = str.toCharArray();
				int count = 0;
				
				for (int i = 0; i < num / 2; i++) {
					int left = i;
					int right = num - left - 1;
					while (left < right) {
						if (ch[left] == ch[right]) {
							break;
						}
						else {
							right--;
						}
					}

					if (left == right) {
						return -1;
					}
					else if (ch[left] != ch[num - left - 1]) {
						char temp = ch[right];
						ch[right] = ch[num - left - 1];
						ch[num - left - 1] = temp;
						count++;
					}
				}

				return count;
			}

		
			public static void main(String[] args)
			{
				String str = "";
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter a value : ");
			    str = scan.next();

				int count = getSwap(str);
				System.out.println(count);
			}


}
