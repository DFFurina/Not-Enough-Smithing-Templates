package dev.dffurina.not_enough_smithing_templates.datagen;

import java.util.concurrent.CompletableFuture;
import java.util.List;

import dev.dffurina.not_enough_smithing_templates.ModItems;
import dev.dffurina.not_enough_smithing_templates.NotEnoughSmithingTemplatesMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.Tags;

public final class ModRecipeProvider extends RecipeProvider {
    private static final TagKey<Item> SMITHABLE_STONE = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(NotEnoughSmithingTemplatesMod.MODID, "smithable_stone"));
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    private static Item vanillaItem(String path) {
        return BuiltInRegistries.ITEM.getOptional(
                ResourceLocation.withDefaultNamespace(path)
        ).orElseThrow(() ->
                new IllegalStateException("Unknown vanilla item: minecraft:"+path)
        );
    }
    private record StoneToolRecipe(String id, Item baseItem, Item resultItem) {}
    private enum ToolKind {
        PICKAXE("pickaxe"),
        AXE("axe"),
        HOE("hoe"),
        SHOVEL("shovel"),
        SWORD("sword");
        private final String id;
        ToolKind(String id) {
            this.id = id;
        }
        public String id() {
            return id;
        }
    }
    private record MaterialTier(String id, DeferredItem<Item> template, TagKey<Item> addition, String sourcePrefix, String targetPrefix) {}
    private static final List<MaterialTier> MATERIAL_TIERS = List.of(
            new MaterialTier(
                    "stone",
                    ModItems.STONE_SMITHING_TEMPLATE,
                    SMITHABLE_STONE,
                    "wooden",
                    "stone"
            ),
            new MaterialTier(
                    "iron",
                    ModItems.IRON_SMITHING_TEMPLATE,
                    Tags.Items.INGOTS_IRON,
                    "stone",
                    "iron"
            ),
            new MaterialTier(
                    "golden",
                    ModItems.GOLDEN_SMITHING_TEMPLATE,
                    Tags.Items.INGOTS_GOLD,
                    "iron",
                    "golden"
            ),
            new MaterialTier(
                    "diamond",
                    ModItems.DIAMOND_SMITHING_TEMPLATE,
                    Tags.Items.GEMS_DIAMOND,
                    "iron",
                    "diamond"
            )
    );

    private void addToolRecipe(RecipeOutput recipeOutput, MaterialTier tier, ToolKind tool) {
        Item baseItem = vanillaItem(tier.sourcePrefix() + '_' + tool.id());
        Item resultItem = vanillaItem(tier.targetPrefix() + '_' + tool.id());
        String recipeId = tier.id() + "_" + tool.id() + "_smithing";
        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(tier.template().get()),
                Ingredient.of(baseItem),
                Ingredient.of(tier.addition()),
                RecipeCategory.TOOLS,
                resultItem
        ).unlocks(
                "has_" + tier.id() + "_smithing_template",
                has(tier.template.get())
        ).save(
                recipeOutput,
                ResourceLocation.fromNamespaceAndPath(
                        NotEnoughSmithingTemplatesMod.MODID,
                        recipeId
                )
        );
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        for (MaterialTier tier : MATERIAL_TIERS) {
            for (ToolKind tool : ToolKind.values()) {
                addToolRecipe(recipeOutput, tier, tool);
            }
        }
    }
}
