package Main.DTO;

import java.util.Date;

public class MemberDTO {
	private Long Id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public void changePassword(String olePwd, String newPwd) {
		if (password.equals(olePwd)) {
			password = newPwd;
		}else {
			System.out.println("현재 비밀번호가 틀립니다.");
		}
	}
}
