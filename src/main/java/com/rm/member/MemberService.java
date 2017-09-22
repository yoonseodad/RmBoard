package com.rm.member;

import java.util.List;

public interface MemberService {
	public boolean insertMember(MemberVO member);
	public boolean updateMember(MemberVO member);
	public boolean deleteMember(int mseq);
	public boolean deleteRealMember(int mseq);
	public MemberVO getMember(int mseq);
	public List<MemberVO> getMemberList();	
}
