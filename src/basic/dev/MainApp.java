package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		//10.1 kiem tra so nguyen am hay duong
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nguyen a");
		int a = sc.nextInt();
		switch (a) {
		case 0:
			
		// 10.2 kiem tra n chia het cho 3 hay 5
			System.out.println("nhap  so nguyen n");
			int n = sc.nextInt();
			switch(a) {
			case 15:
				System.out.println("so chia het cho 3");
			break;
			case 20:
				System.out.println("so chia het cho 5");
			break;
			}
		//10.3 viet phuong trinh nhap vao thang trong nam 
		System.out.println("Nhap thang trong nam");
			int m = sc.nextInt();
			switch (m) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.err.println("Thang co 31 ngay");
			break;
			case 4, 6, 9, 11:
				System.err.println("Thang co 30 ngay");
			break;
			case 2:
				System.err.println("Thang co 28 ngay");
			break;
		// 10.4 viet phuong trinh giai phuong trinh bac 2	
		}
			
		}
		
			
		
		
		
	}
		
}


