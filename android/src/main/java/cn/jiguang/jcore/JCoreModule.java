
package cn.jiguang.plugins.jcore;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import cn.jiguang.api.JCoreInterface;


public class JCoreModule extends ReactContextBaseJavaModule {

    public static ReactApplicationContext reactContext;


    public JCoreModule(ReactApplicationContext reactApplicationContext) {
        super(reactContext);
        reactContext = reactApplicationContext;
    }

    @Override
    public String getName() {
        return "JCoreModule";
    }


    @ReactMethod
    public void testCountryCode(String code) {
        JCoreInterface.testCountryCode(code);
    }

}
