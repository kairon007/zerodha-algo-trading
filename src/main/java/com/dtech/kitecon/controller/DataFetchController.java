package com.dtech.kitecon.controller;


import com.dtech.kitecon.DataFetchService;
import com.zerodhatech.kiteconnect.kitehttp.exceptions.KiteException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DataFetchController {

  private final DataFetchService dataFetchService;

  @GetMapping("/profile")
  public String getProfile() throws IOException, KiteException {
    return dataFetchService.getProfile();
  }

  @GetMapping("/fetch/{instrument}")
  public String fetchData() throws IOException, KiteException {
    return dataFetchService.getProfile();
  }
}
