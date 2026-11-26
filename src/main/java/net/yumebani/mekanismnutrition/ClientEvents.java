package net.yumebani.mekanismnutrition;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = MekanismNutritionMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        event.registerFluidType(
                new ColoredWaterFluidExtensions(0xFFFFBD85),
                ModFluids.LIQUID_MACRO_NUTRIENTS_TYPE.get()
        );
        event.registerFluidType(
                new ColoredWaterFluidExtensions(0xFFFFF785),
                ModFluids.LIQUID_MICRO_NUTRIENTS_TYPE.get()
        );
    }
}
