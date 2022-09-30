package com.masai.Application;

import java.util.Scanner;
import com.masai.usecases.RegisterDepartmentUsecase;
import com.masai.usecases.RegisterEmployeeUsecase;
import com.masai.usecases.RejectLeavesUsecase;
import com.masai.usecases.acceptLeavesUsecase;
import com.masai.usecases.getAllDepartmentUsecase;
import com.masai.usecases.transferDepartmentUsecase;
import com.masai.usecases.updateDepartmentUsecase;

public class adminLink {

	
	public  static void linkingAdmin() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hellow Welcome Admin");
		System.out.println();
		System.out.println();
		
		System.out.println("Press 1. Admin can add new Departments.");
		System.out.println("Press 2. view all Department ");
		System.out.println("Press 3. Update The Department ");
		System.out.println("Press 4. register new Employees ");
		System.out.println("Press 5. transfer them to other departments.");
		System.out.println("Press 6. Accept leaves");
		System.out.println("Press 7. Reject Leaves");
		System.out.println("Press 8. For Exit ");
		
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1: {
			RegisterDepartmentUsecase.register();
			break;
		}
		case 2: {
			getAllDepartmentUsecase.viewAllDepartment();
			break;
		}
		case 3: {
			updateDepartmentUsecase.updatedept();
			break;
		}
		case 4: {
			RegisterEmployeeUsecase.registerEmployee();
			break;
		}
		case 5: {
			transferDepartmentUsecase.transferdepart();
			break;
		}
		case 6: {
			acceptLeavesUsecase.acceptLeaves();
			break;
		}
		case 7: {
			RejectLeavesUsecase.rejectLeaves();
			break;
		}
		case 8: {
			System.out.println("Application Closed");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
		
	}
}
