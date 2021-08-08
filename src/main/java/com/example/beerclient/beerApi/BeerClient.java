package com.example.beerclient.beerApi;

import com.example.beerclient.beerApi.model.Beer;
import com.example.beerclient.beerApi.model.BeerStyle;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

/*
    created by jhcue at 08/08/2021
*/
public interface BeerClient {

    Flux<Beer> listBeers(Integer pageNumber, Integer pageSize, String beerName, BeerStyle beerStyle, Boolean showInventoryOnHand);

    Mono<URI> createNewBeer(Beer beer);

    Mono<Beer> getBeerById(String id);

    Mono<Integer> updateBeerById(String id, Beer beer);

    Mono<Integer> deleteBeerById(String id);

    Mono<Beer> getBeerByUPC(String upc);
}
