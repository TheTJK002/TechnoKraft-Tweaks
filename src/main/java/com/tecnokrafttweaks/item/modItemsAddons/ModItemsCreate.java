package com.tecnokrafttweaks.item.modItemsAddons;

import com.tecnokrafttweaks.fluids.modFluidsAddons.ModFluidsCreate;
import com.tecnokrafttweaks.item.ModCreativeTabs;
import com.tecnokrafttweaks.item.custom.GlowItems;
import com.tecnokrafttweaks.item.custom.ToolItems;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.item.ModItems.ITEMS;

public class ModItemsCreate {
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ZINC_SHEET = ITEMS.register("zinc_sheet", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_RADIANCE = ITEMS.register("refined_radiance", () -> new GlowItems(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_RADIANCE_SHEET = ITEMS.register("refined_radiance_sheet", () -> new GlowItems(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_RADIANCE_INDUCTION_COIL = ITEMS.register("refined_radiance_induction_coil", () -> new GlowItems(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> KINETIC_MECHANISM = ITEMS.register("kinetic_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SEALED_MECHANISM = ITEMS.register("sealed_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> INFERNAL_MECHANISM = ITEMS.register("infernal_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> INDUCTIVE_MECHANISM = ITEMS.register("inductive_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ABSTRUSE_MECHANISM = ITEMS.register("abstruse_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> DIAMOND_SAND_PAPER = ITEMS.register("diamond_sand_paper", () -> new ToolItems(new Item.Properties().stacksTo(1).durability(1561).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_ZINC_BUCKET = ITEMS.register("molten_zinc_bucket", () -> new BucketItem(ModFluidsCreate.SOURCE_MOLTEN_ZINC, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_BRASS_BUCKET = ITEMS.register("molten_brass_bucket", () -> new BucketItem(ModFluidsCreate.SOURCE_MOLTEN_BRASS, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {
    }
}
