@Mixin(ChunkBuilder.class)
public class ChunkBuilderMixin {
    @ModifyConstant(method = "rebuild", constant = @Constant(intValue = 2))
    private int fasterChunkRebuild(int original) { return 1; }
}
