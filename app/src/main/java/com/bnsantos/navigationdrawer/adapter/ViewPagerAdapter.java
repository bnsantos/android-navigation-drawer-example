package com.bnsantos.navigationdrawer.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bnsantos.navigationdrawer.R;
import com.squareup.picasso.Picasso;

/**
 * Created by bruno on 30/01/15.
 */
public class ViewPagerAdapter extends PagerAdapter {
    private int[] mResources;
    private Context mContext;

    public ViewPagerAdapter(Context context, int[] mResources) {
        this.mResources = mResources;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public float getPageWidth(int position) {
        if (getCount() > 1) {
            return 0.95f;
        } else {
            return 1f;
        }
    }

    @Override
    public View instantiateItem(ViewGroup container, final int position) {
        final ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        Picasso.with(mContext).load(mResources[position]).centerInside().fit().into(imageView);
        container.addView(imageView);
        return imageView;
    }
}
