package com.hy.nochain;

/**
 * author: hubery yang
 * date: 8/4/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {

        //request-->HttpFilter--URLFilter-->ParamFilter--->resource
        //未使用职责链
        Filter httpFilter=new HttpFilter();
        Filter urlFilter=new URLFilter();
        Filter paramFilter=new ParamFilter();

        httpFilter.filter();
        urlFilter.filter();
        paramFilter.filter();
    }
}
