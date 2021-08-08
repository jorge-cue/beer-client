package com.example.beerclient.beerApi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/*
    created by jhcue at 08/08/2021
*/
@Data
@Builder
@AllArgsConstructor
public class Beer {
    private String id; // UUID, null for createNewBeer
    private Integer version;
    private LocalDateTime createDate; // ZonedDateTime with ZoneOffset.UTC
    private LocalDateTime lastModifiedDateTime; // ZonedDateTime with ZoneOffset.UTC
    @NonNull
    private String beerName;
    @NonNull
    private BeerStyle beerStyle;
    @NonNull
    private String upc;
    @NonNull
    private Integer quantityOnHand;
    @NonNull
    private BigDecimal price;
}
