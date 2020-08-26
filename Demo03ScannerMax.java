package cn.itcast.day07.demo01;

import java.util.Scanner;

/**
 * @Author: Malakh
 * @Date: 2020/8/12
 * @Describe:
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("max="+ max);
    }
}
