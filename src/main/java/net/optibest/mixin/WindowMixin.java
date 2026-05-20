package net.optibest.mixin;
import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Window.class)
public class WindowMixin {
    @Inject(method = "isVsync", at = @At("HEAD"), cancellable = true)
    private void noVsync(CallbackInfoReturnable<Boolean> cir) { cir.setReturnValue(false); }

    @Inject(method = "getFramerateLimit", at = @At("HEAD"), cancellable = true)
    private void noLimit(CallbackInfoReturnable<Integer> cir) { cir.setReturnValue(999); }
}

