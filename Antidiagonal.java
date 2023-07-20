package sample;

import java.util.Scanner;

public class Antidiagonal {
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++) {
      	for(int j=0;j<col;j++) {
      		arr[i][j]=sc.nextInt();
      	}
        }
        for(int x=0;x<col;x++) {
      	  int i=0;
      	  int j=x;
      	  while(i<row&&j>=0) {
      		  System.out.print(arr[i][j]);
      		  i++;
      		  j--;
      	  }System.out.println(" ");
        }
        for(int y=0;y<row;y++) {
      	  int j=col-1;
      	int  i=y;
      	while(j>=0&&i<row) {
      		System.out.print(arr[i][j]);
      		i++;
      		j--;
      	}System.out.println(" ");
        }
	}


}


