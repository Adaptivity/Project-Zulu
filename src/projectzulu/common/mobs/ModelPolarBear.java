package projectzulu.common.mobs;

import net.minecraft.entity.Entity;

public class ModelPolarBear extends ModelBear{

	public ModelPolarBear(){
		super(12);
	}


	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, 2*f5);
		//	    setRotationAngles(f, f1, f2, f3, f4, f5);
		//	    HEADROT.render(f5);
		//	    BODYROT.render(f5);
	}

}
