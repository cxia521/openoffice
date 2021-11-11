package com.chinadci.springboot.model.sysmodel;

import java.time.LocalDateTime;
import java.util.Collection;

public class ServiceListResult<T> extends ServiceObjectResult<Collection<T>> {
    public ServiceListResult(int totalCount, Collection<T> appendData) {
        this.TotalCount = totalCount;
        this.ResultType = "list";
        this.Data = appendData;
        if (appendData != null) this.Count = appendData.size();
    }

    /// <summary>
    ///     初始化一个 业务操作结果信息类 的新实例
    /// </summary>
    /// <param name="resultType">业务操作结果代码</param>
    public ServiceListResult() {
        int resultCode = ServiceResultCode.Warning.getindex();
    }

    /// <summary>
    ///  初始化一个 定义返回消息的业务操作结果信息类 的新实例
    /// </summary>
    /// <param name="resultCode"></param>
    /// <param name="message"></param>
    public ServiceListResult(ServiceResultCode resultCode, String message) {
        this.ReturnCode = resultCode.getindex();
        this.Message = message;
    }

    /// <summary>
    /// 初始化一个 定义返回消息与附加数据的业务操作结果信息类 的新实例
    /// </summary>
    /// <param name="resultCode"></param>
    /// <param name="message"></param>
    /// <param name="appendData"></param>
    public ServiceListResult(ServiceResultCode resultCode, String message, int totalCount, Collection<T> appendData) {
        this.ReturnCode = resultCode.getindex();
        this.Message = message;
        this.Data = appendData;
        if (appendData != null)
            this.Count = appendData.size();
        this.TotalCount = totalCount;
    }

    /// <summary>
    /// 返回值总数
    /// </summary>
    public int TotalCount;

    public int Count;

    public LocalDateTime MaxDateTime;
}

