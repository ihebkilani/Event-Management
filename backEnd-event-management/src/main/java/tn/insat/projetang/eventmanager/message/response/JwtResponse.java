package tn.insat.projetang.eventmanager.message.response;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import tn.insat.projetang.eventmanager.entities.User;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private User user;
	private Collection<? extends GrantedAuthority> authorities;

	public JwtResponse(String accessToken, User user, Collection<? extends GrantedAuthority> authorities) {
		this.token = accessToken;
		this.user = user;
		this.authorities = authorities;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
}