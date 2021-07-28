package in.anand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.anand.service.QuoteClient;

@RestController
public class QuoteController {
	
	@Autowired
	private QuoteClient QuoteClientobj;
	
	@GetMapping("/quote")
	public String getQuoteData()
	{
		//String quoteApi = QuoteClientobj.invokeRandomQuoteApi();
		String quoteApi = QuoteClientobj.invokeQuoteApi();

		return "Rest Controller"+quoteApi;
	}

}
