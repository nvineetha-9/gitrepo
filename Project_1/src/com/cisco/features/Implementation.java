package com.cisco.features;

import java.util.Scanner;
import java.util.TreeSet;

public class Implementation {
	public static void main(String args[]) {
		System.out.println("Developed by Vineetha");
		int opt;
		
		System.out.println();
		while(true) {
			System.out.println("1.Retrieve files in ascending order\n"
					+ "2.User Interaction options\n"
					+ "3.Exit from application");
			System.out.println();
			System.out.println("Enter your option");
			Scanner sc= new Scanner(System.in);
			opt=sc.nextInt();
			String res;
			Operations op= new Operations();
			
			if(opt==1)
			{
				System.out.println("Files in ascending order");
				TreeSet<String> files=new TreeSet<String>();
				files=op.ascendingorder();
				for(String s: files)
					System.out.println(s);
				System.out.println();
				
			}
			
			else if(opt==2) {
				while(true) {
					System.out.println();
					System.out.println("1.To create file\n"
							+ "2.To delete file\n"
							+ "3.To search file\n"
							+ "4.To back main menu"
							);
					System.out.println();
					System.out.println("Enter your options");
					int option=sc.nextInt();
					if(option==1) {
						System.out.println("Enter file name to create ");
						String filename=sc.next();
						res=op.createfile(filename);
						System.out.println(res);
					}
					
					else if(option==2) {
						System.out.println("Enter file name to delete from directory");
						String filename=sc.next();
						res=op.deletefile(filename);
						System.out.println(res);
						
					}
					
					else if(option ==3) {
						System.out.println("Enter file name to search");
						String filename=sc.next();
						if(op.search(filename))
							System.out.println(filename+ " found in directory");
						else
							System.out.println(filename+ " not found ");
					}
					else if(option == 4)
						break;
					else
						System.out.println("Enter correct option");
					
				}
				
			}
			else if(opt==3)
				break;
			else
				System.out.println("Enter correct option");
			
		}

	}
			
		
}
