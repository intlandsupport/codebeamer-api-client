/*
 * Copyright (c) 2017 Intland Software (support@intland.com)
 *
 */
package com.intland.codebeamer.api.client.trackertypes;

public class Release implements TrackerType {
    @Override
    public Integer getId() {
        return 103;
    }

    @Override
    public String getName() {
        return "Release";
    }
}
