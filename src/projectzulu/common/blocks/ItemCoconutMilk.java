package projectzulu.common.blocks;

import net.minecraft.item.Item;
import projectzulu.common.ProjectZulu_Blocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCoconutMilk extends Item{
	
	public ItemCoconutMilk(int par1,int par2, boolean par3bool){
		super(par1);
		maxStackSize = 12;
		setMaxDamage(5);
        this.setCreativeTab(ProjectZulu_Blocks.projectZuluCreativeTab);
		bFull3D = par3bool;
		this.setIconIndex(par2);
	}
	
    public int getMetadata(int par1)
    {
        return par1;
    }

	
	@SideOnly(Side.CLIENT)
	public String getTextureFile()
    {
            return "/mods/items_projectzulu.png";
    }
	
}
