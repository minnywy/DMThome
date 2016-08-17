package cn.edu.zust.dm.dmthome;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class HomeFragment extends Fragment {
    private ZhuanyeFragment zhuanyefg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.activity_home_fragment, container, false);
        ImageButton bt1=(ImageButton)v.findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                zhuanyefg = new ZhuanyeFragment();
                transaction.replace(R.id.fragment_container,zhuanyefg);
                transaction.commit();
            }
        });
        return v;
    }
}
