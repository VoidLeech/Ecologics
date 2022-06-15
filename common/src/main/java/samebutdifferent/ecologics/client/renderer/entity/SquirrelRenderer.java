package samebutdifferent.ecologics.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.resources.ResourceLocation;
import samebutdifferent.ecologics.client.model.SquirrelModel;
import samebutdifferent.ecologics.entity.Squirrel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@Environment(EnvType.CLIENT)
public class SquirrelRenderer extends GeoEntityRenderer<Squirrel> {

    public SquirrelRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SquirrelModel());
        this.shadowRadius = 0.4F;
    }

    @Override
    public ResourceLocation getTextureLocation(Squirrel entity) {
        return getTextureResource(entity);
    }

    @Override
    public void render(Squirrel entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn, int packedLightIn) {
        if (entity.isBaby()) {
            stack.scale(0.6F, 0.6F, 0.6F);
        }
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }
}