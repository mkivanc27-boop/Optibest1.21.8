package net.optibest.mixin;
import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {
    @Inject(method = "renderClouds", at = @At("HEAD"), cancellable = true)
    private void noClouds(CallbackInfo ci) { ci.cancel(); }

    @Inject(method = "renderWeather", at = @At("HEAD"), cancellable = true)
    private void noWeather(CallbackInfo ci) { ci.cancel(); }
}
