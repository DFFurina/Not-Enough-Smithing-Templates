package dev.dffurina.not_enough_smithing_templates;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            NotEnoughSmithingTemplatesMod.MODID
    );
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SMITHING_TEMPLATES = CREATIVE_MODE_TABS.register(
            "smithing_templates",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.not_enough_smithing_templates.smithing_templates")).icon(() -> new ItemStack(ModItems.STONE_SMITHING_TEMPLATE.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.WOODEN_SMITHING_TEMPLATE);
                        output.accept(ModItems.STONE_SMITHING_TEMPLATE);
                    }).build()
    );
    private  ModCreativeTabs() {}
}
