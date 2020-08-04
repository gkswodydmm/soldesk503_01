package Main.service;

import Main.DAO.MemberDao;
import Main.DTO.MemberDTO;

public class MemberInfoPrinter {
	private MemberDao memberDao;
	private MemberPrinter memberprinter;
	// 의존 객체 주입: Dependency injection(DI)
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao	= memberDao;
	}
	// 의존 객체 주입: Dependency injection(DI)
	public void setMemberPrinter(MemberPrinter memberprinter) {
		this.memberprinter = memberprinter;
	}
	public void printMemberInfo(String email) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if (dto == null) {
			System.out.println("데이터 없음\n");			
			return;
		}
		memberprinter.print(dto);
		
	}
}
