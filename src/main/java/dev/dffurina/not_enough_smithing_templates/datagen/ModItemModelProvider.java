package dev.dffurina.not_enough_smithing_templates.datagen;

import dev.dffurina.not_enough_smithing_templates.ModItems;
import dev.dffurina.not_enough_smithing_templates.NotEnoughSmithingTemplatesMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NotEnoughSmithingTemplatesMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.WOODEN_SMITHING_TEMPLATE.get());
        basicItem(ModItems.STONE_SMITHING_TEMPLATE.get());
        basicItem(ModItems.IRON_SMITHING_TEMPLATE.get());
    }
}
