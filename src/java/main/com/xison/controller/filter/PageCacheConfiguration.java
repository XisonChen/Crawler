package com.xison.controller.filter;

import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/12/6.
 */
@Configuration
@AutoConfigureAfter(CacheConfiguration.class)
public class PageCacheConfiguration {

    @Bean
    public FilterRegistrationBean registerBlogsPageFilter(){
        CustomPageCachingFilter customPageCachingFilter = new CustomPageCachingFilter("com.xison.Songs");
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(customPageCachingFilter);
        List<String> urls = new ArrayList<String>();
        urls.add("/songs");
        filterRegistrationBean.setUrlPatterns(urls);
        return filterRegistrationBean;
    }
}
