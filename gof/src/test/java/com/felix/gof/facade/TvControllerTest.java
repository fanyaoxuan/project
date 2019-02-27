package com.felix.gof.facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class TvControllerTest {

    @Test
    public void controller(){
        TvController tvController = new TvController();

        tvController.next();
        tvController.prev();

        tvController.powerOff();
        tvController.powerOn();

        tvController.turnDown();
        tvController.turnUp();

    }

}