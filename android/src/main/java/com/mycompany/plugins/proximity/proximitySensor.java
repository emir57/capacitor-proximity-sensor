package com.mycompany.plugins.proximity;

import android.annotation.SuppressLint;
import android.os.PowerManager;

import androidx.appcompat.app.AppCompatActivity;

public class proximitySensor extends AppCompatActivity {

    private PowerManager powerManager;
    private PowerManager.WakeLock lock;

    private boolean isActive = false;
    public proximitySensor(){
        powerManager = (PowerManager)getSystemService(POWER_SERVICE);
    }

    @SuppressLint("InvalidWakeLockTag")
    public void activeProximitySensor(){
        lock = powerManager.newWakeLock(PowerManager.PROXIMITY_SCREEN_OFF_WAKE_LOCK,"incall");
        lock.acquire();
        isActive = true;
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
