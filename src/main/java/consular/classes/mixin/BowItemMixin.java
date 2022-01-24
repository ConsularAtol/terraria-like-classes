package consular.classes.mixin;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BowItem;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

@Mixin(BowItem.class)
public class BowItemMixin extends Item {

    public BowItemMixin(Settings settings) {
        super(settings);
        
    }
    
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> list, TooltipContext tooltipContext) {
        list.add(new TranslatableText("classes.class.ranged").formatted(Formatting.LIGHT_PURPLE));
    }

}
