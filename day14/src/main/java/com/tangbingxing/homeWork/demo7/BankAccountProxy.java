package com.tangbingxing.homeWork.demo7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Classname BankAccountProxy
 * @Description 银行账户代理类
 * @Version 1.0.0
 * @Date 2023/8/2 16:43
 * @Created by m1346
 */

public class BankAccountProxy implements InvocationHandler {

    //引用BankAccount类
    private BankAccount account;

    public BankAccountProxy(BankAccount account) {
        this.account = account;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //判断是否为取款方法，是的话就代理该方法
        if ("withdraw".equals(method.getName())){
            //获取参数
            Double arg = (Double) args[0];
            //判断取款金额
            if (arg > 500){
                //大于500
                System.out.println("提现超过500，需要经理审批");
                return null;
            }else if ((account.getBalance() - arg) < 0 ){
                //小于0
                System.out.println("提现金额小于0，经理拒接提现");
                return null;
            }
        }
        //直接调用被代理类的方法
        Object invoke = method.invoke(account, args);
        return invoke;
    }
}
