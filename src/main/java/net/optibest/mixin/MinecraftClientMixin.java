@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @ModifyVariable(method = "render", at = @At("STORE"), ordinal = 0)
    private boolean forceOptimizedRender(boolean original) { return false; }
}

