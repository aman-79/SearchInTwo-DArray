import java.util.*;
public class searchintwod{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the row & coloum size");
		int size=obj.nextInt();
		System.out.println("Enter element in 2D array");
		int[][] arr=new int[size][size];

		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				arr[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter the target element");
		int target=obj.nextInt();

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i][j]==target){
					System.out.println(i+" "+j);
				}
			}
		}
		int ans=arr[0][0];

		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++){
			if(arr[i][j]>ans){
				ans=arr[i][j];
				System.out.println(ans);
			}
			System.out.println();

		}	
		


	}
}
}
