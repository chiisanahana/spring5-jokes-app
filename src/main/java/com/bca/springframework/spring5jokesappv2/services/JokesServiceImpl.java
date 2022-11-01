package com.bca.springframework.spring5jokesappv2.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokesServiceImpl implements JokesService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String jokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
