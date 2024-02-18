package com.mycompany.plugins.example;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "proximitySensor")
public class proximitySensorPlugin extends Plugin {

    private proximitySensor implementation = new proximitySensor();

    @PluginMethod
    public void activeProximitySensor(PluginCall call){
        implementation.activeProximitySensor();
        JSObject jsObject = new JSObject();
        jsObject.put("isOpen",implementation.isActive());

        call.resolve(jsObject);
    }

    @PluginMethod
    public void deActivateProximitySensor(PluginCall call){
        implementation.deActivateProximitySensor();
        JSObject jsObject = new JSObject();
        jsObject.put("isOpen",implementation.isActive());

        call.resolve(jsObject);
    }

    @PluginMethod
    public void getActive(PluginCall call){
        JSObject jsObject = new JSObject();
        jsObject.put("isActive",implementation.isActive());

        call.resolve(jsObject);
    }
}
