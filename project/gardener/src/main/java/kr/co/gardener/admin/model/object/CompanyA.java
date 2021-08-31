package kr.co.gardener.admin.model.object;

public class CompanyA {
private String vendVocd;
private String vendVcnm;
public String getVendVocd() {
	return vendVocd;
}
public void setVendVocd(String vendVocd) {
	this.vendVocd = vendVocd;
}
public String getVendVcnm() {
	return vendVcnm;
}
public void setVendVcnm(String vendVcnm) {
	this.vendVcnm = vendVcnm;
}
@Override
public String toString() {
	return "CompanyA [vendVocd=" + vendVocd + ", vendVcnm=" + vendVcnm + "]";
}


}
