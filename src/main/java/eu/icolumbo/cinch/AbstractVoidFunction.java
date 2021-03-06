package eu.icolumbo.cinch;

import org.apache.spark.api.java.function.Function;

/**
* @author Paul Middelkoop
*/
public abstract class AbstractVoidFunction<T> implements Function<T, Void> {

    @Override
    public Void call(T t) throws Exception {
        voidCall(t);
        return null;
    }

    protected abstract void voidCall(T t) throws Exception;
}
