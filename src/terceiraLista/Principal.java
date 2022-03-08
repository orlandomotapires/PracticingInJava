package terceiraLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		List<Professor> professors = new ArrayList<>();
		
		System.out.print("How many teachers: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("\nTeachers name: ");
			String name = sc.nextLine();
			
			System.out.print("Departaments name: ");
			String departamentsName = sc.nextLine();
			
			System.out.print("Admission Date day,month,year: ");
			int day = sc.nextInt();
			int month = sc.nextInt();
			int year = sc.nextInt();
			
			System.out.print("Register number: ");
			sc.nextLine();
			String registerNumber = sc.nextLine();
			Data admissionDate = new Data(day, month, year);
			
			Professor professor = new Professor(name, departamentsName, admissionDate, registerNumber);
			professors.add(professor);
		}
		
		for(Professor p: professors) {
			System.out.println(p);
		}

	}

}
