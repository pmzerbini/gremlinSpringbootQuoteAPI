//package com.jecheverria.quotesvc.service;
//
//import com.jecheverria.quotesvc.model.QuoteResponse;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.web.client.RestTemplate;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//
//class QuoteGeneratorServiceTest {
//
//    @Mock
//    RestTemplate restTemplate;
//
//
//    //Basic unit test for line coverage
//    @Test
//    void getQuoteEnglishTest() {
//
//        QuoteResponse expectedResponse = QuoteResponse.builder()
//                .quoteText("test-quote-text")
//                .quoteAuthor("test-quote-author")
//                .quoteLink("test-quote-link")
//                .senderLink("test-sender-name")
//                .senderName("test-sender-name")
//                .build();
//
//        when(restTemplate.getForObject(anyString(), QuoteResponse.class)).thenReturn(expectedResponse);
//
//        QuoteGeneratorService quoteGeneratorService = new QuoteGeneratorService();
//        String userLanguage = "en";
//
//        QuoteResponse actualResponse = quoteGeneratorService.getQuote(userLanguage);
//
//        assertEquals(expectedResponse.getQuoteText(), actualResponse.getQuoteText());
//        assertEquals(expectedResponse.getQuoteAuthor(), actualResponse.getQuoteAuthor());
//    }
//}