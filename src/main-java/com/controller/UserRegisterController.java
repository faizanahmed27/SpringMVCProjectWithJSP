package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.model.User;
import com.service.ProductService;
import com.service.UserService;

@Controller
public class UserRegisterController {

	@Autowired
	private UserService userService;
	
	
	
	 @RequestMapping("/") 
	 public String register(Model model) {
	 
	 model.addAttribute("title", "Register Page");
	 
	 return "index"; 
	 }
	
	
	@RequestMapping("/add-user")
	public String addUser() {
		
		return "add-user-form";
		}
	
	
	@RequestMapping(value = "/save-user", method = RequestMethod.POST)
	public RedirectView saveUser(@ModelAttribute User user, HttpServletRequest request) {
		
		System.out.println("user save controller");
		
		userService.addUser(user);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/user-list");
		return redirectView;
		
		}
	
	@RequestMapping("/user-list")
	public String ListUsers(Model model) {
		
		List<User> userList = userService.getUsers();
		model.addAttribute("users", userList);
		return "userlist";
		
		
	}
	
	@RequestMapping("/delete-user/{userId}")
	public RedirectView deleteUser(@PathVariable("userId") int userId, HttpServletRequest request) {
		
		this.userService.deleteUser(userId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/user-list");
		return redirectView;
		
		}
	
	@RequestMapping("/update-user/{userId}")
	public String updateUser(@PathVariable("userId") int userId, Model model) {
		
		User user = this.userService.getUser(userId);
		model.addAttribute("user", user);
		return "update-user-page";
		
	}
	
	@RequestMapping("/showPages")
	public String showPages() {
		
		return "login";
		}
	
	
	@PostMapping("/login")
	public RedirectView loginUser(@ModelAttribute ("user") final User user , HttpServletRequest request, RedirectView rv) {
		
		String msg="";
		System.out.println("User:- " +user);
		boolean userLogin=userService.loginUser(user);
		if(userLogin){
			 //HttpSession session = request.getSession();
			 //session.setAttribute(name, value);
			msg="login SuccessFull";
			
			rv.setUrl(request.getContextPath() + "/user-list");
			System.out.println(msg);
			return rv;
			
		}
		else {
			msg="login fail";
			System.out.println(msg);
		return rv;
		}
		}
	
}
