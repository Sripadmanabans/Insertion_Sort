package insertion_sort_part2;

import java.util.Scanner;

public class InsertionSortPart2 
{
	public static void print(int ar[]) 
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
	
	public static void insertion(int ar[]) 
	{
		for(int i = 1; i < ar.length; i++)
		{
			int x = ar[i];
			int j = i;
			while(j > 0 && ar[j-1] > x)
			{
				int temp = ar[j];
				ar[j] = ar[j-1];
				ar[j-1] = temp;
				j--;
			}
			print(ar);
		}
	}
	
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int ar[] = new int[s];
		for(int i = 0; i < s; i++)
		{
			ar[i] = in.nextInt();
		}
		insertion(ar);
		in.close();
	}
}
