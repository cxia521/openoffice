package com.chinadci.springboot.model.sysmodel;

public class ServiceResult {

    public ServiceResult() {
        ReturnCode = ServiceResultCode.Warning.getindex();
    }

    /// <summary>
    ///     初始化一个 业务操作结果信息类 的新实例
    /// </summary>
    /// <param name="resultType">业务操作结果代码</param>
    public ServiceResult(ServiceResultCode resultCode) {
        ReturnCode = resultCode.getindex();
    }

    /// <summary>
    ///  初始化一个 定义返回消息的业务操作结果信息类 的新实例
    /// </summary>
    /// <param name="resultCode"></param>
    /// <param name="message"></param>
    public ServiceResult(ServiceResultCode resultCode, String message) {
        this.ReturnCode = resultCode.getindex();
        this.Message = message;
    }

    public int ReturnCode;
    /// <summary>
    ///     获取或设置 操作返回信息
    /// </summary>
    ///
    public String Message;

    public String Action;
}
