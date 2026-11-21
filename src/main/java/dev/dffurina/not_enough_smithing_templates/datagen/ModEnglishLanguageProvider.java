package dev.dffurina.not_enough_smithing_templates.datagen;

import dev.dffurina.not_enough_smithing_templates.ModItems;
import net.minecraft.data.PackOutput;

public final class ModEnglishLanguageProvider extends ModLanguageProvider {
    public ModEnglishLanguageProvider(PackOutput output) {
        super(output, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.WOODEN_SMITHING_TEMPLATE.get(), "Wooden Smithing Template");
        add(ModItems.STONE_SMITHING_TEMPLATE.get(), "Stone Smithing Template");
        add("itemGroup.not_enough_smithing_templates.smithing_templates", "Smithing Templates");
    }
}
