package com.imooc.model;

public class Department {
	private String departmentNmae; // ��������
	private String departmentNo; // ���ű��
	private Employee[] employee; // ���ñ�����Ա���Ե�����
	private int employNum; // ͳ�Ʋ���Ա����

	// �޲ι���
	public Department() {

	}

	// �вι���
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
		// �жϲ��������Ƿ�ʵ����
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
	 * ְԱ��Ϣ�벿�Ź�����ͳ�Ƹò���Ա������
	 * 
	 * @param ee
	 *            Ա����Ϣ�벿�Ź���
	 */
	public void addEmployee(Employee ee) {
		// ��ְԱ��Ϣ���浽������
		for (int i = 0; i < this.getEmployee().length; i++) {
			if (this.getEmployee()[i] == null) {
				ee.setDepartment(this); // ְԱ��Ϣ�벿�Ž��й���
				this.getEmployee()[i] = ee;
				// ��ְԱ������Ӧ���ű��浽EmployNum
				this.setEmployNum(i + 1);
				return;
			}
		}
	}

	/**
	 * ְԱ��Ϣ�벿�š�ְ����Ϣ���й���
	 * 
	 * @param ee
	 *            ְԱ��Ϣ
	 * @param dt
	 *            ְ����Ϣ
	 */
	public void addEmployee(Employee ee, Duties dt) {
		// ��ְԱ��Ϣ���浽������
		for (int i = 0; i < this.getEmployee().length; i++) {
			if (this.getEmployee()[i] == null) {
				ee.setDepartment(this); // ��Ա����Ϣ��������employee
				ee.setDuties(dt); // ��ְ����Ϣ��������employee
				this.getEmployee()[i] = ee;
				// ��ְԱ������Ӧ���ű��浽EmployNum
				this.setEmployNum(i + 1);
				return;
			}
		}
	}

	/**
	 * ͨ�����Ų�ѯ�ò�����Ա����Ϣ ���أ����������š��Ա����䡢ְ��ְ����
	 */
	public void info() {
		for (int i = 0; i < this.getEmployee().length; i++) {
			// �ж����鵱����ϢΪ��ʱ��������ѭ�����
			if (this.getEmployee()[i] == null) {
				break;
			}
			System.out.println("������" + this.getEmployee()[i].getEmployNmae() + "\n���ţ�"
					+ this.getEmployee()[i].getEmployNo() + "\n�Ա�" + this.getEmployee()[i].getEmploySex() + "\n���䣺"
					+ this.getEmployee()[i].getEmployAge()
					// + "\n���ţ�"+ this.getEmployee()[i].getDepartment().getDepartmentNmae()
					// + "\n���ű�ţ�"+ this.getEmployee()[i].getDepartment().getDepartmentNo()
					+ "\nְ��" + this.getEmployee()[i].getDuties().getDutiesName() + "\nְ���ţ�"
					+ this.getEmployee()[i].getDuties().getDutiesNo());
			System.out.println("************************************");
		}
	}
}
