package pairPrograming;
import java.util.Scanner;

public class IntToEng {
	 // メインメソッド

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
    	String[] a={"","one","two","three","four","five","six","seven","eight","nine",
    			"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    	String[] b={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    	if(n<20){
    		if(n==0) {return "zero";}
    		return a[n];
    	}
        return b[n/10] +" "+ a[n%10];

    }



}
