package phase1Project;

import java.util.ArrayList;


import java.util.Scanner;

import java.util.*;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean flag = true;
					
		ArrayList<String> filelist = new ArrayList<String>();
		filelist.add("abc");
		filelist.add("def");
		filelist.add("ghi");
		System.out.println("--------Welcome-------");
		System.out.println("Developer Details:\nName: Swaroop S\nEmail: swas@teksystems.com\nContact: 8296342910");
		
		while(flag) {
			
			System.out.println("\n\n----------Menu----------");
			System.out.println("1. Sort and list the file\n2. FileOperations\n3. Exit");
			
			System.out.println("Please enter your choice: ");
			Scanner s = new Scanner(System.in);
			int ch = s.nextInt();
		
			switch(ch) {
			case 1:
				filelist.sort(Comparator.naturalOrder());
				System.out.println(filelist);
				break;
			case 2: 
				while(flag) {
					System.out.println("----------FileOperations----------");
					System.out.println("1. List the files\n2. Add the files\n3. Delete the files\n4. Search the file\n5. Return to the main menu");
					int ch1 = s.nextInt();
					switch(ch1) {
					case 1:
						System.out.println(filelist);
						break;
					
					case 2:
						
						addfiles(filelist, s);
						break;
						
					case 3:
						deletefile(filelist, s);
						break;
						
					case 4:
						
						searchfile(filelist, s);
					break;
					
					case 5:
						flag = false;
						break;
					
					default:
						System.out.println("Enter a valid choice");
						break;
					}
				}
				flag = true;
				break;
				
			
				
			case 3:
				System.out.println("Exiting the menu");
				System.exit(0);
			
			default:
				System.out.println("Enter a correct choice");
				break;
			
			}
		}	
		

	}

	private static void searchfile(ArrayList<String> filelist, Scanner s) {
		System.out.println("Enter the name of the file to be searched: ");
		String filesearch = s.next();
		Boolean yesno = filelist.contains(filesearch);
		if (yesno == true) {
			System.out.println("The file " + filesearch + " is available");
		
		}
		else {
			System.out.println("The file " + filesearch + " is not available");
		}
	}

	private static void deletefile(ArrayList<String> filelist, Scanner s) {
		System.out.println("The available files are: ");
		System.out.println(filelist);
		System.out.println("Enter the file name to be deleted: ");
		String delfile = s.next();
		Boolean yesno = filelist.contains(delfile);
		if(yesno == true) {
			filelist.remove(delfile);
			System.out.println("The remaining files are: ");
			System.out.println(filelist);
		}
		else {
			System.out.println("File not available");
		}
	}

	private static void addfiles(ArrayList<String> filelist, Scanner s) {
		System.out.println("Enter the number of files to be added");
		int num = s.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter the file " + i + " to be added");
			String addfile = s.next();
			filelist.add(addfile);
			
		}
	}
	
}