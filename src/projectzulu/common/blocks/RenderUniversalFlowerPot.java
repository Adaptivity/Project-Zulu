package projectzulu.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderUniversalFlowerPot implements ISimpleBlockRenderingHandler{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		return render(world, x, y, z, block, modelId, renderer);
	}
	
	public boolean render(IBlockAccess blockAccess, int par2, int par3, int par4, Block par1Block, int modelId, RenderBlocks renderer){
		
		renderer.renderStandardBlock(par1Block, par2, par3, par4);
        Tessellator var5 = Tessellator.instance;
        var5.setBrightness(par1Block.getMixedBrightnessForBlock(blockAccess, par2, par3, par4));
        float var6 = 1.0F;
        int var7 = par1Block.colorMultiplier(blockAccess, par2, par3, par4);
        int var8 = par1Block.getBlockTextureFromSide(0);
        float var9 = (float)(var7 >> 16 & 255) / 255.0F;
        float var10 = (float)(var7 >> 8 & 255) / 255.0F;
        float var11 = (float)(var7 & 255) / 255.0F;
        float var12;
        float var14;

        if (EntityRenderer.anaglyphEnable)
        {
            var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
            float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
            var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
            var9 = var12;
            var10 = var13;
            var11 = var14;
        }

        var5.setColorOpaque_F(var6 * var9, var6 * var10, var6 * var11);
        var12 = 0.1865F;
        renderer.renderSouthFace(par1Block, (double)((float)par2 - 0.5F + var12), (double)par3, (double)par4, var8);
        renderer.renderNorthFace(par1Block, (double)((float)par2 + 0.5F - var12), (double)par3, (double)par4, var8);
        renderer.renderWestFace(par1Block, (double)par2, (double)par3, (double)((float)par4 - 0.5F + var12), var8);
        renderer.renderEastFace(par1Block, (double)par2, (double)par3, (double)((float)par4 + 0.5F - var12), var8);
        renderer.renderTopFace(par1Block, (double)par2, (double)((float)par3 - 0.5F + var12 + 0.1875F), (double)par4, Block.dirt.blockIndexInTexture);
        int var19 = blockAccess.getBlockMetadata(par2, par3, par4);
		
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory() { return false; }

	@Override
	public int getRenderId() { return 0; }

}
