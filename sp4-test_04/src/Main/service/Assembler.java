package Main.service;

import Main.DAO.MemberDao;

public class Assembler {//객체 조립기
	private  MemberDao memberDao;
	private MemberPrinter printer;
	private MemberRegisterService memberRegisterService;
	private MemberListPrinter memberListPrinter;
	private ChangePasswordService changePasswordService;
	private MemberInfoPrinter memberInfoPrinter;
	public Assembler() {
		this.memberDao = new MemberDao();
		this.printer = new MemberPrinter();
		this.memberRegisterService = new MemberRegisterService(memberDao);
		this.memberListPrinter = new MemberListPrinter(memberDao, printer);
		this.changePasswordService = new ChangePasswordService();
		this.memberInfoPrinter = new MemberInfoPrinter();
		
	}
	public MemberInfoPrinter getMemberInfoPrinter() {
		memberInfoPrinter.setMemberDao(memberDao);
		memberInfoPrinter.setMemberPrinter(printer);
		return memberInfoPrinter;
	}
	public ChangePasswordService getChangePasswordService() {
		changePasswordService.setMemberDao(memberDao);
		return changePasswordService;
	}
	public MemberListPrinter getMemberListPrinter() {
		return memberListPrinter;
	}
	public MemberRegisterService getMemberRegisterService() {
		return memberRegisterService;
	}
	public MemberDao getMemberDao() {
		return memberDao;
	}
	public MemberPrinter getPrinter() {
		return printer;
	}
	
	
	
	
	
	
	
	
	
	
	
	//alt+shift+o누르면 자동 으로 만들어짐
//	public Assembler(MemberDao memberDao, MemberPrinter printer, MemberRegisterService memberRegisterService,
//			MemberListPrinter memberListPrinter, ChangePasswordService changePasswordService,
//			MemberInfoPrinter memberInfoPrinter) {
//		super();
//		this.memberDao = memberDao;
//		this.printer = printer;
//		this.memberRegisterService = memberRegisterService;
//		this.memberListPrinter = memberListPrinter;
//		this.changePasswordService = changePasswordService;
//		this.memberInfoPrinter = memberInfoPrinter;
//	}
	
		
	
}
