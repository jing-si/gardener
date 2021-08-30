package kr.co.gardener.admin.service.object;

import java.io.IOException;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

@Service
public class DatabaseServiceImpl implements DatabaseService{

	@Override
	public String list(){
		URI url = null;		 
		
		try {
			url = new URI("http://data.greenproduct.go.kr/open-api/rest/CertifyVenderInformationInquiryService.do");	
			url = new URIBuilder(url)
					.addParameter("certKeyc","kW2He3CdhxZqoqV4Xca2ZHfw0BrO7YV/Eps1RzY5pd0XPwc7D5443vHWGHwJ1kCViv2Q5kebY14nqh/7X3Q==")
					.addParameter("vendStdt","20210101")
					.addParameter("vendEndt","20210104").build();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		HttpClient httpClient = HttpClientBuilder.create().build(); 
		HttpResponse response = null;
		
		try {
			response = httpClient.execute(new HttpGet(url));
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// post 요청은 HttpPost()를 사용하면 된다. 
		
		HttpEntity entity = response.getEntity(); 
		String content = "";
		
		try {
			content = EntityUtils.toString(entity);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		return content;
	}

	
		
}
