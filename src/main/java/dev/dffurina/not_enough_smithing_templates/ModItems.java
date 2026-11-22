package dev.dffurina.not_enough_smithing_templates;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NotEnoughSmithingTemplatesMod.MODID);
    public static final DeferredItem<Item> WOODEN_SMITHING_TEMPLATE = ITEMS.registerSimpleItem(
            "wooden_smithing_template",
            new Item.Properties()
    );
    public static final DeferredItem<Item> STONE_SMITHING_TEMPLATE = ITEMS.registerSimpleItem(
            "stone_smithing_template",
            new Item.Properties()
    );
    public static final DeferredItem<Item> IRON_SMITHING_TEMPLATE = ITEMS.registerSimpleItem(
            "iron_smithing_template",
            new Item.Properties()
    );
    public static final DeferredItem<Item> GOLDEN_SMITHING_TEMPLATE = ITEMS.registerSimpleItem(
            "golden_smithing_template",
            new Item.Properties()
    );
    public static final DeferredItem<Item> DIAMOND_SMITHING_TEMPLATE = ITEMS.registerSimpleItem(
            "diamond_smithing_template",
            new Item.Properties()
    );
    private ModItems() {}
}
