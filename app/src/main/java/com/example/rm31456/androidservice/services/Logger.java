package com.example.rm31456.androidservice.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by rm31456 on 28/11/2016.
 */
public class Logger extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate(){
        Log.i("ServicoMensagem", "Serviço Iniciado");
    }

    @Override
    public void onDestroy() {
        Log.i("ServicoMensagem", "Serviço encerrado");
    }
}
