package com.imooc.model;

public class Duties {
	private String dutiesNo; // 职务编号
	private String dutiesName; // 职务名称

	// 无参构造
	public Duties() {

	}

	// 有参构造
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
	 * 职务信息
	 * 
	 * @return 返回职务名称、职务编号
	 */
	public String info() {
		String str = "职务：" + this.getDutiesName() + "\n职务编号：" + this.getDutiesNo();
		return str;
	}
}
