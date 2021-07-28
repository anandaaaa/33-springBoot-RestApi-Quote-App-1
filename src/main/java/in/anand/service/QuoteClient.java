package in.anand.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.anand.response.QuoteApiResponse;

@Service
public class QuoteClient {
	
	public String invokeRandomQuoteApi()
	{
		String api="https://quoters.apps.pcfone.io/api/random";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(api, String.class);
		int statuscode =responseEntity.getStatusCodeValue();
		if(statuscode==200)
		{
			String body = responseEntity.getBody();
			System.out.println("service"+body);
			return body;
			
		}else {
			return null;
		}
	}

	
	public String invokeQuoteApi()
	{
		String api="https://quoters.apps.pcfone.io/api/random";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<QuoteApiResponse> responseEntity = restTemplate.getForEntity(api, QuoteApiResponse.class);
		int statuscode =responseEntity.getStatusCodeValue();
		if(statuscode==200)
		{
			QuoteApiResponse body = responseEntity.getBody();
			System.out.println("service"+body);
			return body.getValue().getQuote().toUpperCase();
			
		}else {
			return null;
		}
	}

}
