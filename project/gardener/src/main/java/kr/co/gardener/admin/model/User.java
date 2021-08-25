package kr.co.gardener.admin.model;

public class User {
	private String userId;
	private String userNick;
	private String userBirth;
	private String userGender;
	private int stateId;
	private int forestId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public int getForestId() {
		return forestId;
	}
	public void setForestId(int forestId) {
		this.forestId = forestId;
	}
	
	
	
}