package kr.co.gardener.admin.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Bookmark {
	private int bookmark;
	private String userId;
	@DateTimeFormat(pattern = "yyyyMMdd")
	private Date bookmarkDateTime;
	private int productId;
	public int getBookmark() {
		return bookmark;
	}
	public void setBookmark(int bookmark) {
		this.bookmark = bookmark;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getBookmarkDateTime() {
		return bookmarkDateTime;
	}
	public void setBookmarkDateTime(Date bookmarkDateTime) {
		this.bookmarkDateTime = bookmarkDateTime;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
}
