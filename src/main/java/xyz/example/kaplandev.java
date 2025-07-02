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
package xyz.example;

//MobPVP'nin sınıflarının kullanımı için gerekli kodlar. com.kaplandev ile başlar.
import com.kaplandev.api.MobPvPInitializer;
import com.kaplandev.api.PluginRegistry;
import com.kaplandev.api.annotation.KaplanBedwars;
import com.kaplandev.api.annotation.MobpvpPlugin;

//Fabric'in kullanımı için gerekli.
import net.fabricmc.api.ModInitializer;

//Mobpvp'nin getirdiği bütün importlar

//Main
import com.kaplandev.mobpvp;
import com.kaplandev.api.PluginRegistry;
import com.kaplandev.api.MobPvPInitializer;
import com.kaplandev.api.annotation.KaplanBedwars;
import com.kaplandev.api.annotation.MobpvpPlugin;
import static com.kaplandev.api.rules.KaplanBedwars.validateKaplanInternal;
import com.kaplandev.util.NameUtils;
import com.kaplandev.item.Items;
import com.kaplandev.item.CrudeAcidicLayerRockOreBlock; //Yakında kullanımdan kalkacak
import com.kaplandev.item.tab.Tabs;
import com.kaplandev.item.feature.ItemFeature;
import com.kaplandev.item.feature.KalpItemFeatures;
import com.kaplandev.strings.path.Paths;
import com.kaplandev.level.ArmorSet;
import com.kaplandev.level.BossVariants;
import com.kaplandev.level.MobLevelRegistry;
import com.kaplandev.level.ZombieVariantAssigner;
import com.kaplandev.entity.EntitiyRegister;
import com.kaplandev.entity.boss.BulwarkEntity;
import com.kaplandev.entity.boss.goal.BreakBlockGoal;
import com.kaplandev.entity.boss.goal.FireballAttackGoal;
import com.kaplandev.entity.boss.goal.SummonZombieGoal;
import com.kaplandev.entity.boss.goal.TntSpawnGoal;
import com.kaplandev.entity.spawn.SpawnLocation;
import com.kaplandev.entity.spawn.LuckySpawnLocation;
import com.kaplandev.entity.zombie.CustomZombieEntity;
import com.kaplandev.entity.zombie.goal.CustomDashAtTargetGoal;
import com.kaplandev.entity.skeleton.CustomSkeletonEntity;
import com.kaplandev.mixin.LivingEntityMixin;
import com.kaplandev.mixin.PlayerEntityMixin;
import com.kaplandev.block.Blocks;
import com.kaplandev.block.util.BlockCreator;
import com.kaplandev.block.behavior.BlockBehavior;
import com.kaplandev.block.behavior.AcidicOreBehavior;
import com.kaplandev.build.ArenaFeature;
import com.kaplandev.build.ArenaTracker;
import com.kaplandev.build.IsGrass;
import com.kaplandev.build.StructureBuilder;
import com.kaplandev.commands.LocateArenaCommand;
import com.kaplandev.commands.ModCommands;
import com.kaplandev.commands.dashSys.DashCommand;
import com.kaplandev.effect.LevelEffectHandler;
import com.kaplandev.gen.ModWorldGen;


//Client(Bu pakette kullanamazsınız)
/*import com.kaplandev.client.mobpvpClient;
import com.kaplandev.client.mobpvpDataGenerator;
import com.kaplandev.client.gui.MobPVPConfigScreen;
import com.kaplandev.client.gui.WelcomeScreen;
import com.kaplandev.client.renderer.CustomZombieRenderer;
import com.kaplandev.client.renderer.entity.zombie.SuperZombieRenderer;
import com.kaplandev.client.renderer.entity.boss.BulwarkRenderer;
import com.kaplandev.client.config.ModConfig;
import com.kaplandev.client.keybinds.DashKeybind;
import com.kaplandev.client.InfoSys.dink;*/

//Bu Modun Mobpvp eklentisi olduğunu belirtir.
@MobpvpPlugin
//@KaplanBedwars sadece com.kaplandev paketinde kullanıla bilir. Bir işlevi yoktur.
/**
@KaplanBedwars
**/
public class kaplandev implements ModInitializer, MobPvPInitializer {

    //onLoad ve onClose modları için gerekli kayıt işlemi.
    static {
        PluginRegistry.register(new kaplandev());
    }

    //Modunuz açıldığı zaman çalışacak kod
    @Override
    public void onInitialize() {
    }

    //onLoad çalışmaz. Onun yerine  public void onInitialize() kullanın.
    /*@Override
    public void onLoad() {
        System.out.println("[MyCustomAddon] onLoad çalıştı!");
    }*/

    // MobPVP modu kapandığında bu kod çalışır.
    @Override
    public void onClose() {
        System.out.println("[MyCustomAddon] onClose çalıştı!");
    }
}
