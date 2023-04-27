package member;

import java.sql.Date;

public class MemberVO {
	//db를 이용할땐 private써서 필드에 접근못하게한다. 
	private String email;
	private String pwd;
	private int postcode;
	private String address;
	private String detailaddress;
	private int phone1;
	private int phone2;
	private int phone3;
	private String name;
	private Date joinDate;
	
	public MemberVO() {
		
	}
	public MemberVO(String email, String pwd ,int postcode, String address , String detailaddress, int phone1, int phone2, int phone3, String name) {
		this.email=email;
		this.pwd=pwd;
		this.postcode=postcode;
		this.address=address;
		this.detailaddress=detailaddress;
		this.phone1=phone1;
		this.phone2=phone2;
		this.phone3=phone3;
		this.name=name;
	}
	public MemberVO(String email, String pwd ,int postcode, String address , String detailaddress, int phone1, int phone2, int phone3, String name, Date joinDate) {
		this(email, pwd, postcode, address, detailaddress, phone1, phone2, phone3, name);
		this.joinDate=joinDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetailaddress() {
		return detailaddress;
	}
	public void setDetailaddress(String detailaddress) {
		this.detailaddress = detailaddress;
	}
	public int getPhone1() {
		return phone1;
	}
	public void setPhone1(int phone1) {
		this.phone1 = phone1;
	}
	public int getPhone2() {
		return phone2;
	}
	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}
	public int getPhone3() {
		return phone3;
	}
	public void setPhone3(int phone3) {
		this.phone3 = phone3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
}