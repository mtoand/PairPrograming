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
	    	String s = null;
	    	int m = n%100;
	    	int r= n%1000;
	    	if(n>=1000) {
	    		s = a[n/1000] + " thousand";
	    		if(r!=0&&r>100&&r<=999){
	    			if(r>=100) {
	    	    		s = s +" "+ a[r/100] + " hundred";
	    	    		if(m!=0&&m<20){
	    	        		s = s + a[m];
	    	    		}
	    	    		if(m>=20&&m<100) {s = s +" " + b[m/10] +" "+ a[m%10];}
	    	    	}	    			
	        	}	        	
	    	}
	    	
	    	if(n>=100&&n<1000) {
	    		s = a[n/100] + " hundred";
	    		if(m!=0&&m<20){
	        		s = s + a[m];
	        	}
	        	if(m>=20&&m<100) {s = s +" " + b[m/10] +" "+ a[m%10];}
	    	}
	    	if(n<20){
	    		if(n==0) {return "zero";}
	    		s = a[n];
	    	}
	    	if(n>=20&&n<100) {s = b[n/10] +" "+ a[n%10];}
	    	
	    	
	    	return s;
	    	}
	    
	
	
	
	}
