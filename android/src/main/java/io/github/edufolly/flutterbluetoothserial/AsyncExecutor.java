package io.github.edufolly.flutterbluetoothserial;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AsyncExecutor {

    public static <T,TResult> void execute(BluetoothSerialCallable<T, TResult> r, IAsyncCallback<TResult> callback) {
        Executor executor = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executor.execute(() -> {
            try {
                TResult value = r.call();
                handler.post(()->{
                    callback.onDone(value);
                });
            } catch (Exception e) {
                callback.onException(e);
            }
        });
    }
}

