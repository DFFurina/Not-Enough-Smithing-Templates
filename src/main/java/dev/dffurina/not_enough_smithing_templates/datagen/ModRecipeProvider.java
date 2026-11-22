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
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public final class ModRecipeProvider extends RecipeProvider {
    private static final TagKey<Item> SMITHABLE_STONE = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(NotEnoughSmithingTemplatesMod.MODID, "smithable_stone"));
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    private record StoneToolRecipe(String id, Item baseItem, Item resultItem) {}
    private static final List<StoneToolRecipe> STONE_TOOL_RECIPES = List.of(
            new StoneToolRecipe(
                    "stone_pickaxe_smithing",
                    Items.WOODEN_PICKAXE,
                    Items.STONE_PICKAXE
            ),
            new StoneToolRecipe(
                    "stone_axe_smithing",
                    Items.WOODEN_AXE,
                    Items.STONE_AXE
            ),
            new StoneToolRecipe(
                    "stone_hoe_smithing",
                    Items.WOODEN_HOE,
                    Items.STONE_HOE
            ),
            new StoneToolRecipe(
                    "stone_sword_smithing",
                    Items.WOODEN_SWORD,
                    Items.STONE_SWORD
            ),
            new StoneToolRecipe(
                    "stone_shovel_smithing",
                    Items.WOODEN_SHOVEL,
                    Items.STONE_SHOVEL
            )
    );

    private void addStoneToolRecipe(RecipeOutput recipeOutput, StoneToolRecipe toolRecipe) {
        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(ModItems.STONE_SMITHING_TEMPLATE.get()),
                Ingredient.of(toolRecipe.baseItem()),
                Ingredient.of(SMITHABLE_STONE),
                RecipeCategory.TOOLS,
                toolRecipe.resultItem()
        ).unlocks(
                "has_stone_smithing_template",
                has(ModItems.STONE_SMITHING_TEMPLATE.get())
        ).save(
                recipeOutput,
                ResourceLocation.fromNamespaceAndPath(
                        NotEnoughSmithingTemplatesMod.MODID,
                        toolRecipe.id()
                )
        );
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        for (StoneToolRecipe toolRecipe : STONE_TOOL_RECIPES) {
            addStoneToolRecipe(recipeOutput, toolRecipe);
        }
    }
}
