package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.models.player;
import com.spring.service.PlayerService;

//http://localhost:8080/team_project/
@Controller
@RequestMapping("/")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	public PlayerController() {

	}

	@GetMapping("")
	public String playrt_page() {

		return "home_page";
	}

	@GetMapping("/players")
	public String players(Model model) {

		// List<player> players = playerService.allplayers();
		model.addAttribute("kolplayers", getplayers());
		return "players";
	}

	@GetMapping("/addPlayer")
	public String showForm(Model model) {
		model.addAttribute("player", new player());
		return "addplay"; // This corresponds to the addPlayer.jsp page
	}

	@PostMapping("/savePlayer")
	public String savePlayer(@ModelAttribute("player") player thePlayer) {
		// thePlayer will be automatically populated with form data
		playerService.saveplayer(thePlayer);
		return "redirect:/players"; // Redirect to a list or home page after saving
	}

	@GetMapping("/getonePlayer")
	public String getplayer(@RequestParam("playid") int id, Model model) {
		player player = playerService.oneplayer(id);
		model.addAttribute("player", player);
		return "addplay"; // This corresponds to the addPlayer.jsp page
	}

	@GetMapping("/deleteonePlayer")
	public String delplayer(@RequestParam("playid") int id) {
		playerService.deletesplayer(id);
		return "redirect:/players"; // This corresponds to the addPlayer.jsp page
	}

	public List<player> getplayers() {
		return playerService.allplayers();
	}

}
