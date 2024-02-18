package com.mycompany.plugins.proximity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

public class proximitySensor {

    private PowerManager powerManager;
    private PowerManager.WakeLock lock;

    private boolean isActive = false;

    @SuppressLint("InvalidWakeLockTag")
    public proximitySensor(Context context){
        powerManager = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
        lock = powerManager.newWakeLock(PowerManager.PROXIMITY_SCREEN_OFF_WAKE_LOCK,"incall");
    }


    public void activeProximitySensor(){
        if(!lock.isHeld()){
            lock.acquire();
            isActive = true;
        }
    }

    public void deActivateProximitySensor(){
        if(lock.isHeld()){
            lock.release();
            isActive = false;
        }
    }

    public boolean isActive(){
        return isActive;
    }
}
