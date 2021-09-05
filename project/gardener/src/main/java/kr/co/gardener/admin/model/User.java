package kr.co.gardener.admin.model;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private String userId;
	private String userNick;
	private String userPass;
	
	@DateTimeFormat(pattern = "yyyyMMdd")
	private Date userBirth;
	
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
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public Date getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(Date userBirth) {
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
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userNick=" + userNick + ", userPass=" + userPass + ", userBirth="
				+ userBirth + ", userGender=" + userGender + ", stateId=" + stateId + ", forestId=" + forestId + "]";
	}
	
	
}