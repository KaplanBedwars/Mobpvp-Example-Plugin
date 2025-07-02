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



package xyz.example.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class kaplandevDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
    }
}
