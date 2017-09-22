package com.rm.member.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.member.MemberDAO;
import com.rm.member.MemberService;
import com.rm.member.MemberVO;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO dao;

	@Override
	public boolean insertMember(MemberVO member) {
		return dao.insert(member);
	}

	@Override
	public boolean updateMember(MemberVO member) {
		return dao.update(member);
	}

	@Override
	public boolean deleteMember(int mseq) {
		return dao.delete(mseq);
	}

	@Override
	public boolean deleteRealMember(int mseq) {
		return dao.delete_real(mseq);
	}

	@Override
	public MemberVO getMember(int mseq) {
		return dao.getMember(mseq);
	}

	@Override
	public List<MemberVO> getMemberList() {
		return dao.getMemberList();
	}
}
