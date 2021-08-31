package kr.co.gardener.admin.dao.object;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Repository;

@Repository
public class DataManagerDaoImpl implements DataManagerDao {
	private URI companyUrl;
	
	public DataManagerDaoImpl() {
		try {
			companyUrl = new URI("http://data.greenproduct.go.kr/open-api/rest/CertifyVenderInformationInquiryService.do");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String list(int start, int end) {
		URI connUrl=null;
		try {
			 connUrl = new URIBuilder(companyUrl)
					.addParameter("certKeyc","kW2He3CdhxZqoqV4Xca2ZHfw0BrO7YV/Eps1RzY5pd0XPwc7D5443vHWGHwJ1kCViv2Q5kebY14nqh/7X3Q==")
					.addParameter("vendStdt", String.valueOf(start)).addParameter("vendEndt", String.valueOf(end)).build();
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}

		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpResponse response = null;

		try {
			response = httpClient.execute(new HttpGet(connUrl));
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// post 요청은 HttpPost()를 사용하면 된다.

		HttpEntity entity = response.getEntity();
		String content = "";

		try {
			content = EntityUtils.toString(entity);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return content;
		
	}

}
