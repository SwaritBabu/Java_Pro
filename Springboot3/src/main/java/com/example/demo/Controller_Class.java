package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_Class {

	@RequestMapping(value="/branch",method=RequestMethod.GET)
	public ModelAndView bank_Branches() {
		List<String> list= new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add("Branch in Banglore"+i);
		}
		ModelAndView mv= new ModelAndView();
		mv.addObject("key1", list);
		mv.setViewName("index1");
		System.out.println();
		return mv;
	}
	@RequestMapping(value="/service1", method=RequestMethod.GET)
	public ModelAndView bank_Services() {
		List<String> list= new ArrayList<>();
		list.add("Acc. Opening");
		list.add("Deposit");
		list.add("Withdraw");
		list.add("Balance Enquiry");
		list.add("Pin Change");
		list.add("Credit Card offer");
		list.add("Passbook update");
		list.add("Net Banking and Loan Offer");
		ModelAndView mv= new ModelAndView("index2","key2",list);
		return mv;
	}
	
}
