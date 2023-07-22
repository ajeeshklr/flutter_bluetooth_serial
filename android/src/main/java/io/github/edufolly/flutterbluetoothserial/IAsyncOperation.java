package io.github.edufolly.flutterbluetoothserial;

import java.io.IOException;

public interface IAsyncOperation<T, TResult> {
    TResult execute(T input) throws IOException;
}
