package phase1Project;

import java.util.ArrayList;
import java.util.Scanner;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
					
		ArrayList<String> filelist = new ArrayList<String>();
		filelist.add("abc");
		filelist.add("def");
		filelist.add("ghi");
		
		while(true) {
			System.out.println("--------Welcome-------");
			System.out.println("Menu:");
			System.out.println("1. List the files\n2. Add the files\n3. Delete the files\n4. Search the file\n5. Exit");
			
			System.out.println("Please enter your choice: ");
			Scanner s = new Scanner(System.in);
			int ch = s.nextInt();
		
			switch(ch) {
			case 1:
				System.out.println(filelist);
				break;
			case 2: 
				System.out.println("Enter the number of files to be added");
				int num = s.nextInt();
				for(int i=1;i<=num;i++) {
					System.out.println("Enter the file " + i + " to be added");
					String addfile = s.next();
					filelist.add(addfile);
					
				}
				
				break;
			case 3:
				System.out.println("The available files are: ");
				System.out.println(filelist);
				System.out.println("Enter the file name to be deleted: ");
				String delfile = s.next();
				filelist.remove(delfile);
				System.out.println("The remaining files are: ");
				System.out.println(filelist);
				break;
				
			case 4:
				System.out.println("Enter the name of the file to be searched: ");
				String filesearch = s.next();
				Boolean yesno = filelist.contains(filesearch);
				if (yesno == true) {
					System.out.println("The file " + filesearch + " is available");
				
				}
				else {
					System.out.println("The file " + filesearch + " is not available");
				}
				break;
				
			case 5:
				System.out.println("Exiting the menu");
				System.exit(0);
			
			default:
				System.out.println("Enter a correct choice");
				break;
			
			}
		}	
		

	}

}

