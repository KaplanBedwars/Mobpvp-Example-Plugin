/***
 *  ------------------------------------------------
 *  A KaplanBedwars Original Team(AKOT)
 *  ------------------------------------------------
 *  The MIT License (MIT)
 *
 * Copyright (c) 2025 KaplanBedwars, A KaplanBedwars Original Team(AKOT)
 *  ------------------------------------------------
 *  NOTE: Bu Proje şu anda  mobpvp - 3.0.7 kullanmaktadır.
 *  ------------------------------------------------
 */


//Olduğunuz paket adı.
package xyz.example;

//MobPVP'nin sınıflarının kullanımı için gerekli kodlar com.kaplandev ile başlar.
import com.kaplandev.api.MobPvPInitializer;//onClose için
import com.kaplandev.api.PluginRegistry; //MOBPVP eklenti kaydedicisi
import com.kaplandev.api.annotation.MobpvpPlugin;//@MobpvpPlugin
import com.kaplandev.item.tab.Tabs;//Eşya menüsü

//Fabric'in kullanımı için gerekli.
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


//Bu Modun Mobpvp eklentisi olduğunu belirtir.
@MobpvpPlugin
//@KaplanBedwars sadece com.kaplandev paketinde kullanıla bilir. Bir işlevi yoktur. Yazılmaması gerekir.
/**
@KaplanBedwars yazma
**/
public class kaplandev implements ModInitializer, MobPvPInitializer {

    public static final String MOD_ID = "senin_hawli_modun"; //Kendi mod id niz. Benzersiz olmalı. Eğer değiştirirseniz assets klasöründeki tüm dosyaların mod id değerlerinide değiştirin.

    //Eşya oluşturma. İsmini resources/assets/senin_hawli_modun/lang/en_us.json yada resources/assets/senin_hawli_modun/lang/tr_tr.json'dan alır.
    public static final Item COOL_ITEM = register("senin_hawli_esyan", new Item(new Item.Settings()));

    //onLoad ve onClose modları için gerekli kayıt işlemi.
    static {
        PluginRegistry.register(new kaplandev());
    }

    //Modunuz açıldığı zaman çalışacak kod
    @Override
    public void onInitialize() {
        registerToTab(COOL_ITEM, Tabs.MOBPVP_GROUP_KEY); //eşyayı mobpvp nin ana eşya menüsüne ekle.
    }

    //onLoad artık çalışmıyor.    public void onInitialize() kullanın.
    /*@Override
    public void onLoad() {
        System.out.println("[MyCustomAddon] onLoad çalıştı!");
    }*/

    // MobPVP modu kapandığında bu kod çalışır.
    @Override
    public void onClose() {
        System.out.println("[" + MOD_ID + "] onClose çalıştı!");
    }


     //Eşyayı kaydetmek için yardımcı kod.
    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }


    //eşyayı bir menüye kaydetmek için.
    private static void registerToTab(Item item, RegistryKey<ItemGroup> tab) {
        ItemGroupEvents.modifyEntriesEvent(tab)
                .register(entries -> entries.add(item));
    }
}
