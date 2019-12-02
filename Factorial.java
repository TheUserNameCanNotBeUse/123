import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入計算階乘的整數:");
		int x = input.nextInt();
		int u = x ;
		System.out.printf("%d!=", x);
			for(int i=x;i>1;i--) {
				System.out.printf("%dx",i);
			u=u*(i-1);
				if(i==2)
				System.out.printf("1=%d",u);}
		// TODO Auto-generated method stub

	}

}
