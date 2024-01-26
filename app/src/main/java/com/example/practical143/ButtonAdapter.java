package com.example.practical143;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class ButtonAdapter extends BaseAdapter {

        private final Context context;
        private final String[] buttonValues;

        public ButtonAdapter(Context context){
            this.context = context;
            buttonValues= new String[15];

            for (int i=0;i<15;i++){
                buttonValues[i]="Button"+(i + 1);
            }
        }
    @Override
    public int getCount(){
            return buttonValues.length;
    }
    @Override
    public Object getItem(int position){
            return buttonValues[position];
    }
    @Override
    public long getItemId(int position){
            return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Button button;

        if(convertView==null){
            button = new Button(context);
        }
        else {
            button = (Button) convertView;
        }
        button.setText(buttonValues[position]);
        return button;
    }
}
