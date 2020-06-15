package tfar.survivalcommandblock.mixin;

import net.minecraft.block.CommandBlock;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommandBlock.class)
public class CommandBlockMixin {
	@Redirect(at = @At(value = "INVOKE",target = "net/minecraft/entity/player/PlayerEntity.isCreativeLevelTwoOp()Z"), method = "onUse")
	private boolean init(PlayerEntity playerEntity) {
		return true;
	}
}
