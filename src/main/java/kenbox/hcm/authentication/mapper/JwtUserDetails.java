package kenbox.hcm.authentication.mapper;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import kenbox.hcm.authentication.dto.UserAccountDTO;

@SuppressWarnings("serial")
public class JwtUserDetails implements UserDetails {

	private String username;
	private UserAccountDTO user;

	
	public JwtUserDetails(UserAccountDTO user) {
        this.user = user;
    }
	
	public UserAccountDTO getUser() {
		return user;
	}
	public void setUser(UserAccountDTO user) {
		this.user = user;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return null;
	}
                                                                                                                                                                                                                   
	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
