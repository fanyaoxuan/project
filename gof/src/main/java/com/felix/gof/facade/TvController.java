package com.felix.gof.facade;

/**
 * @Description: 提供统一接口的门面类
 * @Author: felix
 * @Date: 2019/2/27 15:31
 * @version: V1.0
 */
public class TvController {
    /**
     * 统一管理子系统的接口，所以需要拥有各个子系统的对象
     */
    private ChannelSystem channelSystem =new ChannelSystem();

    private PowerSystem powerSystem = new PowerSystem();

    private VoiceSystem voiceSystem = new VoiceSystem();

    /**
     * 调用子系统的相应功能
     */
    public void next() {
        channelSystem.next();
    }

    public void prev() {
        channelSystem.prev();
    }

    public void powerOn() {
       powerSystem.powerOn();
    }

    public void powerOff() {
        powerSystem.powerOff();
    }

    public void turnUp() {
        voiceSystem.turnUp();
    }

    public void turnDown() {
        voiceSystem.turnDown();
    }
}
