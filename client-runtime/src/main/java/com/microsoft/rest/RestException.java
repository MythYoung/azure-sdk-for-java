/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.rest;

import com.microsoft.rest.http.HttpResponse;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Exception thrown for an invalid response with custom error information.
 */
public class RestException extends RuntimeException {
    /**
     * Information about the associated HTTP response.
     */
    private Response<ResponseBody> responseOkHttp;

    /**
     * Information about the associated HTTP response.
     */
    private HttpResponse responseV2;

    /**
     * The HTTP response body.
     */
    private Object body;

    /**
     * Initializes a new instance of the RestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public RestException(String message, Response<ResponseBody> response) {
        super(message);
        this.responseOkHttp = response;
    }

    /**
     * Initializes a new instance of the RestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param body the deserialized response body
     */
    public RestException(String message, Response<ResponseBody> response, Object body) {
        super(message);
        this.responseOkHttp = response;
        this.body = body;
    }

    /**
     * Initializes a new instance of the RestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public RestException(String message, HttpResponse response) {
        super(message);
        this.responseV2 = response;
    }

    /**
     * Initializes a new instance of the RestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param body the deserialized response body
     */
    public RestException(String message, HttpResponse response, Object body) {
        super(message);
        this.responseV2 = response;
        this.body = body;
    }

    /**
     * @return information about the associated HTTP response
     */
    public Response<ResponseBody> response() {
        return responseOkHttp;
    }

    /**
     * @return information about the associated HTTP response
     */
    public HttpResponse responseV2() {
        return responseV2;
    }

    /**
     * @return the HTTP response body
     */
    public Object body() {
        return body;
    }
}
