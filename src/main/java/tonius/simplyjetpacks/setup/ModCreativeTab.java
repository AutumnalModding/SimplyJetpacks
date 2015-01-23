package tonius.simplyjetpacks.setup;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModCreativeTab extends CreativeTabs {
    
    public static final ModCreativeTab tab = new ModCreativeTab();
    
    private ModCreativeTab() {
        super("tabSimplyJetpacks");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return ModItems.components;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() {
        return ModItems.jetpackIcon;
    }
    
}
