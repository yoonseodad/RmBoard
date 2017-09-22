package com.rm.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rm.member.MemberService;
import com.rm.member.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/list.rm", method=RequestMethod.GET)
	public String memberList(Model model) {
		
		model.addAttribute("list", service.getMemberList());
		
		return "/member/memberList";
	}
	
	@RequestMapping(value="view.rm", method=RequestMethod.GET)
	public String memberView(@RequestParam("seq") int mseq, Model model) {
		
		model.addAttribute("member", service.getMember(mseq));
		
		return "/member/memberView";
	}
	
	@RequestMapping(value="reg.rm", method=RequestMethod.GET)
	public String memberView(Model model) {
		return "/member/memberReg";
	}
	
	@RequestMapping(value="reg.rm", method=RequestMethod.POST)
	public String memberView(MemberVO member, RedirectAttributes rttr, Model model) {
		
		return "/member/memberReg";
	}	
}
