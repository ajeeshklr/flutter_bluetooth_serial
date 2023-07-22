package io.github.edufolly.flutterbluetoothserial;

public interface IAsyncOperation<T, TResult> {
    TResult execute(T input);
}
