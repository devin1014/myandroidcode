package com.android.liuwei.myandroidcode.link;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.android.liuwei.myandroidcode.core.base.BaseActivity;
import com.android.liuwei.myandroidcode.R;

import butterknife.OnClick;

/**
 * User: liuwei(wei.liu@neulion.com.com)
 * Date: 2018-05-17
 * Time: 10:11
 */
public class TestIntentActivity extends BaseActivity
{
    @Override
    protected int getActivityLayout()
    {
        return R.layout.activity_test_intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.intent_start_news)
    public void startCntvAppNewsPage()
    {
        Intent intent = new Intent();
        intent.setData(Uri.parse("cntvlink://news"));
        startActivity(intent);
    }
}
