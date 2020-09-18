package kenbox.hcm.authentication.mapper;

import java.io.Serializable;

public class JwtRequest implements Serializable {
	
	
	private String username;
	private String password;
	private String companyName;

	

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	private String apikey; // product api key
	// need default constructor for JSON Parsing
	public JwtRequest() {

	}
	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
} 
