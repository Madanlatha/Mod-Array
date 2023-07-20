package modArray;

import java.util.Scanner;

public class QuesModuleArray {
	public static int moduleArray(int arr[],int b) {
		int ans=0,pow=1;
		for(int i=arr.length-1;i>0;i--) {
			ans=(ans+((arr[i]%b)*pow)%b);
			pow=(pow*10)%b;                                                   
		}
		return ans%b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int b=sc.nextInt();    
		int value=moduleArray(arr,b);
		System.out.println(value);
	}

}
