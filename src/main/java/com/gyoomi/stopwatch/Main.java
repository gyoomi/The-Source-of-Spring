/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.stopwatch;

import org.springframework.util.StopWatch;

import java.util.Random;

/**
 * main class
 *
 * @author Leon
 * @date 2019-10-29 11:52
 */
public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start("业务查询");
        doSomething();
        stopWatch.stop();

        stopWatch.start("业务计算处理");
        doSomething();
        // stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }

    private static void doSomething() {
        int time = Math.abs(new Random().nextInt(2000));
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
