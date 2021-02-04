/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ssgl.api.cstm;

import java.lang.reflect.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 *
 * @author walles
 */
public class BootCSRequestMappingHandler extends RequestMappingHandlerMapping {

    private final static Logger LOGGER = LoggerFactory.getLogger(BootCSRequestMappingHandler.class);

    @Override
    protected RequestCondition<?> getCustomTypeCondition(Class<?> handlerType) {

        LOGGER.info("HANDLER::::::::::::::: " + handlerType.toString());
        return super.getCustomTypeCondition(handlerType);
    }

    @Override
    protected RequestCondition<?> getCustomMethodCondition(Method method) {

        LOGGER.info("METHOD NAME::::::::::::::: " + method.getName());
        LOGGER.info("METHOD STRING ::::::::::::::: " + method.toString());
        return super.getCustomMethodCondition(method);
    }

}
