package defaultinterface.genericinterface;

@FunctionalInterface
public interface FunctionalGenerics<R, T> {
    R execute(T t);
}
