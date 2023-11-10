package com.maguasoft.example.webmagic;

import org.junit.Test;
import us.codecraft.webmagic.Spider;

public class WebMagicTest {

    @Test
    public void testExampleWebMagic() {
        Spider.create(new ExamplePageProcessor())
                .addUrl("https://search.jd.com/search?keyword=%E6%89%8B%E6%9C%BA&wq=%E6%89%8B%E6%9C%BA")
                .thread(2)
                .run();
    }

    @Test
    public void testGithubWebMagic() {
        Spider.create(new GithubRepoPageProcessor())
                .addUrl("https://github.com/code4craft")
                .thread(5)
                .run();
    }
}
