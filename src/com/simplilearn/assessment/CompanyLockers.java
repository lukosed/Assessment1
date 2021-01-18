package com.simplilearn.assessment;

import java.io.IOException;
import java.util.Scanner;

public class CompanyLockers {
	int x;

	void mainMenu() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("|+|                              Welcome to Company Lockers Pvt Ltd                              |+|");
		System.out.println("|+|"+"                                                                                              "+"|+|");
		System.out.println("|+|"+"                    				Developer: Dileep Lukose                         |+|");
		System.out.println(
				"=====================================================================================================");
		
	}

	void mainMenuDisplay() {
		System.out.println("");
		System.out.println("		Please select the corresponding number from the following OPTIONS");
		System.out.println("");
		System.out.println("		1. Display files in Ascending order from C:\\Program Files ");
		System.out.println("		2. File Operations");
		System.out.println("		3. Close the Application ");
		System.out.println(" ");
	}

	void subDisplay() {
		System.out.println(" ");
		System.out.println("	Select from the following Options");
		System.out.println("	1. Add File to Root Directory");
		System.out.println("	2. Delete a File ");
		// user specified file
		// FNF return if not found

		System.out.println("	3. Search a file from Directory");
		// display result
		System.out.println("	4. Go to Main Menu");
		System.out.println(" ");
	}

	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("		Please Select From Options: ");
		System.out.print(" ");
		if (scan.hasNextInt()) {
			x = scan.nextInt();
			// System.out.println("Your entered value: " + x);
		} else {
			warning();
			getInput();

		}
		// scan.close();
	}

	void mainProcess() throws IOException {
		// System.out.println("value of x in main menu " + x);
		switch (x) {
		case 1:
			FileHandle fileSort = new FileHandle();
			fileSort.fileNameDisp();
			String[] menu = null;
			main(menu);
			// exitpgm();

		case 2:
			subProcess();

			break;
		case 3:
			exitpgm();
			break;
		default:
			System.out.println(" ");
			System.out.println(" ");
			warning();
			String[] menu2 = null;
			main(menu2);
		}

	}

	void subProcess() throws IOException {
		subDisplay();
		getInput();
		// System.out.println("value of x in submenu " + x);
		switch (x) {
		case 1:
			CreateFileE createFile = new CreateFileE();
			createFile.fileCreate();
			subProcess();
			// System.out.println("1 is SELECTED");

		case 2:
			DeleteFile1 deleteFile = new DeleteFile1();
			deleteFile.delteFile();
			subProcess();
		case 3:
			FileSearch searchF = new FileSearch();
			searchF.fileSearch();
			subProcess();
			// break;
		case 4:
			String[] menu = null;
			main(menu);
			break;
		default:
			warning();
			subProcess();

		}

	}

	void exitpgm() {
		System.out.println(" ");
		System.out.println("			Thank you for using the service!!!");
		java.lang.System.exit(0);
	}

	void warning() {
		System.out.println(" ");
		System.out.println("<<<<<<<<<<Invalid Selection>>>>>>>>>>>>>");
		System.out.println(" ");
		System.out.println("----------Please TRY AGAIN------------");
		System.out.println(" ");
	}

	public static void main(String[] args) throws IOException {
		CompanyLockers disp = new CompanyLockers();
		disp.mainMenu();
		disp.mainMenuDisplay();
		disp.getInput();
		disp.mainProcess();
		disp.exitpgm();
	}

}
