package com.inc.admin.controller.sys;

import com.inc.admin.aspect.WebLogAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/curd")
@RestController
public class BaseController {
    private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    /**
     * @methodName
     * <p>
     *    Description:
     *    测试增删改查
     * </p>
     * @param: null
     * @return null
     * @throws
     * <p>Copyright: Copyright (c) 2017</p>
     * <p>Company: www.baidudu.com</p>
     * @Author xianxian
     * @Date 2023/11/7  5:34
     * @version 1.0
     */
    @PostMapping("/login")
    String TestUrl(){
        logger.info("logger Hello World!");
        return "Hello World! Sucess!";
    }

}
