package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int qtd = sc.nextInt();
		sc.nextLine();

		
		
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Employee #" + i + 1 + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			employee emp = new employee(id, name, salary);
			list.add(emp);
		}

		System.out.println("\nEnter the employee id that will have salary increase :");
		Integer id = sc.nextInt();

		sc.close();
	}

}
