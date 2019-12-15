package fr.ensim.DM_Ghada.controller;


import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import fr.ensim.DM_Ghada.model.DarkSky;
import fr.ensim.DM_Ghada.model.Response;

@Controller
public class MeteoController {

	@PostMapping("/meteo")
	public String showMeteo(@RequestBody String address, Model model) {
		model.addAttribute("adresse", address);
		SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		RestTemplate restTemplate = new RestTemplate(clientHttpReq);
		Response c = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q=" + address, Response.class);
		double lon = c.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		double lat = c.getFeatures().get(0).getGeometry().getCoordinates().get(1);
		DarkSky s = restTemplate.getForObject("https://api.darksky.net/forecast/d1bf2f23b28666bd98b89f22772eee2c/" + lat
				+ "," + lon + "?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si", DarkSky.class);
		model.addAttribute("meteo", s);
		model.addAttribute("adresse", c.getFeatures().get(0).getProperties().getContext());
		model.addAttribute("ville", c.getFeatures().get(0).getProperties().getCity());

		return "meteo";
	}
}