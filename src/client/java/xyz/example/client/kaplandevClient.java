/***
 *  ------------------------------------------------
 *  A KaplanBedwars Original Team(AKOT)
 *  ------------------------------------------------
 *  The MIT License (MIT)
 *
 * Copyright (c) 2025 KaplanBedwars, A KaplanBedwars Original Team(AKOT)
 *  ------------------------------------------------
 *  NOTE: Bu Proje şu anda yayınlanmamış bir versiyon olan mobpvp - 3.0.4 kullanmaktadır. 3.0.4 yayınlandıktan sonra build.gradle'dan sürümü değiştirin.
 *  ------------------------------------------------
 */




//Olduğunuz paket adı.
package xyz.example.client;

//MobPVP'nin sınıflarının kullanımı için gerekli kodlar. com.kaplandev ile başlar.
import com.kaplandev.api.annotation.MobpvpPlugin;

//Fabric'in kullanımı için gerekli.
import net.fabricmc.api.ClientModInitializer;




//Bu Modun Mobpvp eklentisi olduğunu belirtir.
@MobpvpPlugin
//@KaplanBedwars sadece com.kaplandev paketinde kullanıla bilir. Bir işlevi yoktur. Yazılmaması gerekir.
/**
 @KaplanBedwars
 **/
public class kaplandevClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
    }
}
