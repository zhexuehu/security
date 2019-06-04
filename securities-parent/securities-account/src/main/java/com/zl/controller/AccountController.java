package com.zl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.Account;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@ResponseBody
    @RequestMapping("/accounts")
	public List<Account> account(){
    	Account a1 = new Account();
    	a1.setName("zhansan");
    	a1.setPass("123456");
    	Account a2 = new Account();
    	a2.setName("lihua");
    	a2.setPass("123456");
    	List <Account> list = new ArrayList<>();
    	list.add(a1);
    	list.add(a2);
		return list;
	} 
}
