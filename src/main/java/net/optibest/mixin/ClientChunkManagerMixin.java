package net.optibest.mixin;

import net.minecraft.client.world.ClientChunkManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientChunkManager.class)
public class ClientChunkManagerMixin {
    @Inject(method = "loadChunk", at = @At("HEAD"), cancellable = true)
    private void slowDownChunkLoading(CallbackInfo ci) {
        // Chunk yükleme sıklığını azaltarak FPS düşüşünü engelle
        if (Math.random() > 0.5) ci.cancel(); 
    }
}

