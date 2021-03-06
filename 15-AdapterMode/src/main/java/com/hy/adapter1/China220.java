package com.hy.adapter1;

/**
 * author: hubery yang
 * date: 8/2/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class China220 extends Voltage {

    public China220(int voltage) {
        super(voltage);
    }

    @Override
    public int output() {
        return this.getVoltage();
    }
}
