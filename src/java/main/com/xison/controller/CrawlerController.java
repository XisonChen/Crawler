package com.xison.controller;

import com.xison.service.CrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.AccessException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016/12/6.
 */
@RestController
public class CrawlerController {

    @Autowired
    private CrawlerService crawlerService;

    @Value("${auth.key}")
    private String key;

    @ModelAttribute
    public void AuthConfig(@RequestParam String auth) throws AccessException {
        if(!key.equals(auth)) {
            throw new AccessException("auth failed");
        }
    }

    @GetMapping("/init")
    public void init() {
        crawlerService.init();
    }

    @GetMapping("/crawl")
    public void crawl() throws InterruptedException {
        crawlerService.crawl();
    }

    @GetMapping("/update")
    @Scheduled(cron = "0 1 0 * * ?")
    public void update() throws InterruptedException {
        crawlerService.update();
    }
}
