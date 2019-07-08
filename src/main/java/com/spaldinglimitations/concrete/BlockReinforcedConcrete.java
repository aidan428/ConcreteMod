package com.spaldinglimitations.concrete;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockReinforcedConcrete extends Block {

	protected BlockReinforcedConcrete(Material material) {
		super(material);
		this.setResistance(1500.0F);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);

	}


}
