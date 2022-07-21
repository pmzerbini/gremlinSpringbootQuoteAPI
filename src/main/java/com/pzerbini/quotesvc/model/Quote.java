package com.pzerbini.quotesvc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Quote {
    String quoteText;
    String quoteAuthor;
    String senderName;
    String senderLink;
    String quoteLink;
}
