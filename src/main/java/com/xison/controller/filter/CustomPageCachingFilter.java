package com.xison.controller.filter;

import net.sf.ehcache.constructs.web.filter.SimpleCachingHeadersPageCachingFilter;

/**
 * Created by admin on 2016/12/6.
 */
public class CustomPageCachingFilter extends SimpleCachingHeadersPageCachingFilter {

    private final String customCacheName;

    public CustomPageCachingFilter(String name){
        this.customCacheName = name;
    }

    @Override
    protected String getCacheName() {
        return customCacheName;
    }

}