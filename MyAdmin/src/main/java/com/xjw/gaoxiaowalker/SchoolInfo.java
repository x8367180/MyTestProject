package com.xjw.gaoxiaowalker;

public class SchoolInfo {

	private String url;
	private String lastDate;
	private String title;
	private String num;
	private String city;
	@Override
	public String toString() {
		return "SchoolInfo [url=" + url + ", lastDate=" + lastDate + ", title="
				+ title + ", num=" + num + ", city=" + city + "]";
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
