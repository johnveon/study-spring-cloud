package com.lichking.stucommon.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhoufe
 * @date 2018/11/29 17:17
 */
@ApiModel
public class ResponeDTO<T> implements Serializable {

    public static String RESPONSE_SUCCESS_CODE = "1";
    public static String RESPONSE_FAIL_CODE = "0";

    @ApiModelProperty(value = "返回码")
    private String code;
    @ApiModelProperty(value = "业务码")
    private String bizCode;
    @ApiModelProperty(value = "数据")
    private T data;
    @ApiModelProperty(value = "信息")
    private String message;

    @ApiModelProperty(value = "响应时间")
    private Date respTime = new Date();

    @ApiModelProperty(value = "来源")
    private String whereFrom;

    public ResponeDTO(){}

    public ResponeDTO(String code, String bizCode, String message, T data){
        this.code = code;
        this.bizCode = bizCode;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static ResponeDTO success(Object data) {
        return new ResponeDTO(RESPONSE_SUCCESS_CODE, "10000", "成功", data);
    }

    public static ResponeDTO failure(String bizCode, String message) {
        return new ResponeDTO(RESPONSE_FAIL_CODE, bizCode, message, null);
    }

    public Date getRespTime() {
        return respTime;
    }

    public void setRespTime(Date respTime) {
        this.respTime = respTime;
    }

    public String getWhereFrom() {
        return whereFrom;
    }

    public void setWhereFrom(String whereFrom) {
        this.whereFrom = whereFrom;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
