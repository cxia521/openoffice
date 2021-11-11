package com.chinadci.springboot.model.sysmodel;

public enum ServiceResultCode {
    Success("操作成功。", 0),
    NoChanged("操作没有引发任何变化，提交取消。", 1),
    ParamError("参数错误。", 2),
    QueryNull("指定参数的数据不存在。", 3),
    PurviewLack("当前用户权限不足，不能继续操作。", 4),
    IllegalOperation("非法操作。", 5),
    Warning("警告", 6),
    Error("操作引发错误。", 7);

    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private ServiceResultCode(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public int getindex() {
        return this.index;
    }
}
