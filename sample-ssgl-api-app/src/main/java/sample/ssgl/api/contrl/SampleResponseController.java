/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ssgl.api.contrl;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author walles
 */
@Controller
@ResponseBody
public class SampleResponseController {

    @RequestMapping({"/sep"})
    public void bye(@RequestParam(value = "name", required = false, defaultValue = "World") String name, HttpServletResponse response) {
        try {
            response.sendRedirect("/conversations/out.html");
        } catch (IOException ex) {
            Logger.getLogger(ByeController.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
