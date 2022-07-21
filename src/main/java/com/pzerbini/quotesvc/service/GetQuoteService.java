package com.pzerbini.quotesvc.service;

import com.pzerbini.quotesvc.model.Quote;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetQuoteService {

    //Simple method that leverage RestTemplate to invoke the Quote Generator API via REST
    public Quote getQuote(String userLanguage) {

        RestTemplate restTemplate = new RestTemplate();
        String quoteResourceUrl = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=" + userLanguage;
        Quote quote = new Quote();

        try {
            quote = restTemplate.getForObject(quoteResourceUrl, Quote.class);
        }
        catch(Exception e) {
            System.out.println("Something went wrong while invoking external quote API");
        }

        System.out.println("Quote: " + quote.getQuoteText());
        System.out.println("Author: " + quote.getQuoteAuthor());

        return quote;
    }
}
