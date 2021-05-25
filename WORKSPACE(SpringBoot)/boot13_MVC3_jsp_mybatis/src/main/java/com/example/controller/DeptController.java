package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.dto.Dept;
import com.example.service.DBService;


@Controller
public class DeptController {

	@Autowired
	DBService service;
	
	@RequestMapping("/list")
	public String list(Model m) {
		List<Dept> allData = service.list(); // 모델
		System.out.println(allData);
		m.addAttribute("allData", allData);
		return "list";   // /WEB-INF/views/list.jsp 의미
	}
	@RequestMapping("/insert")
	public String insert(Dept dept) {
		System.out.println("inse>"+ dept);
		int n = service.insert(dept);
		return "redirect:list";
	}
	
	@RequestMapping("/insertForm")
	public String insertForm() {
		return "addForm";
	}
	
	

	
	
	@RequestMapping("/deptDelete")
	public String deptDelete(@RequestParam int deptno) {
		System.out.println("%%%%%% " + deptno);
		int n = service.deleteByDeptno(deptno);
		return "redirect:list";
	}
	
	@RequestMapping("/deptUpdateForm")
	public ModelAndView deptUpdateForm(@RequestParam int deptno) {
		Dept dept = service.selectByDeptno(deptno); //Model
	    
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("dept", dept);  // Model 저장
	    mav.setViewName("update");   // View 저장
	    
		return mav; 
	}
	@RequestMapping("/update")
	public String update(Dept dept) {
		System.out.println("update>"+ dept);
		int n = service.update(dept);
		return "redirect:list";
	}
}



