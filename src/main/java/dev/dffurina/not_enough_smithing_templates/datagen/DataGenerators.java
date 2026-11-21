package dev.dffurina.not_enough_smithing_templates.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class DataGenerators {
    private DataGenerators() {}
    public static void gatherData(GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();
        if (event.includeClient()) {
            event.addProvider(new ModItemModelProvider(output, event.getExistingFileHelper()));
            event.addProvider(new ModEnglishLanguageProvider(output));
            event.addProvider(new ModChineseLanguageProvider(output));
        }
    }
}
