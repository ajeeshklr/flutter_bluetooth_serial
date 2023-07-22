package io.github.edufolly.flutterbluetoothserial;

public interface IAsyncCallback<T> {
    void onDone(T result);
    void onException(Exception ex);
}
