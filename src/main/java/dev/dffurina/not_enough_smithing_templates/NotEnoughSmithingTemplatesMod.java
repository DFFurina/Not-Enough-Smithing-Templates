package dev.dffurina.not_enough_smithing_templates;

import dev.dffurina.not_enough_smithing_templates.datagen.ModItemModelProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(NotEnoughSmithingTemplatesMod.MODID)
public final class NotEnoughSmithingTemplatesMod {
    public static final String MODID = "not_enough_smithing_templates";
    private static final Logger LOGGER = LoggerFactory.getLogger(NotEnoughSmithingTemplatesMod.class);

    private void gatherData(GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();
        if (event.includeClient()) {
            event.addProvider(new ModItemModelProvider(output, event.getExistingFileHelper()));
        }
    }
    public NotEnoughSmithingTemplatesMod(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        modEventBus.addListener(this::gatherData);
        LOGGER.info("Initializing Not Enough Smithing Templates......");
    }
}
