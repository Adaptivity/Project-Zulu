package projectzulu.common.mobs.renders;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.resources.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class RenderSnow extends RenderGenericLiving {
    public final ResourceLocation snowTexture;

    public RenderSnow(ModelBase modelBase, float shadowSize, ResourceLocation livingLocation,
            ResourceLocation snowTexture) {
        super(modelBase, shadowSize, livingLocation);
        this.snowTexture = snowTexture;
    }

    @Override
    protected ResourceLocation func_110775_a(Entity entity) {
        if (BiomeDictionary.isBiomeOfType(entity.worldObj.getBiomeGenForCoords((int) entity.posX, (int) entity.posZ),
                Type.FROZEN)) {
            return snowTexture;
        } else {
            return livingTexture;
        }
    }
}