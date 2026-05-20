package net.optibest.mixin;
import net.minecraft.client.font.TextRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(TextRenderer.class)
public class TextRendererMixin {
    @ModifyArg(method = "draw", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/font/TextRenderer;draw(Ljava/lang/String;FFI)I"), index = 3)
    private int removeShadow(int color) { return color & 0xFFFFFF; }
}

