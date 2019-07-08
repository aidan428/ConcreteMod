package com.spaldinglimitations.concrete;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCompactConcrete extends Block {

	protected BlockCompactConcrete(Material material) {
		super(material);
		this.setResistance(1000.0F);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);



	}

}
