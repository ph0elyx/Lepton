package eltrut.lepton.init;

import java.util.function.Supplier;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import eltrut.lepton.Lepton;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class ItemInit {
	public static final RegistryHelper HELPER = Lepton.REGISTRY_HELPER;
	
	public static final RegistryObject<Item> SILVER_INGOT = HELPER.createItem("silver_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> ELECTRUM_INGOT = HELPER.createItem("electrum_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> STEEL_INGOT = HELPER.createItem("steel_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> STEEL_SWORD = HELPER.createItem("steel_sword", () -> new SwordItem(ModItemTier.STEEL, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> STEEL_SHOVEL = HELPER.createItem("steel_shovel", () -> new ShovelItem(ModItemTier.STEEL, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> STEEL_PICKAXE = HELPER.createItem("steel_pickaxe", () -> new PickaxeItem(ModItemTier.STEEL, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> STEEL_AXE = HELPER.createItem("steel_axe", () -> new AxeItem(ModItemTier.STEEL, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> STEEL_HOE = HELPER.createItem("steel_hoe", () -> new HoeItem(ModItemTier.STEEL, -3, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> ELECTRUM_SWORD = HELPER.createItem("electrum_sword", () -> new SwordItem(ModItemTier.ELECTRUM, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> ELECTRUM_SHOVEL = HELPER.createItem("electrum_shovel", () -> new ShovelItem(ModItemTier.ELECTRUM, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> ELECTRUM_PICKAXE = HELPER.createItem("electrum_pickaxe", () -> new PickaxeItem(ModItemTier.ELECTRUM, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> ELECTRUM_AXE = HELPER.createItem("electrum_axe", () -> new AxeItem(ModItemTier.ELECTRUM, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> ELECTRUM_HOE = HELPER.createItem("electrum_hoe", () -> new HoeItem(ModItemTier.ELECTRUM, -3, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	
	public enum ModItemTier implements IItemTier {
		STEEL(2, 2501, 6.0F, 2.0F, 14, () -> {
			return Ingredient.fromItems(ItemInit.STEEL_INGOT.get());
		}),
		ELECTRUM(2, 1091, 12.0F, 2.5F, 22, () -> {
			return Ingredient.fromItems(ItemInit.ELECTRUM_INGOT.get());
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
}
