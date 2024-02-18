package com.mycompany.plugins.proximity;

import android.Manifest;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;

@CapacitorPlugin(
        name = "proximitySensor",
        permissions = {
                @Permission(
                        alias = "wake_lock",
                        strings = { Manifest.permission.WAKE_LOCK }
                )
        }
)
public class proximitySensorPlugin extends Plugin {

    private proximitySensor implementation;

    @Override
    public void load() {
        super.load();
        implementation = new proximitySensor(getContext());
    }

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
