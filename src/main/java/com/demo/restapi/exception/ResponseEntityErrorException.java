package com.demo.restapi.exception;

import com.demo.restapi.payload.ApiResponse;
import org.springframework.http.ResponseEntity;

public class ResponseEntityErrorException extends RuntimeException {
    private static final long serialVersionUID = -3156815846745801694L;

    private transient ResponseEntity<ApiResponse> apiResponse;

    public ResponseEntityErrorException(ResponseEntity<ApiResponse> apiResponse) {
        this.apiResponse = apiResponse;
    }

    public ResponseEntity<ApiResponse> getApiResponse() {
        return apiResponse;
    }
}
