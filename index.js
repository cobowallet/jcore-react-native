import { NativeModules } from 'react-native'

const JCoreModule = NativeModules.JCoreModule

export default class JPush {

    /*
    * 设置调试模式
    *
    * 该接口需在 init 接口之后调用
    * @param code = us
    * */
    static testCountryCode(code) {
        JCoreModule.testCountryCode(code)
    }

}
