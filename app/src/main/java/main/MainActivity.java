package main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import Home.HomeFragment;
import Home.MapsActivity;
import fav.favFragment;
import fav.logFragment;
import setings.setingFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView mOpenDrawer;

    TextView mHomeNavItem ,mFavNavItem,mstingNavItem,mPageTitle,mlogUot,mmaps;
    DrawerLayout mDrawer;
    FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();



    }
  void  initViews(){
     mOpenDrawer =findViewById(R.id.open_drawer);
     mHomeNavItem  =findViewById(R.id.home_nav_item);
     mFavNavItem =findViewById(R.id.fav_nav_item);
     mstingNavItem=findViewById(R.id.sting_nav_item);
     mPageTitle=findViewById(R.id.page_title);
     mDrawer=findViewById(R.id.drawer_layout);
     mFab=findViewById(R.id.fab);
      mlogUot=findViewById(R.id.log_out_item);
      mmaps=findViewById(R.id.maps_items);
      mOpenDrawer.setOnClickListener(this);
mHomeNavItem.setOnClickListener(this);
mstingNavItem.setOnClickListener(this);
mFavNavItem.setOnClickListener(this);
mFab.setOnClickListener(this);
mlogUot.setOnClickListener(this);
mmaps.setOnClickListener(this);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClick(View v) {
switch (v.getId()) {
    case R.id.open_drawer:
        mDrawer.openDrawer(Gravity.LEFT);

        break;
    case R.id.home_nav_item:
        loadFragment(new HomeFragment(), "Home");

        break;

    case R.id.fav_nav_item:

        loadFragment(new favFragment(), "favourite");

        break;
    case R.id.sting_nav_item:
        loadFragment(new setingFragment(), "stings");

        break;
    case R.id.log_out_item:
        loadFragment(new logFragment(), "log out");

        break;
    case R.id.fab:
        FilterBottomFragment filterBottomFragment = new FilterBottomFragment();
        filterBottomFragment.show(getSupportFragmentManager(), "");
        break;
    case R.id.maps_items:
        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
startActivity(intent);

break;
}


    }
    void loadFragment ( Fragment fragment, String pagetitle){
        FragmentManager FragmentManager =getSupportFragmentManager();
        FragmentManager.beginTransaction().replace(R.id.page_container, fragment).commit();
        mDrawer.closeDrawers();
        mPageTitle.setText(pagetitle);

    }
}
