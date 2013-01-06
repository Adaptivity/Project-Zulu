// Date: 21/08/2012 16:58:44 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package projectzulu.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelLizard extends ModelBase
{
	//fields

	ModelRenderer leg1;
	ModelRenderer leg1u;
	ModelRenderer leg2;
	ModelRenderer leg2u;

	ModelRenderer TAILROT;
	ModelRenderer Tail3;
	ModelRenderer Tail2;
	ModelRenderer Tail1;

	ModelRenderer FRONTROT;
	ModelRenderer HEADBASE;
	ModelRenderer Frill1;
	ModelRenderer Frill2;
	ModelRenderer Frill3;
	ModelRenderer Frill4;
	ModelRenderer head;
	ModelRenderer leg3u;
	ModelRenderer leg3;
	ModelRenderer body;
	ModelRenderer leg4;
	ModelRenderer leg4u;

	public ModelLizard()
	{
		textureWidth = 64;
		textureHeight = 32;
		setTextureOffset("TAILROT.dltfold1", 0, 0);
		setTextureOffset("FRONTROT.dltfold3", 0, 0);

		leg1 = new ModelRenderer(this, 20, 22);
		leg1.addBox(-3F, 0F, -1F, 2, 6, 2);
		leg1.setRotationPoint(-4F, 18F, 6F);
		leg1.setTextureSize(64, 32);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, 0F);
		leg1u = new ModelRenderer(this, 14, 22);
		leg1u.addBox(-1F, 0F, -1F, 1, 2, 2);
		leg1u.setRotationPoint(-4F, 18F, 6F);
		leg1u.setTextureSize(64, 32);
		leg1u.mirror = true;
		setRotation(leg1u, 0F, 0F, 0F);
		leg2 = new ModelRenderer(this, 20, 22);
		leg2.addBox(1F, 0F, -1F, 2, 6, 2);
		leg2.setRotationPoint(4F, 18F, 6F);
		leg2.setTextureSize(64, 32);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0F);
		leg2u = new ModelRenderer(this, 14, 22);
		leg2u.addBox(0F, 0F, -1F, 1, 2, 2);
		leg2u.setRotationPoint(4F, 18F, 6F);
		leg2u.setTextureSize(64, 32);
		leg2u.mirror = true;
		setRotation(leg2u, 0F, 0F, 0F);
		TAILROT = new ModelRenderer(this, "TAILROT");
		TAILROT.setRotationPoint(0F, 20F, 9F);
		setRotation(TAILROT, 0F, 0F, 0F);
		TAILROT.mirror = true;
		Tail3 = new ModelRenderer(this, 0, 17);
		Tail3.addBox(-1F, 0F, 0F, 2, 1, 5);
		TAILROT.addChild(Tail3);
		Tail3.setRotationPoint(0F, -1F, 10F);
		Tail3.setTextureSize(64, 32);
		Tail3.mirror = true;
		setRotation(Tail3, 0F, 0F, 0F);
		Tail2 = new ModelRenderer(this, 0, 17);
		Tail2.addBox(-1F, 0F, 0F, 2, 1, 5);
		TAILROT.addChild(Tail2);
		Tail2.setRotationPoint(0F, -1F, 5F);
		Tail2.setTextureSize(64, 32);
		Tail2.mirror = true;
		setRotation(Tail2, 0F, 0F, 0F);
		Tail1 = new ModelRenderer(this, 0, 17);
		Tail1.addBox(-1F, 0F, 0F, 2, 1, 5);
		TAILROT.addChild(Tail1);
		Tail1.setRotationPoint(0F, -1F, 0F);
		Tail1.setTextureSize(64, 32);
		Tail1.mirror = true;
		setRotation(Tail1, 0F, 0F, 0F);
		FRONTROT = new ModelRenderer(this, "FRONTROT");
		FRONTROT.setRotationPoint(0F, 19F, 6F);
		setRotation(FRONTROT, 0F, 0F, 0F);
		FRONTROT.mirror = true;
		HEADBASE = new ModelRenderer(this, "HEADBASE");
		FRONTROT.addChild(HEADBASE);
		HEADBASE.setRotationPoint(0F, 0F, -13F);
		setRotation(HEADBASE, 0F, 0F, 0F);
		HEADBASE.mirror = true;
		Frill2 = new ModelRenderer(this, 29, 22);
		Frill2.addBox(-3F, -3F, 0F, 3, 5, 1);
		HEADBASE.addChild(Frill2);
		Frill2.setRotationPoint(-3F, 1F, -3F);
		Frill2.setTextureSize(64, 32);
		Frill2.mirror = true;
		setRotation(Frill2, 0F, 0.0371786F, 0F);
		Frill4 = new ModelRenderer(this, 37, 22);
		Frill4.addBox(-4F, -2F, 0F, 4, 4, 1);
		HEADBASE.addChild(Frill4);
		Frill4.setRotationPoint(-1F, -2F, -3F);
		Frill4.setTextureSize(64, 32);
		Frill4.mirror = true;
		setRotation(Frill4, 0F, 0F, 0F);
		Frill1 = new ModelRenderer(this, 29, 22);
		Frill1.addBox(0F, -3F, 0F, 3, 5, 1);
		HEADBASE.addChild(Frill1);
		Frill1.setRotationPoint(3F, 1F, -3F);
		Frill1.setTextureSize(64, 32);
		Frill1.mirror = true;
		setRotation(Frill1, 0F, 0.0371786F, 0F);

		Frill3 = new ModelRenderer(this, 37, 22);
		Frill3.addBox(0F, -2F, 0F, 4, 4, 1);
		HEADBASE.addChild(Frill3);
		Frill3.setRotationPoint(1F, -2F, -3F);
		Frill3.setTextureSize(64, 32);
		Frill3.mirror = true;
		setRotation(Frill3, 0F, 0F, 0F);
		Frill3.mirror = false;
		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -4F, -9F, 6, 6, 8);
		HEADBASE.addChild(head);
		head.setRotationPoint(1F, 1F, 1F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		//dltfold3.addChildModelRenderer(HEADBASE);
		leg3u = new ModelRenderer(this, 14, 22);
		leg3u.addBox(-1F, 0F, -1F, 1, 2, 2);
		FRONTROT.addChild(leg3u);
		leg3u.setRotationPoint(-4F, -1F, -12F);
		leg3u.setTextureSize(64, 32);
		leg3u.mirror = true;
		setRotation(leg3u, 0F, 0F, 0F);
		body = new ModelRenderer(this, 10, 0);
		body.addBox(-4F, -2F, -9F, 8, 4, 18);
		FRONTROT.addChild(body);
		body.setRotationPoint(0F, 0F, -6F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		leg4u = new ModelRenderer(this, 14, 22);
		leg4u.addBox(0F, 0F, -1F, 1, 2, 2);
		FRONTROT.addChild(leg4u);
		leg4u.setRotationPoint(4F, -1F, -12F);
		leg4u.setTextureSize(64, 32);
		leg4u.mirror = true;
		setRotation(leg4u, 0F, 0F, 0F);
		leg4 = new ModelRenderer(this, 20, 22);
		leg4.addBox(1F, 0F, -1F, 2, 6, 2);
		FRONTROT.addChild(leg4);
		leg4.setRotationPoint(4F, -1F, -12F);
		leg4.setTextureSize(64, 32);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, 0F);
		leg3 = new ModelRenderer(this, 20, 22);
		leg3.addBox(-3F, 0F, -1F, 2, 6, 2);
		FRONTROT.addChild(leg3);
		leg3.setRotationPoint(-4F, -1F, -12F);
		leg3.setTextureSize(64, 32);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0F);
	}


	@Override
	public void setLivingAnimations(EntityLiving par1EntityLiving, float par2, float par3, float par4) {

		EntityLizard var5 = (EntityLizard)par1EntityLiving;

		super.setLivingAnimations(par1EntityLiving, par2, par3, par4);

		if(var5.prepareToSpit == true){

			Frill1.rotateAngleY = (float)( MathHelper.cos(4*par2*0.6662F) * 1.0F * par3);

			Frill2.rotateAngleY = (float)( MathHelper.cos(4*par2*0.6662F - (float)Math.PI) * 1.0F * par3);

			Frill3.rotateAngleZ = (float)(  -45*Math.PI/180  );
			Frill3.rotateAngleY = (float)( MathHelper.cos(4*par2*0.6662F 				 ) * 0.5F * par3);
			Frill3.rotateAngleX = (float)( MathHelper.cos(4*par2*0.6662F 				 ) * 0.5F * par3);

			Frill4.rotateAngleZ = (float)(  45*Math.PI/180  );
			Frill4.rotateAngleY = (float)( MathHelper.cos(4*par2*0.6662F - (float)Math.PI) * 0.5F * par3);
			Frill4.rotateAngleX = (float)( MathHelper.cos(4*par2*0.6662F - (float)Math.PI) * 0.5F * par3);


		}else {
			Frill1.rotateAngleZ = (float)(  -90*Math.PI/180  ); //This is on Right
			Frill2.rotateAngleZ = (float)(  90*Math.PI/180  ); //This is on Left

			Frill3.rotateAngleY = (float)(  -90*Math.PI/180  );
			Frill4.rotateAngleY = (float)(  90*Math.PI/180  );
		}

		leg1.rotateAngleY = (float)( MathHelper.cos(4*par2*0.6662F + (float)Math.PI) * 1.4F * par3);
		leg2.rotateAngleY = (float)( MathHelper.cos(4*par2*0.6662F			   	 ) * 1.4F * par3);
		leg3.rotateAngleY = (float)( MathHelper.cos(4*par2*0.6662F + (float)Math.PI) * 1.4F * par3);
		leg4.rotateAngleY = (float)( MathHelper.cos(4*par2*0.6662F				 ) * 1.4F * par3);



	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		//super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);	  

		float field_78145_g = 8.0F;
		float field_78151_h = 4.0F;

		if (this.isChild){
			float var8 = 2.0F;
			GL11.glPushMatrix();
			GL11.glTranslatef(0.0F, field_78145_g * f5, field_78151_h * f5);
			FRONTROT.render(f5);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
			GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
			leg1.render(f5);
			leg1u.render(f5);
			leg2.render(f5);
			leg2u.render(f5);
			TAILROT.render(f5);
			GL11.glPopMatrix();
		}else{
			leg1.render(f5);
			leg1u.render(f5);
			leg2.render(f5);
			leg2u.render(f5);
			TAILROT.render(f5);
			FRONTROT.render(f5);
		}

	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity){
		super.setRotationAngles(f, f1, f2, f3, f4, f5,par7Entity);
	}

}
