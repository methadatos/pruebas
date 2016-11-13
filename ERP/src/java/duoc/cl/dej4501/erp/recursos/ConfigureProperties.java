/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.dej4501.erp.recursos;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 *
 * @author amontess
 */
public class ConfigureProperties {

    private static final String BUNDLE_NAME = "duoc.cl.dej4501.proyectofloreria.resources.configure";
    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

    public ConfigureProperties() {
    }

    public static String getProperty(String key) {
        try {
            return RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            return null;
        }
    }
}
