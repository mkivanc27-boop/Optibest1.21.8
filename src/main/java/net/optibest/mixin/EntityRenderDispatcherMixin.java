@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {
    @Inject(method = "shouldRender", at = @At("HEAD"), cancellable = true)
    private void optimizeRange(CallbackInfoReturnable<Boolean> cir) {
        // Burada mesafe kontrolü ekleyebiliriz (Örn: 32 blok ötesini renderlama)
    }
}
