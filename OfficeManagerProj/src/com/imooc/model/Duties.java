package com.imooc.model;

public class Duties {
	private String dutiesNo; // ְ����
	private String dutiesName; // ְ������

	// �޲ι���
	public Duties() {

	}

	// �вι���
	public Duties(String dutiesNo, String dutiesName) {
		this.setDutiesName(dutiesName);
		this.setDutiesNo(dutiesNo);
	}

	public String getDutiesNo() {
		return dutiesNo;
	}

	public void setDutiesNo(String dutiesNo) {
		this.dutiesNo = dutiesNo;
	}

	public String getDutiesName() {
		return dutiesName;
	}

	public void setDutiesName(String dutiesName) {
		this.dutiesName = dutiesName;
	}

	/**
	 * ְ����Ϣ
	 * 
	 * @return ����ְ�����ơ�ְ����
	 */
	public String info() {
		String str = "ְ��" + this.getDutiesName() + "\nְ���ţ�" + this.getDutiesNo();
		return str;
	}
}
