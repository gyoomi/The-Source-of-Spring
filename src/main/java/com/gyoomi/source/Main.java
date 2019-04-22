/**
 * Copyright © 2019, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.source;

import com.gyoomi.source.bean.User;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/19 9:58
 */
public class Main {

    public static void main(String[] args) throws Exception {
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:bean.xml");
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }
}
