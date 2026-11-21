package dev.dffurina.not_enough_smithing_templates.datagen;

import dev.dffurina.not_enough_smithing_templates.ModItems;
import net.minecraft.data.PackOutput;

public final class ModChineseLanguageProvider extends ModLanguageProvider {
    public ModChineseLanguageProvider(PackOutput output) {
        super(output, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.WOODEN_SMITHING_TEMPLATE.get(), "木制锻造模板");
        add(ModItems.STONE_SMITHING_TEMPLATE.get(), "石制锻造模板");
        add("itemGroup.not_enough_smithing_templates.smithing_templates", "锻造模板");
    }
}
