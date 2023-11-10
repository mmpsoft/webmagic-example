package com.maguasoft.example.webmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

public class ExamplePageProcessor implements PageProcessor {

    @Override
    public void process(Page page) {
        List<String> urls = page.getHtml().css("ul#navitems-group1").links().all();
        System.out.println(urls);

    }

    @Override
    public Site getSite() {
        return Site.me();
    }
}
