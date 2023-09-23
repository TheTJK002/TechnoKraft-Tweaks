package com.tecnokrafttweaks.item.modItemsAddons;

import com.tecnokrafttweaks.fluids.modFluidsAddons.ModFluidsCreate;
import com.tecnokrafttweaks.fluids.modFluidsAddons.ModFluidsThermal;
import com.tecnokrafttweaks.item.ModCreativeTabs;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.item.ModItems.ITEMS;

public class ModItemsThermal {
    public static final RegistryObject<Item> COKE_CHUNK = ITEMS.register("coke_chunk", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> GEAR_CAST = ITEMS.register("gear_cast", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> NUGGET_CAST = ITEMS.register("nugget_cast", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> BLOCK_CAST = ITEMS.register("block_cast", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_TIN_BUCKET = ITEMS.register("molten_tin_bucket", () -> new BucketItem(ModFluidsThermal.SOURCE_MOLTEN_TIN, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_LEAD_BUCKET = ITEMS.register("molten_lead_bucket", () -> new BucketItem(ModFluidsThermal.SOURCE_MOLTEN_LEAD, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_NICKEL_BUCKET = ITEMS.register("molten_nickel_bucket", () -> new BucketItem(ModFluidsThermal.SOURCE_MOLTEN_NICKEL, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_BRONZE_BUCKET = ITEMS.register("molten_bronze_bucket", () -> new BucketItem(ModFluidsThermal.SOURCE_MOLTEN_BRONZE, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_INVAR_BUCKET = ITEMS.register("molten_invar_bucket", () -> new BucketItem(ModFluidsThermal.SOURCE_MOLTEN_INVAR, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_CONSTANTAN_BUCKET = ITEMS.register("molten_constantan_bucket", () -> new BucketItem(ModFluidsThermal.SOURCE_MOLTEN_CONSTANTAN, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_SIGNALUM_BUCKET = ITEMS.register("molten_signalum_bucket", () -> new BucketItem(ModFluidsThermal.SOURCE_MOLTEN_SIGNALUM, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_LUMIUM_BUCKET = ITEMS.register("molten_lumium_bucket", () -> new BucketItem(ModFluidsThermal.SOURCE_MOLTEN_LUMIUM, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_ENDERIUM_BUCKET = ITEMS.register("molten_enderium_bucket", () -> new BucketItem(ModFluidsThermal.SOURCE_MOLTEN_ENDERIUM, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {}
}
