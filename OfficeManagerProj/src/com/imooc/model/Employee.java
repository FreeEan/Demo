package com.imooc.model;

public class Employee {
	private String employNmae; // 员工姓名
	private String employNo; // 员工工号
	private int employAge; // 员工年龄
	private String employSex; // 员工性别
	private Department department; // 部门信息
	private Duties duties; // 职务信息

	// 无参构造
	public Employee() {

	}

	/**
	 * 有参构造
	 * 
	 * @param employName
	 *            员工姓名
	 * @param employNo
	 *            员工编号
	 * @param employAge
	 *            员工年龄
	 * @param employSex
	 *            员工性别
	 */
	public Employee(String employName, String employNo, int employAge, String employSex) {
		this.setEmployNmae(employName);
		this.setEmployNo(employNo);
		this.setEmployAge(employAge);
		this.setEmploySex(employSex);
	}

	public String getEmployNmae() {
		return employNmae;
	}

	public void setEmployNmae(String employNmae) {
		this.employNmae = employNmae;
	}

	public String getEmployNo() {
		return employNo;
	}

	public void setEmployNo(String employNo) {
		this.employNo = employNo;
	}

	public int getEmployAge() {
		return employAge;
	}

	public void setEmployAge(int employAge) {
		// 设定方法限定年龄只能是18--65之间,反之则设置默认为18岁
		if (employAge < 18 | employAge > 65) {
			this.employAge = employAge;
		} else {
			this.employAge = employAge;
		}
	}

	public String getEmploySex() {
		return employSex;
	}

	public void setEmploySex(String employSex) {
		// 设定方法限定性别只能是“男”或者“女”,反之则设置默认为"男"
		if (employSex.equals("男") | employSex.equals("女")) {
			this.employSex = employSex;
		} else {
			this.employSex = "男";
		}
	}

	/**
	 * 获取部门信息，如果没有实例化，先实例化再返回
	 * 
	 * @return 部门信息
	 */
	public Department getDepartment() {
		if (department == null)
			this.department = new Department();
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * 获取职务信息，如果没有实例化，先实例化再返回
	 * 
	 * @return 职务信息
	 */
	public Duties getDuties() {
		if (duties == null)
			this.duties = new Duties();
		return duties;
	}

	public void setDuties(Duties duties) {
		this.duties = duties;
	}

	/**
	 * 员工介绍方法
	 * 
	 * @return 员工介绍信息，包括姓名、工号、性别、年龄
	 */
	public String info() {
		String str = "姓名：" + this.getEmployNmae() + "\n工号：" + this.getEmployNo() + "\n性别：" + this.getEmploySex()
				+ "\n年龄：" + this.getEmployAge();
		return str;
	}

	/**
	 * 员工介绍方法
	 * 
	 * @param department
	 *            部门
	 * @param duties
	 *            职务
	 * @return 返回员工介绍信息，姓名、工号、性别、年龄、部门职务
	 */
	public String info(Department department, Duties duties) {
		String str = "姓名：" + this.getEmployNmae() + "\n工号：" + this.getEmployNo() + "\n性别：" + this.getEmploySex()
				+ "\n年龄：" + this.getEmployAge() + "\n职务：" + department.getDepartmentNmae() + duties.getDutiesName();
		return str;
	}
}
