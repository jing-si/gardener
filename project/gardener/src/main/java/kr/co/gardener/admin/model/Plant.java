package kr.co.gardener.admin.model;

public class Plant {
	private int plantId;
	private String plantName;
	private String plantCategory;
	private String plantInfo;
	
	private int plantWidth; //DB에 추가해야 합니다.
	private int plantHeight; //DB에 추가해야 합니다.
	
	
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
	public int getPlantId() {
		return plantId;
	}
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}
	public String getPlantName() {
		return plantName;
	}
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	public String getPlantCategory() {
		return plantCategory;
	}
	public void setPlantCategory(String plantCategory) {
		this.plantCategory = plantCategory;
	}
	public String getPlantInfo() {
		return plantInfo;
	}
	public void setPlantInfo(String plantInfo) {
		this.plantInfo = plantInfo;
	}
	
	
}
