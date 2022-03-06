package net.tazer.ablaze.common.item;

import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.tazer.ablaze.Ablaze;
import org.jetbrains.annotations.NotNull;

public class AllItemGroups {
    private static final CreativeModeTab BASE_CREATIVE_TAB = new CreativeModeTab("base_creative_tab") {
        public ItemStack makeIcon() {
            return new ItemStack(AllItems.ANDESITE_ALLOY.get()); /*TODO* Make sure this uses an actual item!*/
        }
    };
    public static @NotNull CreativeModeTab baseTab() { return BASE_CREATIVE_TAB; }

    private static final CreativeModeTab COMPAT_CREATIVE_TAB = new CreativeModeTab("compat_creative_tab") {
        public ItemStack makeIcon() {
            return new ItemStack(AllItems.ANDESITE_ALLOY.get()); /*TODO* Make sure this uses an actual item!*/
        }
    };
    public static @NotNull CreativeModeTab compatTab() { return COMPAT_CREATIVE_TAB; }

    // Generate lang entries
    private static final CreateRegistrate REGISTRATE = Ablaze.basicRegistrate()
            .creativeModeTab(AllItemGroups::baseTab, "Create: Ablaze")
            .creativeModeTab(AllItemGroups::compatTab, "Create: Ablaze Compat");
}