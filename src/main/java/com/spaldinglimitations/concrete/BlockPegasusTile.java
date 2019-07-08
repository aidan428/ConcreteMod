package com.spaldinglimitations.concrete;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockPegasusTile extends Block {
	
	public IIcon[] textures = new IIcon[6];

	protected BlockPegasusTile(Material material) {
		super(material);
		this.setResistance(1500.0F);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);

	}

	public void registerBlockIcons ( IIconRegister reg) {
		
		for (int count = 0; count < 6; count++) {
			
			this.textures[count] = reg.registerIcon(this.textureName+"_"+count);
			
		}
		
	}
	
	public IIcon getIcon(int side, int meta) {
		return this.textures[side];
		
	}
	
}

