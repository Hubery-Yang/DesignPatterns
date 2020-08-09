package com.hy.visitor;

/**
 * author: hubery yang
 * date: 8/9/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        Park park=new Park();
        Visitor visitor=new VisitorA();
        park.accept(visitor);

        Visitor visitorManager=new VisitorManager();
        park.accept(visitorManager);
    }
}
