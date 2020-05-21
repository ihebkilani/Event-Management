package tn.insat.projetang.eventmanager.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import tn.insat.projetang.eventmanager.entities.User;
import tn.insat.projetang.eventmanager.message.request.LoginForm;
import tn.insat.projetang.eventmanager.message.request.SignUpForm;
import tn.insat.projetang.eventmanager.message.response.JwtResponse;
import tn.insat.projetang.eventmanager.repository.RoleRepository;
import tn.insat.projetang.eventmanager.repository.UserRepository;
import tn.insat.projetang.eventmanager.security.jwt.JwtProvider;
import tn.insat.projetang.eventmanager.services.UserPrinciple;
import tn.insat.projetang.eventmanager.services.UserService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/Users")
public class AuthController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;



	@Autowired
	PasswordEncoder encoder;

	@Autowired
    JwtProvider jwtProvider;

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST,value="/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = jwtProvider.generateJwtToken(authentication);
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		UserPrinciple user1=  (UserPrinciple)authentication.getPrincipal();

		User user2=new User(user1.getId(),user1.getName(),user1.getUsername(),user1.getEmail(),user1.getPassword(),user1.getAvis(),user1.getPanier());
		System.out.println(user2.getId()+user2.getName()+user2.getUsername()+user2.getEmail()+user2.getPanier().getId());
		return ResponseEntity.ok(new JwtResponse(jwt, user2, userDetails.getAuthorities()));
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addUser(@RequestBody SignUpForm signUpRequest) {
		return  userService.addUser(signUpRequest);
	}


	}
