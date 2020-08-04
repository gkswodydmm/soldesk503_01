package Main.service;

import java.util.Collection;

import Main.DAO.MemberDao;
import Main.DTO.MemberDTO;

public class MemberListPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	// 의족 객체 주입: Dependency injection(DI)
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	public void printAll() {
		Collection<MemberDTO> lists = memberDao.selectAll();
		System.out.println("총 회원 수는: " + lists.size());
		for(MemberDTO dto :lists ) {
			printer.print(dto);
			
		}
	}
}
