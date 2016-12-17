package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
	@RequestMapping(value="/loginPage", method = RequestMethod.GET)
	public ModelAndView loginPage()
	{
		System.out.println("inside loginPage");
		/*modelMap=new ModelMap("command", new User());
		return "loginPage";*/
		return new ModelAndView("loginPage","command", new User());
	}
	
	@RequestMapping(value="/loginVarification", method=RequestMethod.POST)
	public String loginVarification(@ModelAttribute("SpringWeb") User user, ModelMap modelMap)
	{
		System.out.println("inside loginVarification");
		User localUser=new User();
		//ModelMap modelMap=new ModelMap();
		if(user.getUserName().equalsIgnoreCase("admin") && user.getPassword().equalsIgnoreCase("admin"))
		{
			localUser.setUserName(user.getUserName());
			localUser.setRole("admin");
			/*modelAndView.addObject("user", localUser);
			modelAndView.addObject("userName", user.getUserName());
			modelAndView.addObject("role", "admin");*/
			System.out.println("user name "+user.getUserName());
			//modelMap.addAttribute("userName",user.getUserName());
			//modelMap.addObject("userName", user.getUserName());
			modelMap.addObject("user",localUser);
			//ModelAndView modelAndView=new ModelAndView("welcomePageAdmin", "user", localUser);
			return "welcomePageAdmin";
		}
		else if(user.getUserName().equalsIgnoreCase("user") && user.getPassword().equalsIgnoreCase("user"))
		{
			//ModelAndView modelAndView=new ModelAndView("welcomePageUser");
			localUser.setUserName(user.getUserName());
			localUser.setRole("user");
			//modelAndView.addObject("user", localUser);
			modelMap.addObject("user",localUser);
			return "welcomePageUser";
		}
		else 
		{
			//return "redirect:/frontEnd/staticPages/wrongCredentialPage.jsp";
			return "wrongCredentialPage";
		}
	}
}