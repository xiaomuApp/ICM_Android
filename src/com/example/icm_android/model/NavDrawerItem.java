package com.example.icm_android.model;

public class NavDrawerItem {
	private boolean showNotify;
	private String title;
	
	public NavDrawerItem() {
		super();
	}
	
	public NavDrawerItem(boolean showNotify, String title) {
		super();
		this.showNotify = showNotify;
		this.title = title;
	}

	public boolean isShowNotify() {
		return showNotify;
	}

	public void setShowNotify(boolean showNotify) {
		this.showNotify = showNotify;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
