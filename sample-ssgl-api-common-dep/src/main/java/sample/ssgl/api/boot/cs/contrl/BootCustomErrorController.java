/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ssgl.api.boot.cs.contrl;

import java.util.List;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;

/**
 *
 * @author walles
 */
//@Controller
//@RequestMapping("${server.error.path:${error.path:/error}}")
public class BootCustomErrorController extends BasicErrorController {

    /**
     *
     * @param errorAttributes
     * @param errorProperties
     */
    public BootCustomErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
        super(errorAttributes, errorProperties);
    }

    /**
     *
     * @param errorAttributes
     * @param errorProperties
     * @param errorViewResolvers
     */
    public BootCustomErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties, List<ErrorViewResolver> errorViewResolvers) {
        super(errorAttributes, errorProperties, errorViewResolvers);
    }

}
