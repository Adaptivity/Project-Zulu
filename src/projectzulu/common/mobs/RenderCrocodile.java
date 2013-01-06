package projectzulu.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderCrocodile extends RenderLiving
{
	//private EntityCrocodile holdEnt;
    private ModelCrocodile holdModel;
	
    public RenderCrocodile(ModelBase modelBase, float par1)
    {
        super(modelBase, par1);
        holdModel = (ModelCrocodile)modelBase;
    }

    public void renderCrocodile(EntityCrocodile par1EntityCrocodile, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityCrocodile, par2, par4, par6, par8, par9);
    }
//////////////
    
//    protected void func_77048_a(EntityCrocodile par1EntityCrocodile, float par2, float par3, float par4)
//    {
//        super.rotateCorpse(par1EntityCrocodile, par2, par3, par4);
//
//        if ((double)par1EntityCrocodile.field_70721_aZ >= 0.01D)
//        {
//            float var5 = 13.0F;
//            float var6 = par1EntityCrocodile.field_70754_ba - par1EntityCrocodile.field_70721_aZ * (1.0F - par4) + 6.0F;
//            float var7 = (Math.abs(var6 % var5 - var5 * 0.5F) - var5 * 0.25F) / (var5 * 0.25F);
//            GL11.glRotatef(6.5F * var7, 0.0F, 0.0F, 1.0F);
//        }
//    }
//
//    protected void func_77047_a(EntityCrocodile par1EntityCrocodile, float par2)
//    {
//        super.renderEquippedItems(par1EntityCrocodile, par2);
//    }
//
//    protected void renderEquippedItems(EntityLiving par1EntityLiving, float par2)
//    {
//        this.func_77047_a((EntityCrocodile)par1EntityLiving, par2);
//    }
//
//    protected void rotateCorpse(EntityLiving par1EntityLiving, float par2, float par3, float par4)
//    {
//        this.func_77048_a((EntityCrocodile)par1EntityLiving, par2, par3, par4);
//    }

    
    
////////////////////
    
    
    
    
    
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderCrocodile((EntityCrocodile)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderCrocodile((EntityCrocodile)par1Entity, par2, par4, par6, par8, par9);
    }
}


