package cn.edu.zust.dm.dmthome;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class MainActivity extends Activity {
    private HomeFragment homefg;
    private ZhuanyeFragment zhuanyefg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        homefg=new HomeFragment();
        zhuanyefg = new ZhuanyeFragment();
        transaction.replace(R.id.fragment_container,homefg);
        transaction.commit();
    }
}
