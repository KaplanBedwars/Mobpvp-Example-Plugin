/***
 *  ------------------------------------------------
 *  A KaplanBedwars Original Team(AKOT)
 *  ------------------------------------------------
 *  The MIT License (MIT)
 *
 * Copyright (c) 2025 KaplanBedwars, A KaplanBedwars Original Team(AKOT)
 *  ------------------------------------------------
 *  NOTE: Bu Proje şu anda  mobpvp - 3.0.4 kullanmaktadır.
 *  ------------------------------------------------
 */




//Olduğunuz paket adı.
package xyz.example.client;

//MobPVP'nin sınıflarının kullanımı için gerekli kodlar. com.kaplandev ile başlar.
import com.kaplandev.api.annotation.MobpvpPlugin; //@MobpvpPlugin
import com.kaplandev.client.InfoSys.dink; // Bilgi sistemi

//Fabric'in kullanımı için gerekli.

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.gui.screen.TitleScreen;





//Bu Modun Mobpvp eklentisi olduğunu belirtir.
@MobpvpPlugin
//@KaplanBedwars sadece com.kaplandev paketinde kullanıla bilir. Bir işlevi yoktur. Yazılmaması gerekir.
/**
 @KaplanBedwars yazma
 **/
public class kaplandevClient implements ClientModInitializer {

    private boolean hasShownToast;

    @Override
    public void onInitializeClient() {
        ClientTickEvents.START_CLIENT_TICK.register((ClientTickEvents.StartTick) (client) -> {
            if (client.currentScreen instanceof TitleScreen && !this.hasShownToast) {
                dink.showToast("Merhaba!", "Çok Hawli modunuz çalışıyor!");
                this.hasShownToast = true;
            }
        });
    }
}

