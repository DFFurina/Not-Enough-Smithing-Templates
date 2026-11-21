package dev.dffurina.not_enough_smithing_templates.datagen;

import dev.dffurina.not_enough_smithing_templates.NotEnoughSmithingTemplatesMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public abstract class ModLanguageProvider extends LanguageProvider {
    protected ModLanguageProvider(PackOutput output, String locale) {
        super(output, NotEnoughSmithingTemplatesMod.MODID, locale);
    }
}
