package fr.ensim.DM_Ghada.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddAddressController {
	@GetMapping("/adresse")
	public String addAddresses(Model model) {
		return "adresse";
	}
}
