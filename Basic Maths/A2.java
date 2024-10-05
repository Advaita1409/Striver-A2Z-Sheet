//Problem Statement: Given an integer N return the reverse of the given number.
import java.util.Scanner;
public class A2 {
	public static long reverseBits(long n) {
		long revNum=0;
		while (n>0){
			long ld = 0;
			ld = n % 10;
			revNum = (revNum*10) + ld;
			n=n/10;
		}
		return revNum;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n =sc.nextInt();
		reverseBits(n);
	}
}

