package consular.classes.registry;

import consular.classes.Classes;
import consular.classes.Materials.ArmorMaterialWood;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    //setting variables to make shit WAY easier.
    private static final String MODID = Classes.MODID;

    public static final ArmorMaterial WOOD_ARMOR = new ArmorMaterialWood();
    
    public static final Item WOODEN_HELMET = new ArmorItem(WOOD_ARMOR, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item WOODEN_CHESTPLATE = new ArmorItem(WOOD_ARMOR, EquipmentSlot.CHEST, new Item.Settings());
    public static final Item WOODEN_LEGGINGS = new ArmorItem(WOOD_ARMOR, EquipmentSlot.LEGS, new Item.Settings());
    public static final Item WOODEN_BOOTS = new ArmorItem(WOOD_ARMOR, EquipmentSlot.FEET, new Item.Settings());

    //registers every item.
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(MODID,"wooden_helmet"), WOODEN_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MODID,"wooden_chestplate"), WOODEN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MODID,"wooden_leggings"), WOODEN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MODID,"wooden_boots"), WOODEN_BOOTS);
    }
}
