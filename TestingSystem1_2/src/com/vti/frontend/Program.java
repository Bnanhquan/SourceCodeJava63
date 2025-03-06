package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Program {
	public static void main(String[] args) {
		// Tao thong tin Department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 3;
		department2.name = "Maketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "BOD";

		// Tao thong tin Position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.Dev;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.Scrum_Master;

		Position position4 = new Position();
		position4.id = 4;
		position4.name = PositionName.Test;

		// Tao thong tin Account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "1@gmail.com";
		account1.username = "ac1";
		account1.fullname = "Ac cao 1";
		account1.department = department1;
		account1.position = position2;
		account1.creatDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "2@gmail.com";
		account2.username = "ac2";
		account2.fullname = "Ac cao 2";
		account2.department = department2;
		account2.position = position1;
		account2.creatDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "3@gmail.com";
		account3.username = "ac3";
		account3.fullname = "Ac cao 3";
		account3.department = department3;
		account3.position = position3;
		account3.creatDate = LocalDate.now();

		// Tao thong tin group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Football";
		group1.creator = account1;
		group1.creatDate = LocalDate.now();
		Account[] group1Accounts = { account1, account2 };
		group1.accounts = group1Accounts;

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Guitar";
		group2.creator = account2;
		group2.creatDate = LocalDate.now();
		Account[] group2Accounts = { account1, account3 };
		group2.accounts = group2Accounts;

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Mentor";
		group3.creator = account3;
		group3.creatDate = LocalDate.now();
		Account[] group3Accounts = { account2, account3 };
		group3.accounts = group3Accounts;

		// gan group vao Account
		Group[] account1Groups = { group1, group2 };
		account1.groups = account1Groups;

		Group[] account2Groups = new Group[2];
		account2Groups[0] = group1;
		account2Groups[1] = group3;
		account2.groups = account2Groups;

		Group[] account3Groups = { group2, group3 };
		account3.groups = account3Groups;

		// In ra thong tin Department
		System.out.println("-------------------------------------------");
		System.out.println(" Thông tin phòng ban 1 :");
		System.out.println("ID : " + department1.id);
		System.out.println("Name : " + department1.name);

		System.out.println("-------------------------------------------");
		System.out.println(" Thông tin phòng ban 2 :");
		System.out.println("ID : " + department2.id);
		System.out.println("Name : " + department2.name);

		System.out.println("-------------------------------------------");
		System.out.println(" Thông tin phòng ban 3 :");
		System.out.println("ID : " + department3.id);
		System.out.println("Name : " + department3.name);

		// In ra thong tin Position
		System.out.println("-------------------------------------------");
		System.out.println(" Thông tin position 1 :");
		System.out.println("ID : " + position1.id);
		System.out.println("Name : " + position1.name);

		System.out.println("-------------------------------------------");
		System.out.println(" Thông tin position 2 :");
		System.out.println("ID : " + position2.id);
		System.out.println("Name : " + position2.name);

		System.out.println("-------------------------------------------");
		System.out.println(" Thông tin position 3 :");
		System.out.println("ID : " + position3.id);
		System.out.println("Name : " + position3.name);

		System.out.println("-------------------------------------------");
		System.out.println(" Thông tin position 4 :");
		System.out.println("ID : " + position4.id);
		System.out.println("Name : " + position4.name);

		System.out.println("-------------------------------------------");
		// In ra man hinh thong tin Account
		System.out.println("Thong tin account 1 :");
		System.out.println("ID :" + account1.id);
		System.out.println("Email: " + account1.email);
		System.out.println("Username :" + account1.username);
		System.out.println("Department : " + account1.department.name);
		System.out.println("Position :" + account1.position.name);
		System.out.println("CreatDate :" + account1.creatDate);
		System.out.println("Group Account1 tham gia: " + account1.groups[0].name);

		System.out.println("-------------------------------------------");
		System.out.println("Thong tin account 2 :");
		System.out.println("ID :" + account2.id);
		System.out.println("Email: " + account2.email);
		System.out.println("Username :" + account2.username);
		System.out.println("Department : " + account2.department.name);
		System.out.println("Position :" + account2.position.name);
		System.out.println("CreatDate :" + account2.creatDate);
		System.out.println("Group Account2 tham gia: " + account2.groups[1].name);

		System.out.println("-------------------------------------------");
		System.out.println("Thong tin account 3 :");
		System.out.println("ID :" + account3.id);
		System.out.println("Email: " + account3.email);
		System.out.println("Username :" + account3.username);
		System.out.println("Department : " + account3.department.name);
		System.out.println("Position :" + account3.position.name);
		System.out.println("CreatDate :" + account3.creatDate);
		System.out.println("Group Account3 tham gia: " + account3.groups[0].name);

		System.out.println("-------------------------------------------");
		// in ra thong tin Group
		System.out.println("Thong tin group 1 ");
		System.out.println("ID :" + group1.id);
		System.out.println("Name :" + group1.name);
		System.out.println("Creator :" + group1.creator.fullname);
		System.out.println("CreatDate :" + group1.creatDate);

		System.out.println("-------------------------------------------");
		System.out.println("Thong tin group 2 ");
		System.out.println("ID :" + group2.id);
		System.out.println("Name :" + group2.name);
		System.out.println("Creator :" + group2.creator.fullname);
		System.out.println("CreatDate :" + group2.creatDate);

		System.out.println("-------------------------------------------");
		System.out.println("Thong tin group 3 ");
		System.out.println("ID :" + group3.id);
		System.out.println("Name :" + group3.name);
		System.out.println("Creator :" + group3.creator.fullname);
		System.out.println("CreatDate :" + group3.creatDate);
	}
}
