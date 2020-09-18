package kenbox.hcm.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kenbox.hcm.authentication.config.JwtTokenUtil;
import kenbox.hcm.authentication.mapper.JwtRequest;
import kenbox.hcm.authentication.mapper.JwtResponse;
import kenbox.hcm.authentication.service.JwtUserDetailsService;

@RestController
@CrossOrigin("http://localhost:3000")
public class JwtAuthenticationController {
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private JwtUserDetailsService userDetailsService;
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception 
	{
		String userNameForCompany = String.format("%s%s%s", authenticationRequest.getUsername().trim(),String.valueOf(Character.LINE_SEPARATOR), authenticationRequest.getCompanyName());
		System.out.println("authenticate :: "+authenticationRequest.getUsername());
		
		final UserDetails userDetails =  userDetailsService.loadUserByUsername(userNameForCompany);
		final String token = jwtTokenUtil.generateToken(userDetails);
		System.out.println("authenticate response token :: "+token);
		return ResponseEntity.ok(new JwtResponse(token));
	}
	
}
