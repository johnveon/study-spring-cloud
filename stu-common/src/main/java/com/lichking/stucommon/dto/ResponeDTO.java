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

    @ApiModelProperty(value = "返回码")
    private String code;
    @ApiModelProperty(value = "返回数据")
    private T data;

    @ApiModelProperty(value = "响应时间")
    private Date respTime = new Date();

    @ApiModelProperty(value = "来源")
    private String whereFrom;

    public ResponeDTO(){}

    public ResponeDTO(String code, T data){
        this.code = code;
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

    public static ResponeDTO SUCCESS(Object data) {
        return new ResponeDTO("1", data);
    }

    public static ResponeDTO FAILURE(Object data) {
        return new ResponeDTO("0", data);
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
}
