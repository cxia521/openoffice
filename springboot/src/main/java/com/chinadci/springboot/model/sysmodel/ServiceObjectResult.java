package com.chinadci.springboot.model.sysmodel;

public class ServiceObjectResult<T> extends ServiceResult {
    public ServiceObjectResult() {
        ReturnCode = ServiceResultCode.Warning.getindex();
    }

    /// <summary>
    ///     初始化一个 业务操作结果信息类 的新实例
    /// </summary>
    /// <param name="resultType">业务操作结果代码</param>
    public ServiceObjectResult(ServiceResultCode resultCode) {
        this.ReturnCode = resultCode.getindex();
        this.ResultType = "object";
    }

    /// <summary>
    ///  初始化一个 定义返回消息的业务操作结果信息类 的新实例
    /// </summary>
    /// <param name="resultCode"></param>
    /// <param name="message"></param>
    public ServiceObjectResult(ServiceResultCode resultCode, String message) {
        this.ReturnCode = resultCode.getindex();
        this.Message = message;
        this.ResultType = "object";
    }

    /// <summary>
    /// 初始化一个 定义返回消息与附加数据的业务操作结果信息类 的新实例
    /// </summary>
    /// <param name="resultCode"></param>
    /// <param name="message"></param>
    /// <param name="appendData"></param>
    public ServiceObjectResult(ServiceResultCode resultCode, String message, T appendData) {
        this.ReturnCode = resultCode.getindex();
        this.Message = message;
        this.Data = appendData;
    }

    /// <summary>
    /// 获取和设置返回值的类型.类型可以为 object|list|tree
    /// </summary>
    public String ResultType;

    /// <summary>
    /// 获取或设置返回映射类类型
    /// </summary>
    public String ModelType;

    /// <summary>
    /// 获取和设置返回数据
    /// </summary>
    public T Data;
}

