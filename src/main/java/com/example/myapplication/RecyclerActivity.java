package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.adapter.Adapter;
import com.example.myapplication.bean.Bean;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Bean>beanList;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        //初始化方法
        View();
        Data();
        Event();
    }

    private void Event() {
        adapter=new Adapter(this,beanList);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    //假数据
    private void Data() {
        beanList=new ArrayList<>();
        Bean bean1=new Bean();
        bean1.setTitle("2022红岩网校移动开发部招新群");
        bean1.setTime("18:28");
        bean1.setCont("22-计算机蒋佳鑫：我试试");
        bean1.setImg(R.drawable.hy);

        Bean bean2=new Bean();
        bean2.setTitle("张鞒议");
        bean2.setTime("17:28");
        bean2.setCont("从现在开始我是杨鑫睿小弟");
        bean2.setImg(R.drawable.zqy);

        Bean bean3=new Bean();
        bean3.setTitle("叶嘉豪");
        bean3.setTime("17:25");
        bean3.setCont("从现在开始我是杨鑫睿小弟");
        bean3.setImg(R.drawable.yjh);

        Bean bean4=new Bean();
        bean4.setTitle("张洪宇");
        bean4.setTime("17:20");
        bean4.setCont("从现在开始我是杨鑫睿小弟");
        bean4.setImg(R.drawable.zhy);

        Bean bean5=new Bean();
        bean5.setTitle("高数");
        bean5.setTime("昨天 18:21");
        bean5.setCont("山水人：[图片]");
        bean5.setImg(R.drawable.js);

        Bean bean6=new Bean();
        bean6.setTitle("锅稽拉先生");
        bean6.setTime("昨天 17:22");
        bean6.setCont("[动画表情]");
        bean6.setImg(R.drawable.gjb);

        Bean bean7=new Bean();
        bean7.setTitle("军事理论51周三");
        bean7.setTime("昨天 16:28");
        bean7.setCont("深山白鹤：没事");
        bean7.setImg(R.drawable.gs);

        Bean bean8=new Bean();
        bean8.setTitle("张夏瑜");
        bean8.setTime("13:31");
        bean8.setCont("好帅");
        bean8.setImg(R.drawable.zxy);

        Bean bean9=new Bean();
        bean9.setTitle("文金龙");
        bean9.setTime("昨天 13:30");
        bean9.setCont("ok");
        bean9.setImg(R.drawable.wjl);

        Bean bean10=new Bean();
        bean10.setTitle("腾讯新闻");
        bean10.setTime("昨天 13:25");
        bean10.setCont("实拍东北机械堆雪人：搓雪球有专门机器，3天造218");
        bean10.setImg(R.drawable.tx);

        Bean bean11=new Bean();
        bean11.setTitle("22-云南-江鑫");
        bean11.setTime("昨天 12:09");
        bean11.setCont("就听到一个6-1");
        bean11.setImg(R.drawable.jx);

        Bean bean12=new Bean();
        bean12.setTitle("黄瑞");
        bean12.setTime("昨天 12:08");
        bean12.setCont("哦哦");
        bean12.setImg(R.drawable.hr);

        Bean bean13=new Bean();
        bean13.setTitle("王超");
        bean13.setTime("星期三");
        bean13.setCont("[吐舌]");
        bean13.setImg(R.drawable.wc);

        Bean bean14=new Bean();
        bean14.setTitle("王浩宁");
        bean14.setTime("星期三");
        bean14.setCont("[...]");
        bean14.setImg(R.drawable.whn);

        Bean bean15=new Bean();
        bean15.setTitle("赵俊红");
        bean15.setTime("星期一");
        bean15.setCont("[谢谢老师]");
        bean15.setImg(R.drawable.zjh);

        beanList.add(bean1);
        beanList.add(bean2);
        beanList.add(bean3);
        beanList.add(bean4);
        beanList.add(bean5);
        beanList.add(bean6);
        beanList.add(bean7);
        beanList.add(bean8);
        beanList.add(bean9);
        beanList.add(bean10);
        beanList.add(bean11);
        beanList.add(bean12);
        beanList.add(bean13);
        beanList.add(bean14);
        beanList.add(bean15);
    }

    private void View() {
        recyclerView=findViewById(R.id.rec1);
    }
}