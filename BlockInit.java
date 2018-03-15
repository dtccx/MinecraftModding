package harry.mod.init;

import java.util.ArrayList;
import java.util.List;

import harry.mod.objects.blocks.BlockBase;
import harry.mod.objects.blocks.BlockDirts;
import harry.mod.objects.blocks.BlockLeaf;
import harry.mod.objects.blocks.BlockLogs;
import harry.mod.objects.blocks.BlockOres;
import harry.mod.objects.blocks.BlockPlank;
import harry.mod.objects.blocks.BlockRicePlant;
import harry.mod.objects.blocks.BlockSantaHat;
import harry.mod.objects.blocks.BlockSaplings;
import harry.mod.objects.blocks.machines.sinterer.BlockSinteringFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");	
	public static final Block DIRT = new BlockDirts("dirt");
	
	public static final Block SANTA_HAT = new BlockSantaHat("santa_hat");
	
	public static final Block SINTERING_FURNACE = new BlockSinteringFurnace("sintering_furnace");

	public static final Block RICE_PLANT = new BlockRicePlant("rice_plant");
}
