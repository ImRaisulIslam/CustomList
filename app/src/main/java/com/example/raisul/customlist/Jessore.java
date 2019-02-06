package com.example.raisul.customlist;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

public class Jessore extends AppCompatActivity {
    ListView list;
   SearchView searchView;
   ArrayAdapter<String> adapter;
    String district[]={"Monirampur","sadar","micheal","Jhenaidha","Khulna","Kushtia","Magura","Meherpur","Narail","Satkhira"};
    int imgs[] ={R.drawable.loc, R.drawable.loc, R.drawable.loc, R.drawable.loc,R.drawable.loc, R.drawable.loc, R.drawable.loc,
            R.drawable.loc,R.drawable.loc,R.drawable.loc};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jessore);
       list=(ListView)findViewById(R.id.list2);
       searchView=(SearchView)findViewById(R.id.searchView) ;
       adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,district);
       list.setAdapter(adapter);
       searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
           @Override
           public boolean onQueryTextSubmit(String text) {
               return false;
           }


           @Override
           public boolean onQueryTextChange(String newText) {
               adapter.getFilter(). filter(newText);
               return false;
           }
       });


        MyAdapter adapter=new  MyAdapter(this,district,imgs);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }
                if(position==1){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }
                if(position==2){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }
                if(position==3){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }
                if(position==4){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }
                if(position==5){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }
                if(position==6){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }
                if(position==7){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }
                if(position==8){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }
                if(position==9){
                    Intent i = new Intent(Jessore.this,Jessore_Detail.class);
                    i.putExtra("index",position);
                    startActivity(i);
                }

            }
        });
    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String[] mdistrict;
        int[] imgs;

        MyAdapter(Context c,String[] district, int []imgs) {
            super(c, R.layout.jessore_layout, R.id.text1, district);
            this.context=c;
            this.imgs=imgs;
            this.mdistrict=district;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View jessore_layout =layoutInflater.inflate(R.layout.jessore_layout,parent,false);
            ImageView images = jessore_layout.findViewById(R.id.logo);
            TextView district= jessore_layout.findViewById(R.id.text1);
            images.setImageResource(imgs[position]);
            district.setText(mdistrict[position]);
            return jessore_layout;
        }
    }
}