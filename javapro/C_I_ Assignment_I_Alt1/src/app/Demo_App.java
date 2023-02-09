package app;

import utility.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo_App {
	public static void main(String[] args) {

		String name;
		int eid;
		double salary;
		int choice=69;

		List<Employee> emps= new ArrayList<>();  // collection object for List(Array) created; 

		do {
			System.out.println("--------------");
			System.out.println("1. Accept ");
			System.out.println("2 Display ");
			System.out.println("3 Search");
			System.out.println("4 Delete");
			System.out.println("5 Modify ");
			System.out.println("6 Size");
			System.out.println("0 Exit ");
			System.out.println("--------------");

			System.out.println(" Enter your choice");
			Scanner sc= new Scanner(System.in);
			choice=sc.nextInt();

			switch(choice){
			case 1:
				System.out.println("Enter Employee Id name and salary");
				eid=sc.nextInt();
				name=sc.next();
				salary=sc.nextDouble();
				emps.add(new Employee(eid,name,salary));
				break;

			case 2:
				for(int i=0;i<emps.size();i++){
					System.out.println(emps.get(i));
				}
				break;

			case 3:
				System.out.println("Enter the id to be searched");
				int temp= sc.nextInt();
				boolean go=false;

				for(int i=0;i<emps.size();i++){
					if(temp== emps.get(i).getEid()) {
						go=true;
						break;
					}
				}
				if(go)
					System.out.println("Available");
				else
					System.out.println("Not Available");
				break;

			case 4:
				System.out.println("Enter the id to be deleted");
				int del=sc.nextInt();
				boolean oo=false;

				for(int i=0;i<emps.size();i++){
					if(del== emps.get(i).getEid()) {
						oo=true;
						break;
					}
				} 
				
			case 0:
				System.out.println("Break");
				break;
			}
		}while(choice!=0);
	}
}