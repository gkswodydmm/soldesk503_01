package Main.service;

import Main.DAO.MemberDao;
import Main.DTO.MemberDTO;

public class MemberInfoPrinter {
	private MemberDao memberDao;
	private MemberPrinter memberPrinter;
	// 의족 객체 주입: Dependency injection(DI)
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao	= memberDao;
	}
	// 의족 객체 주입: Dependency injection(DI)
	public void setMemberPrinter(MemberPrinter memberPrinter) {
		this.memberPrinter = memberPrinter;
	}
	public void printMemberInfo(String email) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if (dto == null) {
			System.out.println("데이터 없음\n");			
			return;
		}
		memberPrinter.print(dto);
		
	}
}
