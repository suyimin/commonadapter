package com.xdroid.demo.rv.mul;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.xdroid.adapter.rv.ViewHolder;
import com.xdroid.adapter.rv.mul.BaseMulTypeAdapter;
import com.xdroid.adapter.rv.mul.IMulTypeHelper;

import java.util.ArrayList;
import java.util.List;

import com.xdroid.demo.R;

public class RvMulTypeMulBeanActivity extends AppCompatActivity {

    private List<IMulTypeHelper> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_mul_type_mul_bean);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.activity_rv_mul_type_mul_bean);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDatas = initDatas();

        recyclerView.setAdapter(new BaseMulTypeAdapter(this, mDatas) {
            @Override
            public void convert(ViewHolder holder, final IMulTypeHelper iMulTypeHelper) {
                super.convert(holder, iMulTypeHelper);

                switch (iMulTypeHelper.getItemLayoutId()) {
                    case R.layout.item_rv_mulbean_1:
                        holder.setOnClickListener(R.id.tv, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                MulTypeMulBean1 mulTypeMulBean1 = (MulTypeMulBean1) iMulTypeHelper;
                                Toast.makeText(mContext, mulTypeMulBean1.getName(), Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;
                    case R.layout.item_rv_mulbean_2:
                        holder.setOnClickListener(R.id.banner, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(mContext, "你想调到哪里", Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;
                }
            }
        });

    }


    public List<IMulTypeHelper> initDatas() {
        List<IMulTypeHelper> datas = new ArrayList<>();
        datas.add(new MulTypeMulBean2("http://desk.fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwaOIN8zJAAs5DadIS-IAALGbQPo5ngACzkl365.jpg"));

        datas.add(new MulTypeMulBean1("http://imgs.ebrun.com/resources/2016_04/2016_04_12/201604124411460430531500.jpg", "多种type"));
        datas.add(new MulTypeMulBean1("http://imgs.ebrun.com/resources/2016_03/2016_03_25/201603259771458878793312_origin.jpg", "张"));

        datas.add(new MulTypeMulBean2("http://cdn.duitang.com/uploads/item/201610/20/20161020070310_c5xWi.jpeg"));

        datas.add(new MulTypeMulBean1("http://p14.go007.com/2014_11_02_05/a03541088cce31b8_1.jpg", "旭童"));
        datas.add(new MulTypeMulBean1("http://news.k618.cn/tech/201604/W020160407281077548026.jpg", "多种type"));
        datas.add(new MulTypeMulBean1("http://www.kejik.com/image/1460343965520.jpg", "多种type"));
        datas.add(new MulTypeMulBean1("http://cn.chinadaily.com.cn/img/attachement/jpg/site1/20160318/eca86bd77be61855f1b81c.jpg", "多种type"));

        datas.add(new MulTypeMulBean2("http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1512/31/c4/17105160_1451572371249_800x800.jpg"));

        datas.add(new MulTypeMulBean1("http://imgs.ebrun.com/resources/2016_04/2016_04_24/201604244971461460826484_origin.jpeg", "多种type"));
        datas.add(new MulTypeMulBean1("http://www.lnmoto.cn/bbs/data/attachment/forum/201408/12/074018gshshia3is1cw3sg.jpg", "多种type"));
        return datas;
    }
}
