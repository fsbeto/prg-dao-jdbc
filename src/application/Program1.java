package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=== TESTE 1: department insert ===");
		Department newDepartment = new Department(null, "Games");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("\n=== TESTE 2: department update ===");
		newDepartment.setId(10);
		newDepartment.setName("Utilities");
		departmentDao.update(newDepartment);
		System.out.println("Update completed");
		
		System.out.println("\n=== TESTE 3: department delete ===");
        System.out.println("Enter id for delete teste: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
        
        sc.close();
	}
}
