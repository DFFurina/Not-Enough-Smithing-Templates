package dev.dffurina.not_enough_smithing_templates;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(NotEnoughSmithingTemplatesMod.MODID)
public final class NotEnoughSmithingTemplatesMod {
    public static final String MODID = "not_enough_smithing_templates";
    private static final Logger LOGGER = LoggerFactory.getLogger(NotEnoughSmithingTemplatesMod.class);

    public NotEnoughSmithingTemplatesMod(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        LOGGER.info("Initializing Not Enough Smithing Templates......");
    }
}
