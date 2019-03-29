package com.graduate.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String pid;
	private String name;
	private String nickname;
	private String account;
	private String password;
	private Integer locked;
	private Integer useable;
	private Date lastLoginTime;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getLocked() {
		return locked;
	}
	public void setLocked(Integer locked) {
		this.locked = locked;
	}
	public Integer getUseable() {
		return useable;
	}
	public void setUseable(Integer useable) {
		this.useable = useable;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	@Override
	public String toString() {
		return "UserInfo [pid=" + pid + ", name=" + name + ", nickname=" + nickname + ", account=" + account
				+ ", password=" + password + ", locked=" + locked + ", useable=" + useable + ", lastLoginTime="
				+ lastLoginTime + "]";
	}
	
}
