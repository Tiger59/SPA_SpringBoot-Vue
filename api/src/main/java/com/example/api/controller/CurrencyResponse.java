package com.example.api.controller;

import lombok.Builder;
import lombok.Getter;
import com.example.api.domain.Currency;

import java.util.List;

@Getter
@Builder
public class CurrencyResponse {

    private List<Currency> currencies;
}
