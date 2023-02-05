package com.rentbookservice.webservice.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "statusCode", "statusDescription", "action", "count" })
@Data
public class ApiResponse<T> {

    @JsonProperty("statusCode")
    private Integer statusCode;

    @JsonProperty("statusDescription")
    private String statusDescripton;

    @JsonProperty("action")
    private String action;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("data")
    private T data;

    public ApiResponse() {
    }

    public ApiResponse(Integer statusCode, String statusDescription, String action, T data) {
        this.statusCode = statusCode;
        this.statusDescripton = statusDescription;
        this.action = action;
        this.data = data;
    }
}
