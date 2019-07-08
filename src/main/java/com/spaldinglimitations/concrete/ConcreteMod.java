//COPYRIGHT AIDAN SPALDING© OPEN GPL LICENCES APPLICIBLE
package com.spaldinglimitations.concrete;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


@Mod(modid = "cm", name = "Concrete Mod", version = "1.1")
public class ConcreteMod {
	
	public static Block blockConcrete;
	public static Block blockCompactConcrete;
	public static Block blockReinforcedConcrete;
	public static Block blockUnbreakConcrete;
	public static Block blockPegasusTile;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item,Block Init and registering
		//config handling
		
		blockConcrete = new BlockConcrete(Material.rock).setBlockName("BlockConcrete").setBlockTextureName("cm:blockconcrete").setCreativeTab(tabConcreteMod);
		blockCompactConcrete = new BlockCompactConcrete(Material.rock).setBlockName("BlockCompactConcrete").setBlockTextureName("cm:blockcompactconcrete").setCreativeTab(tabConcreteMod);
		blockReinforcedConcrete = new BlockReinforcedConcrete(Material.rock).setBlockName("BlockReinforcedConcrete").setBlockTextureName("cm:blockreinforcedconcrete").setCreativeTab(tabConcreteMod);
		blockUnbreakConcrete = new BlockUnbreakConcrete(Material.rock).setBlockName("BlockUnbreakConcrete").setBlockTextureName("cm:blockunbreakconcrete").setCreativeTab(tabConcreteMod);
		blockPegasusTile = new BlockPegasusTile(Material.rock).setBlockName("BlockPegasusTile").setBlockTextureName("cm:blockpegasustile").setCreativeTab(tabConcreteMod);
		
		GameRegistry.registerBlock(blockConcrete, blockConcrete.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCompactConcrete, blockCompactConcrete.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockReinforcedConcrete, blockReinforcedConcrete.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockUnbreakConcrete, blockUnbreakConcrete.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPegasusTile, blockPegasusTile.getUnlocalizedName().substring(5));
		
		System.out.println(blockConcrete.getUnlocalizedName().substring(5));
		System.out.println(blockCompactConcrete.getUnlocalizedName().substring(5));
		System.out.println(blockReinforcedConcrete.getUnlocalizedName().substring(5));
		System.out.println(blockUnbreakConcrete.getUnlocalizedName().substring(5));
		System.out.println(blockPegasusTile.getUnlocalizedName().substring(5));
		
	
		
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, tileenity, enity, gui and packet registering
		GameRegistry.addRecipe(new ItemStack(blockConcrete), new Object[] {"SCS","CSC","SCS", 'C', Blocks.cobblestone, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blockCompactConcrete), new Object[] {"SHS","HSH", "SHS", 'S', Items.stick, 'H', blockConcrete});
		GameRegistry.addRecipe(new ItemStack(blockReinforcedConcrete), new Object[] {"SVS","VSV", "VSV", 'S', Items.stick, 'V', blockCompactConcrete});
		

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {	
		
	}
	
	public static CreativeTabs tabConcreteMod = new CreativeTabs("tabConcreteMod") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(blockConcrete).getItem();
		}
	};
}



