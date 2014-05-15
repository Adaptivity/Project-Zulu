package projectzulu.common;

import projectzulu.common.core.CustomEntityManager;
import projectzulu.common.mobs.BossHealthDisplayTicker;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxyProjectZulu extends CommonProxyProjectZulu{
	
	@Override
	public void bossHealthTicker(){
	    FMLCommonHandler.instance().bus().register(new BossHealthDisplayTicker());
	}
	
	@Override
	public void registerModelsAndRender() {
		CustomEntityManager.INSTANCE.registerModelsAndRender();
	}
}
