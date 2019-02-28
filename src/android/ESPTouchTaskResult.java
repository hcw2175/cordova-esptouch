/*
 * Copyright (c) 2015 - 广东小哈科技股份有限公司
 * All rights reserved.
 *
 * Created on 2019-02-27
 */
package org.apache.cordova.esptouch;

/**
 * ESPTouchTaskResult
 *
 * @author huchiwei
 * @version 1.0.0
 */
public class ESPTouchTaskResult {

    private boolean isSuccess = false;       // 是否配网成功
    private String errMsg;                   // 错误消息

    private String deviceBssid;              // 设备Mac地址
    private String deviceIp;                 // 设备IP

    public ESPTouchTaskResult() {
        this.isSuccess = true;
    }

    public ESPTouchTaskResult(String errMsg) {
        this.isSuccess = false;
        this.errMsg = errMsg;
    }

    public ESPTouchTaskResult(boolean isSuccess, String deviceBssid, String deviceIp) {
        this.isSuccess = isSuccess;
        this.deviceBssid = deviceBssid;
        this.deviceIp = deviceIp;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getDeviceBssid() {
        return deviceBssid;
    }

    public void setDeviceBssid(String deviceBssid) {
        this.deviceBssid = deviceBssid;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
