package com.egco428.viewpager;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends PagerAdapter {
    Context context;
    int[] imageId = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
    public CustomAdapter(Context context){
        this.context = context;
    }
    String[] name ={"image1","image2","image3","image4","image5"};


    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return imageId.length;

    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View viewItem = inflater.inflate(R.layout.image_item, container, false);
        ImageView imageView = (ImageView) viewItem.findViewById(R.id.imageView);
        imageView.setImageResource(imageId[position]);
        TextView textView1 = (TextView) viewItem.findViewById(R.id.textView);
        textView1.setText(name[position]);
        ((ViewPager)container).addView(viewItem);

        return viewItem;

    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        // TODO Auto-generated method stub

        return view == ((View)object);
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub
        ((ViewPager) container).removeView((View) object);
    }

}
