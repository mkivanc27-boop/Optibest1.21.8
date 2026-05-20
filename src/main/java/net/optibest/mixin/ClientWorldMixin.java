package net.optibest.mixin;

import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientWorld.class)
public class ClientWorldMixin {
    @Inject(method = "tickEntity", at = @At("HEAD"), cancellable = true)
    private void stopEntityTicks(CallbackInfo ci) {
        // Sadece oyuncuların hareketini hesapla, gerisini salla
        ci.cancel(); 
    }
}
