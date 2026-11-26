package net.yumebani.mekanismnutrition;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;

public class ColoredWaterFluidExtensions implements IClientFluidTypeExtensions {
    private static final ResourceLocation WATER_STILL =
            ResourceLocation.withDefaultNamespace("block/water_still");
    private static final ResourceLocation WATER_FLOWING =
            ResourceLocation.withDefaultNamespace("block/water_flow");
    private static final ResourceLocation WATER_OVERLAY =
            ResourceLocation.withDefaultNamespace("block/water_overlay");

    private final int tintColor;

    public ColoredWaterFluidExtensions(int tintColor) {
        this.tintColor = tintColor;
    }

    @Override
    public ResourceLocation getStillTexture() {
        return WATER_STILL;
    }

    @Override
    public ResourceLocation getFlowingTexture() {
        return WATER_FLOWING;
    }

    @Override
    public ResourceLocation getOverlayTexture() {
        return WATER_OVERLAY;
    }

    @Override
    public int getTintColor() {
        return tintColor;
    }
}
