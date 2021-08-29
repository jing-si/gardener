package kr.co.gardener.admin.model;

import java.util.ArrayList;
import java.util.List;

public class ClassifyList {
private List<Classify> topClass;
private List<Classify> midClass;
private List<Classify> botClass;


public ClassifyList() {
	super();
	this.topClass = new ArrayList<>();
	this.midClass = new ArrayList<>();
	this.botClass = new ArrayList<>();
}
public List<Classify> getTopClass() {
	return topClass;
}
public void setTopClass(List<Classify> topClass) {
	this.topClass = topClass;
}
public List<Classify> getMidClass() {
	return midClass;
}
public void setMidClass(List<Classify> midClass) {
	this.midClass = midClass;
}
public List<Classify> getBotClass() {
	return botClass;
}
public void setBotClass(List<Classify> botClass) {
	this.botClass = botClass;
}


}
