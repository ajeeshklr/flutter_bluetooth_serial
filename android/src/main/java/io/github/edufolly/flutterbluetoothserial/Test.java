package io.github.edufolly.flutterbluetoothserial;

public class Test {

    public void test() {
        AsyncExecutor.execute(new BluetoothSerialCallable<>(new IAsyncOperation<Object, Object>() {
            @Override
            public Object execute(Object input) {
                return null;
            }
        }, null), new IAsyncCallback<Object>() {
            @Override
            public void onDone(Object result) {

            }

            @Override
            public void onException(Exception ex) {

            }
        });
    }
}
