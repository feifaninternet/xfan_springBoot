package com.boot.tools.exception;

import com.boot.web.models.dto.ErrorInfoDTO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xfan
 * @date Created on 2018/1/27 -- 15:29.
 * @desc global exception handler
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfoDTO<String> jsonErrorHandler(HttpServletRequest request,CustomException e) throws Exception{
        ErrorInfoDTO<String> errorResp = new ErrorInfoDTO<>();
        errorResp.setCode(ErrorInfoDTO.ERROR);
        errorResp.setMessage(e.getMessage());
        errorResp.setUrl(request.getRequestURL().toString());
        errorResp.setData("An error occurred");
        return errorResp;
    }
}
