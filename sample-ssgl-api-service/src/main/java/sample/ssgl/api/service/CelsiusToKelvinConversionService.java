/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ssgl.api.service;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import sample.ssgl.api.abs.service.IConversionService;

/**
 *
 * @author walles
 */
@Service
public class CelsiusToKelvinConversionService implements IConversionService {

    @Override
    public String doConversion(double inval) {
        double cls = inval + 273.15;
        return String.format("Input: %s celsius = %s kelvin", inval, cls);
    }

    @PostConstruct
    @Override
    public void initialize() {
    }
}
