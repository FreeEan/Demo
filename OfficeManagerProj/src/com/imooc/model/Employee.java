package com.imooc.model;

public class Employee {
	private String employNmae; // Ա������
	private String employNo; // Ա������
	private int employAge; // Ա������
	private String employSex; // Ա���Ա�
	private Department department; // ������Ϣ
	private Duties duties; // ְ����Ϣ

	// �޲ι���
	public Employee() {

	}

	/**
	 * �вι���
	 * 
	 * @param employName
	 *            Ա������
	 * @param employNo
	 *            Ա�����
	 * @param employAge
	 *            Ա������
	 * @param employSex
	 *            Ա���Ա�
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
		// �趨�����޶�����ֻ����18--65֮��,��֮������Ĭ��Ϊ18��
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
		// �趨�����޶��Ա�ֻ���ǡ��С����ߡ�Ů��,��֮������Ĭ��Ϊ"��"
		if (employSex.equals("��") | employSex.equals("Ů")) {
			this.employSex = employSex;
		} else {
			this.employSex = "��";
		}
	}

	/**
	 * ��ȡ������Ϣ�����û��ʵ��������ʵ�����ٷ���
	 * 
	 * @return ������Ϣ
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
	 * ��ȡְ����Ϣ�����û��ʵ��������ʵ�����ٷ���
	 * 
	 * @return ְ����Ϣ
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
	 * Ա�����ܷ���
	 * 
	 * @return Ա��������Ϣ���������������š��Ա�����
	 */
	public String info() {
		String str = "������" + this.getEmployNmae() + "\n���ţ�" + this.getEmployNo() + "\n�Ա�" + this.getEmploySex()
				+ "\n���䣺" + this.getEmployAge();
		return str;
	}

	/**
	 * Ա�����ܷ���
	 * 
	 * @param department
	 *            ����
	 * @param duties
	 *            ְ��
	 * @return ����Ա��������Ϣ�����������š��Ա����䡢����ְ��
	 */
	public String info(Department department, Duties duties) {
		String str = "������" + this.getEmployNmae() + "\n���ţ�" + this.getEmployNo() + "\n�Ա�" + this.getEmploySex()
				+ "\n���䣺" + this.getEmployAge() + "\nְ��" + department.getDepartmentNmae() + duties.getDutiesName();
		return str;
	}
}
