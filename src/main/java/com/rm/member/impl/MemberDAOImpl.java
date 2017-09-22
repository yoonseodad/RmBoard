package com.rm.member.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rm.member.MemberDAO;
import com.rm.member.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	SqlSessionTemplate template;
	
	private final String MAPPER_ID = "com.rm.member";
	
	@Override
	public boolean insert(MemberVO member) {
		int icnt = template.insert(MAPPER_ID + ".insert", member);
		return (icnt == 1) ? true : false;
	}
	@Override
	public int insert_pk(MemberVO member) {
		int icnt = template.insert(MAPPER_ID + ".insert_pk", member);
		if(icnt ==  1) return member.getMseq();
		else return 0;
	}
	@Override
	public boolean update(MemberVO member) {
		int icnt = template.update(MAPPER_ID + ".update", member);
		return (icnt == 1) ? true : false;
	}
	@Override
	public boolean delete(int mseq) {
		int icnt = template.update(MAPPER_ID + ".delete", mseq);
		return (icnt == 1) ? true : false;
	}
	@Override
	public boolean delete_real(int mseq) {
		int icnt = template.update(MAPPER_ID + ".delete_real", mseq);
		return (icnt == 1) ? true : false;
	}
	@Override
	public void deleteAll() {
		int icnt = template.update(MAPPER_ID + ".delete_all");
	}
	@Override
	public MemberVO getMember(int mseq) {
		return template.selectOne(MAPPER_ID + ".select", mseq);
	}
	@Override
	public List<MemberVO> getMemberList() {
		return template.selectList(MAPPER_ID + ".select_all");
	}
}
