package com.hand.lkl.Exam_12699_20161209_3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("请输入日期(格式为YYYY-MM-DD):");
		Scanner scanner = new Scanner(System.in);
		String strDate = scanner.nextLine();
		// 将年月日拆分
		String[] date = strDate.split("-");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		int total = 0;

		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
				total += 31;
				break;
			case 2:
				total += 29;
				break;
			case 3:
				total += 31;
				break;
			case 4:
				total += 30;
				break;
			case 5:
				total += 31;
				break;
			case 6:
				total += 30;
				break;
			case 7:
				total += 31;
				break;
			case 8:
				total += 31;
				break;
			case 9:
				total += 30;
				break;
			case 10:
				total += 31;
				break;
			case 11:
				total += 30;
				break;
			case 12:
				total += 31;
				break;
			default:
				break;
			}
		}
		if (!(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)&&month>2) {// 判断是不是闰年且月份大于2
			total -= 1;
		} 
		total=total+day;
		System.out.println("你输入的日期为当年的第"+total+"天");
	}
}
