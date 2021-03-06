package com.hy.command;

/**
 * author: hubery yang
 * date: 8/9/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class BananaCommand extends Command {

    public BananaCommand(Store store) {
        super(store);
    }

    @Override
    public void sell() {
        store.sellBanana();
    }
}
