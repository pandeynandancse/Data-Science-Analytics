import java.util.*;
import java.lang.*;
import java.io.*;

class BloomFilter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String[] web = new String[8];
		String str,st;
	
		int sum;
		String[] web2 = new String[8];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n;i++){
			arr[i]=0;
		}
		
		for(int i=0;i<w;i++){
			web[i] = sc.next();
			
		}
		
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
			web2[i] = sc.next();
		}
		
		for(int i=0;i<w;i++){
			//System.out.println(web[i]);
			str = web[i];
			
			
				int x = h1(str,n);
				int y = h2(str,n);
				if(arr[x]==0){
					arr[x]=1;
				}
				
				if(arr[y]==0){
					arr[y]=1;
					
				}
				
				/*for(int j=0;j<n;j++){
				//System.out.println(arr[j]);
			}*/
			
			//System.out.println(h1(str,n));
			//System.out.println(h2(str,n));
			
		}
		for(int j=0;j<t;j++){
			st = web2[j];
			int h = h1(st,n);
			int l = h2(st,n);
			
				if(arr[h] == 1 && arr[l] == 1){
					System.out.println("Definitely Not");
				}
				else{
					System.out.println("May be");
				}
		}
		
	}
	// calculating hash one fuction
	public static int h1(String s,int n){
		int suma=0;
		for(int j=0; j<s.length(); j++){
				int a = s.charAt(j);
				suma = suma + a;
			}
			
			suma = suma % n;
			return suma;
	}
	
	// calculating second hash function
	public static int h2(String str2,int n){
		int sumb=0;
		for(int j=0; j<str2.length(); j++){
				int b = str2.charAt(j);
				b = b % 13;
				sumb = sumb + b;
 				
			}
			
			sumb = sumb % n;
			return sumb;
	}
	
	
}
