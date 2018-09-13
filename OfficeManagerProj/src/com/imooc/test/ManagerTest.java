package com.imooc.test;

import com.imooc.model.Department;
import com.imooc.model.Duties;
import com.imooc.model.Employee;

public class ManagerTest {

	public static void main(String[] args) {
		Department person = new Department("人事部", "R001");
		Department market = new Department("市场部", "S002");
		Duties manager = new Duties("M001", "经理");
		Duties assistant = new Duties("A002", "助理");
		Duties staff = new Duties("S003", "职员");

		Employee ee1 = new Employee("张铭", "S001", 29, "男");
		System.out.println(ee1.info(person, manager));
		System.out.println("====================================");
		Employee ee2 = new Employee("李艾爱", "S002", 21, "女");
		System.out.println(ee2.info(person, assistant));
		System.out.println("====================================");
		Employee ee3 = new Employee("孙超", "S004", 29, "男");
		System.out.println(ee3.info(person, staff));
		System.out.println("====================================");
		Employee ee4 = new Employee("张美美", "S005", 26, "女");
		System.out.println(ee4.info(market, staff));
		System.out.println("====================================");
		Employee ee5 = new Employee("蓝迪", "S006", 37, "男");
		System.out.println(ee5.info(market, manager));
		System.out.println("====================================");
		Employee ee6 = new Employee("米莉", "S007", 24, "女");
		System.out.println(ee6.info(market, staff));
		System.out.println("====================================");

		// 将人事部职员添加至人事部
		person.addEmployee(ee1, manager);
		person.addEmployee(ee2, assistant);
		person.addEmployee(ee3, staff);
		// 将市场部职员添加至市场部
		market.addEmployee(ee4, staff);
		market.addEmployee(ee5, manager);
		market.addEmployee(ee6, staff);
		// 输出统计的对应部门人数和
		System.out.println(person.getDepartmentNmae() + "总共有" + person.getEmployNum() + "名员工");
		System.out.println(market.getDepartmentNmae() + "总共有" + market.getEmployNum() + "名员工");

		 System.out.println("\n------------------------------------");
		 //查询人事部职员
		 System.out.println("部门："+person.getDepartmentNmae()+person.getEmployNum()+"人"+"，部门编号："+person.getDepartmentNo()+"，有以下人员：");
		 person.info();
		 //查询市场部职员
		 System.out.println("部门："+market.getDepartmentNmae()+market.getEmployNum()+"人"+"，部门编号："+market.getDepartmentNo()+"，有以下人员：");
		 market.info();
	}
}
