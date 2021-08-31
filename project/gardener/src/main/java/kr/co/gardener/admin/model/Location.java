package kr.co.gardener.admin.model;

public class Location {
	private String userId;
	private int locationId;
	private int plantId;
	private int locationSize;;
	private int locationX;
	private int locationY;
	private int locationOrder;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getPlantId() {
		return plantId;
	}
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}
	public int getLocationSize() {
		return locationSize;
	}
	public void setLocationSize(int locationSize) {
		this.locationSize = locationSize;
	}
	public int getLocationX() {
		return locationX;
	}
	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public int getLocationY() {
		return locationY;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	public int getLocationOrder() {
		return locationOrder;
	}
	public void setLocationOrder(int locationOrder) {
		this.locationOrder = locationOrder;
	}
}
