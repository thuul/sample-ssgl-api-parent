/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ssgl.api.comp;

import java.io.Serializable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author walles
 */
@Component
@ConfigurationProperties("immute")
public class SampleMutableAutoProp implements Serializable {

    private String appName;
    private String appDevMode;
    private Boolean appRunning;

    /**
     *
     * @return {@link String}
     */
    public String getAppName() {
        return appName;
    }

    /**
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     *
     * @return {@link String}
     */
    public String getAppDevMode() {
        return appDevMode;
    }

    /**
     *
     * @param appDevMode
     */
    public void setAppDevMode(String appDevMode) {
        this.appDevMode = appDevMode;
    }

    /**
     *
     * @return {@link String}
     */
    public Boolean isAppRunning() {
        return appRunning;
    }

    /**
     *
     * @param appRunning
     */
    public void setAppRunning(Boolean appRunning) {
        this.appRunning = appRunning;
    }
}
