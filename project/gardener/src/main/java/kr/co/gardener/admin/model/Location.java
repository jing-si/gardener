package kr.co.gardener.admin.model;

public class Location {
	private String userId;
	private int locationId;
	private int plantId;
	private float locationSize;
	private int locationX;
	private int locationY;
	private int locationOrder;
	private String plantImage; //식물 이미지(join으로 PlantLevel에서 가지고올것)
	private int plantWidth; //식물 가로(join으로 Plant에서 가지고올것)
	private int plantHeight; //식물 세로(join으로 Plant에서 가지고올것)
	
	
	
	public String getPlantImage() {
		return plantImage;
	}
	public void setPlantImage(String plantImage) {
		this.plantImage = plantImage;
	}
	public int getPlantWidth() {
		return plantWidth;
	}
	public void setPlantWidth(int plantWidth) {
		this.plantWidth = plantWidth;
	}
	public int getPlantHeight() {
		return plantHeight;
	}
	public void setPlantHeight(int plantHeight) {
		this.plantHeight = plantHeight;
	}
	
	
	
	
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
	
	
	
	public float getLocationSize() {
		return locationSize;
	}
	public void setLocationSize(float locationSize) {
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
