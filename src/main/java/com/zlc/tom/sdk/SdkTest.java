package com.zlc.tom.sdk;

import com.aliyun.odps.*;
import com.aliyun.odps.account.Account;
import com.aliyun.odps.account.AliyunAccount;
import com.aliyun.odps.data.Record;
import com.aliyun.odps.task.SQLTask;

import java.util.List;

public class SdkTest {
    private static final String accessId = "LTAI4Fnnrq37QRLXkfB1E731";
    private static final String accessKey = "DZVVFJZfsEYx3esUtGSTMCsZpOyE62";
    private static final String endPoint = "http://service.odps.aliyun.com/api";
    private static final String project = "datawork04";
    private static final String sql = "select * from sys_data;";
    public static void main(String[] args) {
        Account account = new AliyunAccount(accessId, accessKey);
        Odps odps = new Odps(account);
        odps.setEndpoint(endPoint);
        odps.setDefaultProject(project);
        //获取表数据
        try {
            Instance i;
            i = SQLTask.run(odps, sql);
            i.waitForSuccess();
            List<Record> records = SQLTask.getResult(i);
            for(Record r:records){
                System.out.println(r.get(0).toString());
            }
        } catch (OdpsException e) {
            e.printStackTrace();
        }

      /*//获取实例
       for (Instance i : odps.instances()) {
            System.out.println(i.getProject());
        }

        //获取表
        for (Table t : odps.tables()) {
            System.out.println(t.getName());

        }

        //获取指定表
       Table t2 = odps.tables().get("sys_data");
        System.out.println(t2.getName());

        //获取说有资源
        for (Resource r : odps.resources()) {
           System.out.println(r.getName());
        }

        //获取所有函数
        for (Function f : odps.functions()) {
            System.out.println(f.getName());
        }*/
    }
}
