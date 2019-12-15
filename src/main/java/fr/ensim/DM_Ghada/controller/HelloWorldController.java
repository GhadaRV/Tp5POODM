package fr.ensim.DM_Ghada.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@GetMapping ("/greeting") //link !!!!! ROD BELEK TZID ESPACE :'( !!!!
	public String greeting(@RequestParam(name ="nameGET",required =false,defaultValue ="World")String nameGET,Model model) 
	//@RequestParam: add parameter on link after ?
	{
	model.addAttribute("nomTemplate",nameGET); //tzid eli 7atineh fel lien lel template ( taffecti l param lel variable eli fel template)
	return "greeting"; //model name
	}
}
