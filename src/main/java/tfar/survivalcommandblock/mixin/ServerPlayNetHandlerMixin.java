package tfar.survivalcommandblock.mixin;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ServerPlayNetworkHandler.class)
public class ServerPlayNetHandlerMixin {
	@Redirect(method = "onUpdateCommandBlock",at = @At(value = "INVOKE",target = "Lnet/minecraft/server/network/ServerPlayerEntity;isCreativeLevelTwoOp()Z"))
	public boolean yes(ServerPlayerEntity serverPlayerEntity) {
		return true;
	}
}
