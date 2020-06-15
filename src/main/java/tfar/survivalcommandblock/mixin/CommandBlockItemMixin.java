package tfar.survivalcommandblock.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.CommandBlockItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CommandBlockItem.class)
public class CommandBlockItemMixin {
	@Redirect(at = @At(value = "INVOKE",target = "net/minecraft/entity/player/PlayerEntity.isCreativeLevelTwoOp()Z"), method = "getPlacementState")
	private boolean init(PlayerEntity playerEntity) {
		return true;
	}
}
