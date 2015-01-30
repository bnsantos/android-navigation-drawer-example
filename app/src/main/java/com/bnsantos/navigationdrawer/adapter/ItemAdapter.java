package com.bnsantos.navigationdrawer.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bnsantos.navigationdrawer.R;
import com.bnsantos.navigationdrawer.model.Item;

import java.util.List;

/**
 * Created by bruno on 30/01/15.
 */
public class ItemAdapter extends ArrayAdapter<Item>{

    public ItemAdapter(Context context, List<Item> objects) {
        super(context, R.layout.adapter_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item, parent, false);
            convertView.setTag(new ViewHolder(
                    (ViewPager)convertView.findViewById(R.id.adapterViewPager),
                    (TextView)convertView.findViewById(R.id.adapterText)));
        }
        final ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        final Item item = getItem(position);

        viewHolder.textView.setText(item.text +"-"+ item.res.length);
        viewHolder.viewPager.setAdapter(new ViewPagerAdapter(getContext(), item.res));


        return convertView;
    }

    private class ViewHolder{
        public final ViewPager viewPager;
        public final TextView textView;

        private ViewHolder(ViewPager viewPager, TextView textView) {
            this.viewPager = viewPager;
            this.textView = textView;
        }
    }
}
