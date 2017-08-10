package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.beans.MyAnnotatedBean;
import com.journaldev.spring.beans.MyBean;

@Controller
@Scope("request")
public class HomeController {
	private static Logger logger = LoggerFactory.getLogger(HomeController.class);

	private MyBean myBean;
	
	private MyAnnotatedBean myAnnotatedBean;

	@Autowired
	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}

	@Autowired
	public void setMyAnnotatedBean(MyAnnotatedBean obj) {
		this.myAnnotatedBean = obj;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		String pom = "MyBean hashcode="+ myBean.hashCode();
		logger.info(pom);
		pom = "MyAnnotatedBean hashcode="+ myAnnotatedBean.hashCode();
		logger.info(pom);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("myAnnotatedBean", myAnnotatedBean );
		model.addAttribute("myBean", myBean );
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);


		if( (cal.get(Calendar.SECOND)/10) > 3)

			return "home";
		else

			return "employee";
	}
	
}
