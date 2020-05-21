package tn.insat.projetang.eventmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tn.insat.projetang.eventmanager.entities.User;
import tn.insat.projetang.eventmanager.repository.UserRepository;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/Users")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String userAccess() {
		return ">>> User Contents!";
	}


	@GetMapping("/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> Admin Contents";
	}


	@RequestMapping(method = RequestMethod.GET)
	public List<User> findUser() {
		//return userService.findUserByMailAndPwd(user);
		System.out.println("hhhhh");
		return userRepository.findAll();
	}
}