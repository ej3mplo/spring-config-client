package com.ej3mplo.sccclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/index")
public class IndexController {

  @Value("${message: Default Hello}")
  private String message;

  @GetMapping("/")
  public String message(){
      return message;
  }
}