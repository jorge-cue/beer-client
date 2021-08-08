package com.example.beerclient.beerApi;

import com.example.beerclient.beerApi.model.Beer;
import com.example.beerclient.beerApi.model.BeerStyle;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

/*
    created by jhcue at 08/08/2021
*/
public class BeerClientImpl implements BeerClient {
    @Override
    public Flux<Beer> listBeers(Integer pageNumber, Integer pageSize, String beerName, BeerStyle beerStyle, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public Mono<URI> createNewBeer(Beer beer) {
        return null;
    }

    @Override
    public Mono<Beer> getBeerById(String id) {
        return null;
    }

    @Override
    public Mono<Integer> updateBeerById(String id, Beer beer) {
        return null;
    }

    @Override
    public Mono<Integer> deleteBeerById(String id) {
        return null;
    }

    @Override
    public Mono<Beer> getBeerByUPC(String upc) {
        return null;
    }
}
