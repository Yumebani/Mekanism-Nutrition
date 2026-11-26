package net.yumebani.mekanismnutrition;

import mekanism.api.MekanismAPI;
import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalBuilder;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModChemicals {
    public static final DeferredRegister<Chemical> chemicalRegistery =
            DeferredRegister.create(MekanismAPI.CHEMICAL_REGISTRY_NAME, MekanismNutritionMod.MODID);

    public static void register(IEventBus modBus) {
        chemicalRegistery.register(modBus);
    }

    public static final DeferredHolder<Chemical, Chemical> MACRO_NUTRIENTS = chemicalRegistery.register(
            "macro_nutrients",
            () -> new Chemical(ChemicalBuilder.builder()
                    .tint(0xFFBD85)
            )
    );

    public static final DeferredHolder<Chemical, Chemical> MICRO_NUTRIENTS = chemicalRegistery.register(
            "micro_nutrients",
            () -> new Chemical(ChemicalBuilder.builder()
                    .tint(0xFFF785)
            )
    );
}
