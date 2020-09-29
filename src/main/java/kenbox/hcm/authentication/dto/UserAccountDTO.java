package kenbox.hcm.authentication.dto;

import javax.websocket.Decoder.Binary;

public class UserAccountDTO {
	private String userName;
	private String password;
	public Binary image;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
