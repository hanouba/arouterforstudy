package com.example.hello.app_common.appcommon.service;




/**
 * @author liuxiaodong
 * @date 2018/12/1
 * @description 在common库中暴露接口  从test module 获取数据
 */
public interface ITestService extends IProvider {

    /**
     * 模拟平行模块之间获取服务
     */
    String getTestPackageName();
}
