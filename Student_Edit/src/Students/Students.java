package Students;

import java.util.Scanner;

public class Students {
	static int nextStd=0;
	static String[] std=new String [20];
	
	static void add()
	{
		System.out.println("Enter Student name");
		Scanner sc=new Scanner(System.in);
		String stdName=sc.next();
		std[nextStd]=stdName;
		nextStd=nextStd+1;
		System.out.println("Added successfully");

	}
	static void update()
	{
		String updateStd="";
		System.out.println("Enter the updated student name");
		Scanner sc = new Scanner (System.in);
		updateStd= sc.next();
		boolean flag=false;
		for (int i=0; i<=nextStd-1; i++)
			{
				if (std[i].equals(updateStd))
			
				{
					flag=true;
					System.out.println("Please insert the new name");
					std[i]= sc.next();
					break;
				}
			}
		if (flag==false)
			System.out.println(updateStd+ " was not found in an index ");
	}
	static void Delete()
	{
		String deleteStd="";
		System.out.println("Enter the student name that you want to delete ");
		Scanner sc = new Scanner (System.in);
		deleteStd= sc.next();
		boolean flag=false;
		int index =-1;
		for (int i=0; i<=nextStd-1; i++)
			{
				if (std[i].equals(deleteStd))
			
				{
					flag=true;
					index = i;
					break;
				}
			}
		for (int j=index; j<nextStd-1; j++)
		{
			std[j] = std[j+1];
		}
		nextStd=nextStd-1;
		if (flag==true)
			System.out.println("Delete successful");
		else
			System.out.println(deleteStd+ " was not found in an index ");
	}
	static void Search()
	{
		String searchStd="";
		System.out.println("Enter the student name that you are searching for");
		Scanner sc = new Scanner (System.in);
		searchStd= sc.next();
		boolean flag=false;
		for (int i=0; i<=nextStd-1; i++)
			{
				if (std[i].equals(searchStd))
			
				{
					flag=true;
					System.out.println("I found "+ searchStd + " in index "+ i);
					break;
				}
			}
		if (flag==false)
			System.out.println(searchStd+ " was not found in an index ");
	}
	static void Show()
	{
		for (int i=0; i<=nextStd-1; i++)
			System.out.println(std[i]);
	}
	static void exit()
	{
		System.out.println("Thanks for using our program");
	}
	static void Print()
	{
		System.out.println("Please Enter");
		System.out.println("1 for Add student");
		System.out.println("2 for Update student");
		System.out.println("3 for Delete student");
		System.out.println("4 for Search student");
		System.out.println("5 for Show student");
		System.out.println("6 for Exit student");
	}
	static void Menu(int choice)
	{
		switch (choice){
			case 1: add();
			break;
			case 2: update();
			break;
			case 3: Delete();
			break;
			case 4: Search();
			break;
			case 5: Show();
			break;
			case 6:
					exit();
			break;		
			default: 
				System.out.println("Please enter a right choice:");
		}
	}

	public static void main(String[] args) {
		int userChoice=0;
		while (userChoice!=6)
		{	
		Print();
		Scanner sc=new Scanner(System.in);
		 userChoice=sc.nextInt();
		 Menu(userChoice);
		}
	}

}
