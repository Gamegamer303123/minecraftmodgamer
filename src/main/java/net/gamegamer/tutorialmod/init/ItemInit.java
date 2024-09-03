package net.gamegamer.tutorialmod.init;

import net.gamegamer.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_TOTEM = ITEMS.register("time_totem",
            () -> new Item(new Item.Properties()
                    .stacksTo(1).
                    rarity(Rarity.EPIC
                    )));
}
