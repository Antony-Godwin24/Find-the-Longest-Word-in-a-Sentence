import java.util.*;
public class BiggerLengthWord{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		String arr[]=str.split(" ");
		int max=arr[0].length();
		String mx=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i].length()  && max!=arr[i].length()){
				max=arr[i].length();
				mx=arr[i];
			}
		}
		System.out.println("The biggest Length Word is "+mx+" with Length "+max);
	}
}
				