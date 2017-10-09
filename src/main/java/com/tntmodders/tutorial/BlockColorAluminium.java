package com.tntmodders.tutorial;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockColorAluminium extends BlockColored {
    public BlockColorAluminium() {
        super(Material.IRON);
        this.setRegistryName("aluminiummod", "color_aluminium_block");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setUnlocalizedName("color_aluminium_block");
    }
}
