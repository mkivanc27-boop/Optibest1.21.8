@Mixin(BufferBuilder.class)
public class BufferBuilderMixin {
    @ModifyConstant(method = "build", constant = @Constant(intValue = 2097152))
    private int increaseBuffer(int original) { return 8388608; }
}

