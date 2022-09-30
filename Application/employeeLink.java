package com.masai.Application;

import java.util.Scanner;

import com.masai.usecases.applyForLeaveUsecase;
import com.masai.usecases.employeeUpdateProfileUsecase;
import com.masai.usecases.getEmployeeById;
import com.masai.usecases.updatepasswordEmpUsecase;

public class employeeLink {
	
	public  static void linkingEmployeeMethod() {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("----Welcome Employee----");
		
		System.out.println();
		System.out.println("Press 1 . View Your Profile ");
		System.out.println();
		System.out.println("Press 2 . for Update Profile ");
		System.out.println();
		System.out.println("Press 3 . Change PassWord");
		System.out.println("");
		System.out.println("Press 4 . Apply For Leaves");
		System.out.println();
		System.out.println("Press 5 . Exit");
		System.out.println();
		
		int choice=sc.nextInt();
		
		
		switch (choice) {
		case 1: {
			getEmployeeById.viewEmployById();
			break;
		}
		case 2: {
				employeeUpdateProfileUsecase.updateProfile();
				break;
				}
		case 3: {
			updatepasswordEmpUsecase.changePassword();
			break;
			
		}
		case 4: {
			applyForLeaveUsecase.applyLeaves();
			break;
			
		}
		case 5: {
			System.out.println("Application Closed");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
		
		
		
		
	}

}
