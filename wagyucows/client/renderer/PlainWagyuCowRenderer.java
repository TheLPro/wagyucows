
package net.mcreator.wagyucows.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.wagyucows.entity.PlainWagyuCowEntity;

public class PlainWagyuCowRenderer extends MobRenderer<PlainWagyuCowEntity, CowModel<PlainWagyuCowEntity>> {
	public PlainWagyuCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlainWagyuCowEntity entity) {
		return new ResourceLocation("wagyucows:textures/cow.png");
	}
}
