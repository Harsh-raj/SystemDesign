package NullObject;

import java.util.EnumSet;

public class NullOption implements Option{
    public static final EnumSet<Options> INSTANCE = EnumSet.noneOf(Options.class);
}
