package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	GoodsService service;
	
	@RequestMapping("/loginCheck/cartList") //interceptor 통과
	public String cartList(RedirectAttributes attr, HttpSession session) {
		MemberDTO dto= (MemberDTO)session.getAttribute("login");
		String userid=dto.getUserid();
		List<CartDTO> list=service.cartList(userid);
		return "redirct:../cartList";
	}
	
	
	@RequestMapping("/loginCheck/cartAdd")
	public String cartAdd(CartDTO cart, HttpSession session) {
		MemberDTO mDTO= (MemberDTO)session.getAttribute("login");
		cart.setUserid(mDTO.getUserid());//cart에 session에 들어 있는 id 정보 저장
		session.setAttribute("mesg", cart.getgCode());//goodsRetrive.jsp 경고창 에서 활용
		service.cartAdd(cart); //add한 갯수 출력 	
		return "redirect:../goodsRetrieve?gCode="+cart.getgCode();
	}
		
	
	@RequestMapping("/goodsRetrieve")//goodsRetrieve.jsp  //view에 대한 지정이 없음 url= 뷰파일.jsp
	@ModelAttribute("goodsRetrieve") //key값을  goodsRetrieve로 지정 
	public GoodsDTO goodsRetrieve(@RequestParam("gCode") String gCode) {//상품자세히 보기
		GoodsDTO dto= service.goodsRetrieve(gCode);
		return dto;		
	}
	
	
	@RequestMapping("/goodsList")
	public ModelAndView goodsList(@RequestParam("gCategory") String gCategory) {//상품목록보기
		if(gCategory== null) {
			gCategory="top";
		}
		List<GoodsDTO> list= service.goodsList(gCategory);
		ModelAndView mav= new ModelAndView();
		mav.addObject("goodsList", list);
		//request.setAttribute("goodsList", list)와 동일
		mav.setViewName("main"); //main.jsp
		return mav;				
	}
	/*
	 * @RequestMapping("/goodsList/gCategory/{category}") public String
	 * goodsList2(@PathVariable("category") String gCategory, Model m) {
	 * List<GoodsDTO> list =serivce.goodsList(gCategory);
	 * m.addAttribute("goodsList", list); return
	 * "redirect:../../goodsList?gCategory="+gCategory; }
	 */
	
}
