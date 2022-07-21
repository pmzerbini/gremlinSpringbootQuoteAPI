package com.pzerbini.quotesvc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class InputRunnerService implements CommandLineRunner {

    private final GetQuoteService getQuoteService;

    //Command line runner that will start with the springboot project.
    //Scans user input and then invokes the QuoteGeneratorService class to invoke the API
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Please enter en for English or ru for Russian: ");

        Scanner scanner = new Scanner(System.in);
        String userLanguage = scanner.nextLine();

        System.out.println("User has selected " + userLanguage);
        getQuoteService.getQuote(userLanguage);

    }
}
