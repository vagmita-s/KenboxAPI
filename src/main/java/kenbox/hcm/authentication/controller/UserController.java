package kenbox.hcm.authentication.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kenbox.hcm.authentication.service.PhotoService;
import kenbox.hcm.authentication.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/forgot-password")
	public String forgotPassword(@RequestParam String email,@RequestParam String company) {

		String response = userService.forgotPassword(email,company);

		if (!response.startsWith("Invalid"))
		{
//			response = "http://localhost:8080/reset-password?token=" + response;
			response = response;
		}
		return response;
	}

	@PostMapping("/reset-password")
	public String resetPassword(@RequestParam long token,
			@RequestParam String password) {

		return userService.resetPassword(token, password);
	}
	 @Autowired
	    private PhotoService photoService;
	
	@PostMapping("/upload-photo")
	public String uploadPhoto(@RequestParam("photo") MultipartFile image, @RequestParam String email, @RequestParam String company) throws IOException  {
	    String id = photoService.addPhoto(email,company, image);
	    
	    return "Photo Uploaded Succesfully/" + email;
	}
}
