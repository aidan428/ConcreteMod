package com.spaldinglimitations.concrete;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockUnbreakConcrete extends Block {

	protected BlockUnbreakConcrete(Material material) {
		super(material);
		this.setResistance(1500.0F);
		this.setBlockUnbreakable();
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);

	}


}
