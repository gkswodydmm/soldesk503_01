package Main.service;

import java.util.Date;

import Main.DAO.MemberDao;
import Main.DTO.MemberDTO;
import Main.DTO.RegisterRequest;

public class MemberRegisterService {
	// 의존 객체
	private MemberDao memberDao;
	// 의족 객체 주입: Dependenc
	public  MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	public void regist(RegisterRequest req) {
		MemberDTO dto = memberDao.selectByEmail(req.getEmail());
		if(dto == null) {
		dto = new MemberDTO();
		dto.setEmail(req.getEmail());
		dto.setName(req.getName());
		dto.setPassword(req.getPassword());
		dto.setRegisterDate(new Date());
		memberDao.insert(dto);
		System.out.println("사용자 등록이 완료 되었습니다.");
		}else {
			System.out.println("중복 사용자 입니다.");
		}
		}
}
