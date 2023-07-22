package io.github.edufolly.flutterbluetoothserial;

import java.util.concurrent.Callable;

public class BluetoothSerialCallable<T, TResult> implements Callable<TResult> {

    private final IAsyncOperation<T,TResult> execute;
    private final T _input;

    public BluetoothSerialCallable(IAsyncOperation<T, TResult> call, T input) {
        execute = call;
        _input = input;
    }
    @Override
    public TResult call() throws Exception {
        return execute.execute(_input);

    }
}

