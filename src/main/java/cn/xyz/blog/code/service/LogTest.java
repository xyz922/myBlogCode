package cn.xyz.blog.code.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author gem.xu
 */
@Component
public class LogTest {
    private Logger log = LoggerFactory.getLogger(LogTest.class);

    @PostConstruct
    public void init(){
        log.info("加载中 这是info信息");
        log.warn("加载中 这是warn信息");
        log.error("加载中 这是error信息");
        //以为是被最后一个覆盖了，结果还是输出了error
        log.info("加载中 这是info信息");
    }
}