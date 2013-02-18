package projectzulu.common.dungeon;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.Point;

import projectzulu.common.core.DefaultProps;

public class GUINBTList extends GuiScrollingList{
	NBTTree nodeTree;
	ArrayList<NBTNode> nodeList;

	CreatureFields parent;
    int selectedElement = -1;
    
    Point screenSize;
    Point backgroundSize;

	public GUINBTList(CreatureFields parent, Minecraft mc, NBTTree nodeTree, int listWidth, Point screenSize, Point backgroundSize){
    	super(mc,
    			listWidth, backgroundSize.getY()+50, // Width, Height
    			(screenSize.getY()-backgroundSize.getY())/2+100-14, (screenSize.getY()-backgroundSize.getY())/2+backgroundSize.getY()-60-12, // Top, Bottom, 
    			(screenSize.getX()-backgroundSize.getX())/2+77, // Left
    			mc.fontRenderer.FONT_HEIGHT+8); // Element Height
    	this.parent = parent;
    	this.nodeTree = nodeTree;
    	this.nodeList = nodeTree.toArrayList();
    	this.screenSize = screenSize;
    	this.backgroundSize = backgroundSize;
    }
	
	public void recreateNodeList(){
		this.nodeList = nodeTree.toArrayList();
		selectedElement = -1;
	}
		
	@Override
	protected int getSize(){
		return nodeList.size();
	}
	
    @Override
    protected void elementClicked(int clickedIndex, boolean var2){
    	if(nodeList.get(clickedIndex).getChildren().size() == 0){
        	parent.setSelectedCurentNode(nodeList.get(clickedIndex));
        	selectedElement = clickedIndex;
    	}
    }
    
    @Override
    protected boolean isSelected(int selectedIndex){
    	return selectedIndex == selectedElement;
    }
    
    @Override
    protected void drawBackground(){
//        int textureID = parent.mc.renderEngine.getTexture(DefaultProps.dungeonDiretory+"creaturelistgui.png");
//        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//        parent.mc.renderEngine.bindTexture(textureID);
//        int xCoord = (screenSize.getX() - backgroundSize.getX()) / 2+260; //277
//        int yCoord = (screenSize.getY() - backgroundSize.getY()) / 2;
//        parent.drawTexturedModalRect(xCoord, yCoord, 0, 0, 77, 244);
    }
    
    @Override
    protected int getContentHeight(){
        return (this.getSize()) * slotHeight; // + 35*2 + 1;
    }
    
    @Override
    protected void drawSlot(int listIndex, int var2, int var3, int var4, Tessellator tessellator) {
    	
    	int numParents = nodeList.get(listIndex).countParents();
    	String filler = "";
		for (int i = 0; i < numParents; i++) {
			filler = filler.concat("   ");
		}
    	String renderString = filler + nodeList.get(listIndex).getData().getName();
    	
    	String renderResult = "";
    	int countChildren = nodeList.get(listIndex).getChildren().size();
    	if(countChildren == 0){
    		renderResult = NBTHelper.getByID(nodeList.get(listIndex).getData().getId()).getValue(nodeList.get(listIndex).getData());
    	}
    	
    	//(160 << 16) + (145 << 8) + 114)
    	parent.mc.fontRenderer.drawStringWithShadow(renderString, this.left + 3 , var3 + 2, 16777215); //Red: 0xFF2222 //Blck: 4210752
    	parent.mc.fontRenderer.drawStringWithShadow(renderResult.length() > 4 ? renderResult.substring(0, 3) : renderResult, this.left + 140 , var3 + 2, 16777215); //Red: 0xFF2222 //Blck: 4210752
    }
    
    public void drawScreen(Point screenSize, Point backgroundSize, int mouseX, int mouseY, float p_22243_3_){
    	super.drawScreen(mouseX, mouseY, p_22243_3_);

    	GL11.glEnable(GL11.GL_TEXTURE_2D);
    	GL11.glDisable(GL11.GL_DEPTH_TEST);
    	drawScrollOverlay(this.left, (screenSize.getY()-backgroundSize.getY())/2+4, this.top, 255, 255); // Top Overlay
    	drawScrollOverlay(this.left, this.bottom, (screenSize.getY()-backgroundSize.getY())/2+backgroundSize.getY()-4, 255, 255); // Bot Overlay
//    	GL11.glEnable(GL11.GL_DEPTH_TEST);
//    	GL11.glDisable(GL11.GL_TEXTURE_2D);
    }
    
    private void drawScrollOverlay(int leftOffset, int topHeight, int botHeight, int alphaBottom, int alphaTop){
    	Tessellator var5 = Tessellator.instance;
    	GL11.glBindTexture(GL11.GL_TEXTURE_2D, parent.mc.renderEngine.getTexture(getBackgroundTexture()));
    	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    	float imageSize = 32.0F;
    	var5.startDrawingQuads();
//    	var5.setColorRGBA_I(4210752, alphaTop);
    	var5.addVertexWithUV(
    			leftOffset, (double)botHeight, 0.0D,
    			0.0D, (double)((float)botHeight / imageSize));
    	var5.addVertexWithUV(
    			leftOffset+(double)this.listWidth, (double)botHeight, 0.0D,
    			(double)((float)(this.listWidth) / imageSize), (double)((float)botHeight / imageSize));
//    	var5.setColorRGBA_I(4210752, alphaBottom);
    	var5.addVertexWithUV(
    			leftOffset+(double)this.listWidth, (double)topHeight, 0.0D,
    			(double)((float)(this.listWidth) / imageSize), (double)((float)topHeight / imageSize));
    	var5.addVertexWithUV(
    			leftOffset, (double)topHeight, 0.0D,
    			0.0D, (double)((float)topHeight / imageSize));
    	var5.draw();
    }
    
}
