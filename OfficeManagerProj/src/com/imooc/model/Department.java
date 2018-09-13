package com.imooc.model;

public class Department {
	private String departmentNmae; // 部门名称
	private String departmentNo; // 部门编号
	private Employee[] employee; // 放置本部门员工对的数组
	private int employNum; // 统计部门员工数

	// 无参构造
	public Department() {

	}

	// 有参构造
	public Department(String departmentName, String departmentNo) {
		this.setDepartmentNmae(departmentName);
		this.setDepartmentNo(departmentNo);
	}

	public String getDepartmentNmae() {
		return departmentNmae;
	}

	public void setDepartmentNmae(String departmentNmae) {
		this.departmentNmae = departmentNmae;
	}

	public String getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}

	public Employee[] getEmployee() {
		// 判断部门数组是否实例化
		if (this.employee == null)
			this.employee = new Employee[200];
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}

	public int getEmployNum() {
		return employNum;
	}

	public void setEmployNum(int employNum) {
		this.employNum = employNum;
	}

	/**
	 * 职员信息与部门关联；统计该部门员工个数
	 * 
	 * @param ee
	 *            员工信息与部门关联
	 */
	public void addEmployee(Employee ee) {
		// 将职员信息保存到数组种
		for (int i = 0; i < this.getEmployee().length; i++) {
			if (this.getEmployee()[i] == null) {
				ee.setDepartment(this); // 职员信息与部门进行关联
				this.getEmployee()[i] = ee;
				// 将职员个数对应部门保存到EmployNum
				this.setEmployNum(i + 1);
				return;
			}
		}
	}

	/**
	 * 职员信息与部门、职务信息进行关联
	 * 
	 * @param ee
	 *            职员信息
	 * @param dt
	 *            职务信息
	 */
	public void addEmployee(Employee ee, Duties dt) {
		// 将职员信息保存到数组种
		for (int i = 0; i < this.getEmployee().length; i++) {
			if (this.getEmployee()[i] == null) {
				ee.setDepartment(this); // 将员工信息存入数组employee
				ee.setDuties(dt); // 将职务信息存入数组employee
				this.getEmployee()[i] = ee;
				// 将职员个数对应部门保存到EmployNum
				this.setEmployNum(i + 1);
				return;
			}
		}
	}

	/**
	 * 通过部门查询该部门下员工信息 返回：姓名、工号、性别、年龄、职务、职务编号
	 */
	public void info() {
		for (int i = 0; i < this.getEmployee().length; i++) {
			// 判断数组当中信息为空时后续不再循环输出
			if (this.getEmployee()[i] == null) {
				break;
			}
			System.out.println("姓名：" + this.getEmployee()[i].getEmployNmae() + "\n工号："
					+ this.getEmployee()[i].getEmployNo() + "\n性别：" + this.getEmployee()[i].getEmploySex() + "\n年龄："
					+ this.getEmployee()[i].getEmployAge()
					// + "\n部门："+ this.getEmployee()[i].getDepartment().getDepartmentNmae()
					// + "\n部门编号："+ this.getEmployee()[i].getDepartment().getDepartmentNo()
					+ "\n职务：" + this.getEmployee()[i].getDuties().getDutiesName() + "\n职务编号："
					+ this.getEmployee()[i].getDuties().getDutiesNo());
			System.out.println("************************************");
		}
	}
}
