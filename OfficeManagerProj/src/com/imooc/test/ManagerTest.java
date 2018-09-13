package com.imooc.test;

import com.imooc.model.Department;
import com.imooc.model.Duties;
import com.imooc.model.Employee;

public class ManagerTest {

	public static void main(String[] args) {
		Department person = new Department("���²�", "R001");
		Department market = new Department("�г���", "S002");
		Duties manager = new Duties("M001", "����");
		Duties assistant = new Duties("A002", "����");
		Duties staff = new Duties("S003", "ְԱ");

		Employee ee1 = new Employee("����", "S001", 29, "��");
		System.out.println(ee1.info(person, manager));
		System.out.println("====================================");
		Employee ee2 = new Employee("���", "S002", 21, "Ů");
		System.out.println(ee2.info(person, assistant));
		System.out.println("====================================");
		Employee ee3 = new Employee("�ﳬ", "S004", 29, "��");
		System.out.println(ee3.info(person, staff));
		System.out.println("====================================");
		Employee ee4 = new Employee("������", "S005", 26, "Ů");
		System.out.println(ee4.info(market, staff));
		System.out.println("====================================");
		Employee ee5 = new Employee("����", "S006", 37, "��");
		System.out.println(ee5.info(market, manager));
		System.out.println("====================================");
		Employee ee6 = new Employee("����", "S007", 24, "Ů");
		System.out.println(ee6.info(market, staff));
		System.out.println("====================================");

		// �����²�ְԱ��������²�
		person.addEmployee(ee1, manager);
		person.addEmployee(ee2, assistant);
		person.addEmployee(ee3, staff);
		// ���г���ְԱ������г���
		market.addEmployee(ee4, staff);
		market.addEmployee(ee5, manager);
		market.addEmployee(ee6, staff);
		// ���ͳ�ƵĶ�Ӧ����������
		System.out.println(person.getDepartmentNmae() + "�ܹ���" + person.getEmployNum() + "��Ա��");
		System.out.println(market.getDepartmentNmae() + "�ܹ���" + market.getEmployNum() + "��Ա��");

		 System.out.println("\n------------------------------------");
		 //��ѯ���²�ְԱ
		 System.out.println("���ţ�"+person.getDepartmentNmae()+person.getEmployNum()+"��"+"�����ű�ţ�"+person.getDepartmentNo()+"����������Ա��");
		 person.info();
		 //��ѯ�г���ְԱ
		 System.out.println("���ţ�"+market.getDepartmentNmae()+market.getEmployNum()+"��"+"�����ű�ţ�"+market.getDepartmentNo()+"����������Ա��");
		 market.info();
	}
}
