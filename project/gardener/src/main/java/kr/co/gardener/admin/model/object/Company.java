package kr.co.gardener.admin.model.object;

public class Company {
	private String companyId;
	private String companyName;
	private String companyTel;
	private String companyAddress;
	private String companyHomepage;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyTel() {
		return companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyHomepage() {
		return companyHomepage;
	}

	public void setCompanyHomepage(String companyHomepage) {
		this.companyHomepage = companyHomepage;
	}

	public void setPram(String key, String value) {
		switch (key) {
		case "VEND_VCOD":
			this.companyId = value;
			break;
		case "VEND_VCNM":
			this.companyName = value;
			break;
		case "VEND_ADDR":
			this.companyAddress = value;
			break;
		case "VEND_TEL":
			this.companyTel = value;
			break;
		case "VEND_HOME":
			this.companyHomepage = value;
			break;
		}
	}

	public void setVEND_VCOD(String value) {
		this.companyId = value;
	}
	public void setVEND_VCNM(String value) {
		this.companyName = value;
	}
	public void setVEND_ADDR(String value) {
		this.companyAddress = value;
	}
	public void setVEND_TEL(String value) {
		this.companyTel = value;
	}
	public void setVEND_HOME(String value) {
		this.companyHomepage = value;
	}

}
