package com.tmc.selfkick;

import org.junit.Before;
import org.junit.Test;

public class SelfKickTest {

    private SelfKick selfKick;

    @Before
    public void setup() {
        selfKick = new SelfKick();
    }

    @Test
    public void shouldLogAMessageOnEnable() {
        selfKick.onEnable();
    }
}
