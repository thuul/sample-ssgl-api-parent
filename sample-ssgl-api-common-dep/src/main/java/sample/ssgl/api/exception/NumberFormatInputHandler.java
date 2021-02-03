/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ssgl.api.exception;

import sample.ssgl.api.abs.IErrorHandler;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author walles
 */
public class NumberFormatInputHandler implements IErrorHandler {

    @ResponseBody
    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @Override
    public String handler(Exception ex) {
        return ex.getLocalizedMessage();
    }
}
