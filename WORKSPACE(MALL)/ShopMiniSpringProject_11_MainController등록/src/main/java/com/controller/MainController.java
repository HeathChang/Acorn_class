package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;

@Controller
public class MainController {
	@Autowired
	GoodsService serivce;
	//시작점
	
	@RequestMapping("/")
	public ModelAndView goodsList() {
		List<GoodsDTO> list = serivce.goodsList("top");
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList",list);
		//request.setAttribute("goodsList",list) 와 동일
		mav.setViewName("main"); //main.jsp include되게
		return mav;
	
	}
	
}
