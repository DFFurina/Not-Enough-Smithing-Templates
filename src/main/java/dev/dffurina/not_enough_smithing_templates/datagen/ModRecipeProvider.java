package dev.dffurina.not_enough_smithing_templates.datagen;

import java.util.concurrent.CompletableFuture;

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
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public final class ModRecipeProvider extends RecipeProvider {
    private static final TagKey<Item> SMITHABLE_STONE = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(NotEnoughSmithingTemplatesMod.MODID, "smithable_stone"));
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(ModItems.STONE_SMITHING_TEMPLATE.get()),
                Ingredient.of(Items.WOODEN_PICKAXE),
                Ingredient.of(SMITHABLE_STONE),
                RecipeCategory.TOOLS,
                Items.STONE_PICKAXE
        ).unlocks(
                "has_stone_smithing_template",
                has(ModItems.STONE_SMITHING_TEMPLATE.get())
        ).save(
                recipeOutput,
                ResourceLocation.fromNamespaceAndPath(
                        NotEnoughSmithingTemplatesMod.MODID,
                        "stone_pickaxe_smithing"
                )
        );
        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(ModItems.STONE_SMITHING_TEMPLATE.get()),
                Ingredient.of(Items.WOODEN_AXE),
                Ingredient.of(SMITHABLE_STONE),
                RecipeCategory.TOOLS,
                Items.STONE_AXE
        ).unlocks(
                "has_stone_smithing_template",
                has(ModItems.STONE_SMITHING_TEMPLATE.get())
        ).save(
                recipeOutput,
                ResourceLocation.fromNamespaceAndPath(
                        NotEnoughSmithingTemplatesMod.MODID,
                        "stone_axe_smithing"
                )
        );
    }
}
