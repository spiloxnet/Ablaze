package net.tazer.ablaze.content;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.tazer.ablaze.Ablaze;

public class AblazeItemGroup {
    public static final CreativeModeTab BASE_CREATIVE_TAB = new CreativeModeTab("base_creative_tab") {
        public ItemStack makeIcon() {
            return new ItemStack((ItemLike) AllItems.RUBBER.get());
        }
    };
    public static final CreativeModeTab COMPAT_CREATIVE_TAB = new CreativeModeTab("compat_creative_tab") {
        public ItemStack makeIcon() {
            return new ItemStack((ItemLike) AllItems.LATEX_BOTTLE.get());
        }
    };
    private static final CreateRegistrate REGISTRATE = Ablaze.registrate();

    static {
        REGISTRATE.creativeModeTab(() -> BASE_CREATIVE_TAB, "Create: Ablaze");
        REGISTRATE.creativeModeTab(() -> COMPAT_CREATIVE_TAB, "Create: Ablaze Compat");
    }
}