package com.rm.member;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:rmboard-context.xml")
public class CrudTest {
	
	@Autowired
	SqlSessionTemplate template;

	@Before
	public void init() {}
	
	@Test
	public void insert() {
		
		MemberVO m1 = new MemberVO();
		m1.setMid("ricemen");
		m1.setMpassword("cho0827");
		m1.setMemail("ricemen@ricemen.com");
		
		int icnt = template.insert("com.rm.member.insert", m1);
		assertThat(icnt, is(1));
	}
	
	@Test
	public void insert_pk() {
		MemberVO m2 = new MemberVO();
		m2.setMid("ricemen1");
		m2.setMpassword("cho0827");
		m2.setMemail("ricemen1@ricemen.com");
		
		int icnt2 = template.insert("com.rm.member.insert_pk", m2);
		assertThat(icnt2, is(1));
		
		MemberVO member = template.selectOne("com.rm.member.select", m2.getMseq());
		System.out.println(member.toString());
	}
	
	@Test
	public void update() {
		MemberVO m = new MemberVO();
		m.setMid("yoonseo");
		m.setMpassword("cho1104");
		m.setMemail("yoonseo@ricemen.com");
		
		int iInsertCnt = template.insert("com.rm.member.insert_pk", m);
		assertThat(iInsertCnt, is(1));
		
		MemberVO m2 = new MemberVO();
		m2.setMseq(m.getMseq());
		m2.setMemail("yoonseo@gmail.com");		
		int iUpdateCnt = template.update("com.rm.member.update", m2);
		assertThat(iUpdateCnt, is(1));
		
		MemberVO member = template.selectOne("com.rm.member.select", m.getMseq());
		System.out.println(member.toString());
	}
	
	@Test
	public void delete() {
		MemberVO m = new MemberVO();
		m.setMid("jieun");
		m.setMpassword("lee1009");
		m.setMemail("jieun@ricemen.com");
		
		int iInsertCnt = template.insert("com.rm.member.insert_pk", m);
		assertThat(iInsertCnt, is(1));
		
		MemberVO member = template.selectOne("com.rm.member.select", m.getMseq());
		System.out.println(member.toString());
		
		int iDeleteCnt = template.delete("com.rm.member.delete", m.getMseq());
		assertThat(iDeleteCnt, is(1));
		
	}
	
	
	
	@After
	public void destory() {
		template.delete("com.rm.member.delete_all");
	}
}
