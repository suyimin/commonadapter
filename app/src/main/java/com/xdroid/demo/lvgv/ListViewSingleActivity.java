package com.xdroid.demo.lvgv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.xdroid.adapter.lvgv.CommonAdapter;
import com.xdroid.adapter.lvgv.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import com.xdroid.demo.R;
import com.xdroid.demo.TestBean;

public class ListViewSingleActivity extends AppCompatActivity {
    private static final String TAG = "zxt";
    private List<TestBean> mDatas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_single);

        ListView listView = (ListView) findViewById(R.id.activity_list_view_single);
        listView.setAdapter(new CommonAdapter<TestBean>(this, mDatas = initDatas(), R.layout.item_test) {
            @Override
            public void convert(ViewHolder holder, TestBean testBean, int position) {
                Glide.with(ListViewSingleActivity.this)
                        .load(testBean.getAvatar())
                        .into((ImageView) holder.getView(R.id.ivAvatar));
                holder.setText(R.id.tvName, testBean.getName());
            }
        });
    }


    public List<TestBean> initDatas() {
        List<TestBean> datas = new ArrayList<>();
        datas.add(new TestBean("http://imgs.ebrun.com/resources/2016_03/2016_03_25/201603259771458878793312_origin.jpg", "张"));
        datas.add(new TestBean("http://p14.go007.com/2014_11_02_05/a03541088cce31b8_1.jpg", "旭童"));
        datas.add(new TestBean("http://news.k618.cn/tech/201604/W020160407281077548026.jpg", "多种type"));
        datas.add(new TestBean("http://www.kejik.com/image/1460343965520.jpg", "多种type"));
        datas.add(new TestBean("http://cn.chinadaily.com.cn/img/attachement/jpg/site1/20160318/eca86bd77be61855f1b81c.jpg", "多种type"));
        datas.add(new TestBean("http://imgs.ebrun.com/resources/2016_04/2016_04_12/201604124411460430531500.jpg", "多种type"));
        datas.add(new TestBean("http://imgs.ebrun.com/resources/2016_04/2016_04_24/201604244971461460826484_origin.jpeg", "多种type"));
        datas.add(new TestBean("http://www.lnmoto.cn/bbs/data/attachment/forum/201408/12/074018gshshia3is1cw3sg.jpg", "多种type"));
        return datas;
    }

}
