package net.sink.simplesoups.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sink.simplesoups.SimpleSoups;

import static net.minecraft.item.ItemGroups.*;

public class SoupItems {
    public static final Item WHEAT_GRUEL = new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).build()).maxCount(1));
    public static final Item POTATO_SOUP = new StewItem(new StewItem.Settings()
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build()).maxCount(1));
    public static final Item CACTUS_SOUP = new StewItem(new StewItem.Settings()
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build()).maxCount(1));
    public static final Item CARROT_SOUP = new StewItem(new Item.Settings()
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build()).maxCount(1));

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(SimpleSoups.MOD_ID, "wheat_gruel"), WHEAT_GRUEL);
        Registry.register(Registries.ITEM, new Identifier(SimpleSoups.MOD_ID, "potato_soup"), POTATO_SOUP);
        Registry.register(Registries.ITEM, new Identifier(SimpleSoups.MOD_ID, "cactus_soup"), CACTUS_SOUP);
        Registry.register(Registries.ITEM, new Identifier(SimpleSoups.MOD_ID, "carrot_soup"), CARROT_SOUP);
    }

    public static void addItemsToItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(FOOD_AND_DRINK).register(content -> content.addAfter(Items.MUSHROOM_STEW, WHEAT_GRUEL));
        ItemGroupEvents.modifyEntriesEvent(FOOD_AND_DRINK).register(content -> content.addAfter(Items.BEETROOT_SOUP, POTATO_SOUP));
        ItemGroupEvents.modifyEntriesEvent(FOOD_AND_DRINK).register(content -> content.addAfter(Items.BEETROOT_SOUP, CACTUS_SOUP));
        ItemGroupEvents.modifyEntriesEvent(FOOD_AND_DRINK).register(content -> content.addAfter(Items.BEETROOT_SOUP, CARROT_SOUP));
    }
}
