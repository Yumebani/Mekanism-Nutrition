package net.yumebani.mekanismnutrition;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluids {
    public static final DeferredRegister<FluidType> fluidTypeRegistery =
            DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MekanismNutritionMod.MODID);

    public static final DeferredRegister<Fluid> fluidRegistery =
            DeferredRegister.create(BuiltInRegistries.FLUID, MekanismNutritionMod.MODID);

    public static void register(IEventBus modBus) {
        fluidTypeRegistery.register(modBus);
        fluidRegistery.register(modBus);
    }

    public static final DeferredHolder<FluidType, FluidType> LIQUID_MACRO_NUTRIENTS_TYPE = fluidTypeRegistery.register(
            "liquid_macro_nutrients",
            () -> new FluidType(FluidType.Properties.create()
            )
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> LIQUID_MACRO_NUTRIENTS_SOURCE = fluidRegistery.register(
            "liquid_macro_nutrients",
            () -> new BaseFlowingFluid.Source(ModFluids.LIQUID_MACRO_NUTRIENTS_PROPERTIES)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> LIQUID_MACRO_NUTRIENTS_FLOWING = fluidRegistery.register(
            "flowing_liquid_macro_nutrients",
            () -> new BaseFlowingFluid.Flowing(ModFluids.LIQUID_MACRO_NUTRIENTS_PROPERTIES)
    );

    public static final BaseFlowingFluid.Properties LIQUID_MACRO_NUTRIENTS_PROPERTIES =
            new BaseFlowingFluid.Properties(
                    LIQUID_MACRO_NUTRIENTS_TYPE,
                    LIQUID_MACRO_NUTRIENTS_SOURCE,
                    LIQUID_MACRO_NUTRIENTS_FLOWING
            );

    public static final DeferredHolder<FluidType, FluidType> LIQUID_MICRO_NUTRIENTS_TYPE = fluidTypeRegistery.register(
            "liquid_micro_nutrients",
            () -> new FluidType(FluidType.Properties.create()
            )
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> LIQUID_MICRO_NUTRIENTS_SOURCE = fluidRegistery.register(
            "liquid_micro_nutrients",
            () -> new BaseFlowingFluid.Source(ModFluids.LIQUID_MICRO_NUTRIENTS_PROPERTIES)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> LIQUID_MICRO_NUTRIENTS_FLOWING = fluidRegistery.register(
            "flowing_liquid_micro_nutrients",
            () -> new BaseFlowingFluid.Flowing(ModFluids.LIQUID_MICRO_NUTRIENTS_PROPERTIES)
    );

    public static final BaseFlowingFluid.Properties LIQUID_MICRO_NUTRIENTS_PROPERTIES =
            new BaseFlowingFluid.Properties(
                    LIQUID_MICRO_NUTRIENTS_TYPE,
                    LIQUID_MICRO_NUTRIENTS_SOURCE,
                    LIQUID_MICRO_NUTRIENTS_FLOWING
            );

}
