package models;

import java.util.List;

public class User {
	private long id;
	private String username;
	private String password;
	private String passwordSalt;
	private String googleKey;
	private String facebookKey;
	private List<Card> haves;
	private List<Card> wants;
	
	public String getFacebookKey() {
		return facebookKey;
	}
	public void setFacebookKey(String facebookKey) {
		this.facebookKey = facebookKey;
	}
	public long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordSalt() {
		return passwordSalt;
	}
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	public String getGoogleKey() {
		return googleKey;
	}
	public void setGoogleKey(String googleKey) {
		this.googleKey = googleKey;
	}
	public List<Card> getHaves() {
		return haves;
	}
	public void setHaves(List<Card> haves) {
		this.haves = haves;
	}
	public List<Card> getWants() {
		return wants;
	}
	public void setWants(List<Card> wants) {
		this.wants = wants;
	}
}
