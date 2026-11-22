package dev.dffurina.not_enough_smithing_templates.datagen;

import dev.dffurina.not_enough_smithing_templates.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;

public final class ModChineseLanguageProvider extends ModLanguageProvider {
    public ModChineseLanguageProvider(PackOutput output) {
        super(output, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.WOODEN_SMITHING_TEMPLATE.get(), "木制锻造模板");
        add(ModItems.STONE_SMITHING_TEMPLATE.get(), "石制锻造模板");
        add(ModItems.IRON_SMITHING_TEMPLATE.get(), "铁制锻造模板");
        add(ModItems.GOLDEN_SMITHING_TEMPLATE.get(), "金制锻造模板");
        add(ModItems.DIAMOND_SMITHING_TEMPLATE.get(), "钻石锻造模板");
        add("itemGroup.not_enough_smithing_templates.not_enough_smithing_templates_tab", "锻造科技");
    }
}
