package net.tazer.ablaze;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.NonNullLazyValue;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Ablaze.MOD_ID)
public class Ablaze
{
    public static final String MOD_ID = "ablaze";
    private static final Logger LOGGER = LogManager.getLogger();
    public static boolean isAlloyedLoaded = false;
    public static boolean isSteamPoweredLoaded = false;
    private static final NonNullLazyValue<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy("ablaze");

    public Ablaze() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        isAlloyedLoaded = ModList.get().isLoaded("alloyed");
        isSteamPoweredLoaded = ModList.get().isLoaded("steampowered");
    }

    public static CreateRegistrate registrate() {
        return (CreateRegistrate)REGISTRATE.get();
    }
}