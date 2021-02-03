/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ssgl.api.contrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sample.ssgl.api.abs.contrl.IController;
import sample.ssgl.api.abs.service.IConversionService;

/**
 *
 * @author walles
 */
@RestController
public class CommonResponseController implements IController<String, String> {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonResponseController.class);
    
    @Autowired
    private IConversionService service;

    @RequestMapping("/doCalculate")
    @Override
    public String response(@RequestParam(value = "inval") String inval) {
        
        LOGGER.info("In Value {}", inval);
        Double d = Double.valueOf(inval);
        return service.doConversion(d);
    }

}
