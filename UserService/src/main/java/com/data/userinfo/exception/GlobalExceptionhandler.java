package com.data.userinfo.exception;

import com.data.userinfo.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionhandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    // @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse handleResourceNotFoundException(ResourceNotFoundException ex)
    {
        return new ApiResponse(ex.getMessage(), "sucees",HttpStatus.NOT_FOUND);
    }


}
