package com.rm.member;

import java.util.List;

public interface MemberDAO {

	public boolean insert(MemberVO member);
	public int insert_pk(MemberVO member);
	public boolean update(MemberVO member);
	public boolean delete(int mseq);
	public boolean delete_real(int mseq);
	public void deleteAll();
	public MemberVO getMember(int mseq);
	public List<MemberVO> getMemberList();
}
