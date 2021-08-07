package Home;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import fav.favFragment;
import main.FilterBottomFragment;
import setings.setingFragment;


public class HomeFragment extends Fragment implements View.OnClickListener {

    View view;
    ImageView mstrawberries, mmango, mpineapple,mApple;
    private Object AppleFragment;

    public HomeFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);
        items();
        return view;


    }

    void items() {
        mstrawberries = view.findViewById(R.id.frouts_image);
        mmango = view.findViewById(R.id.mango);
        mApple =view.findViewById(R.id.apple_image);
        mstrawberries.setOnClickListener(this);
        mmango.setOnClickListener(this);
        mstrawberries.setOnClickListener(this);
        mApple.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mango:
                homeragment(new mangoFragment());
                break;
            case R.id.frouts_image:
                homeragment(new froutsFragment());
                break;

            case R.id.pineapple_image:


                break;
            case R.id.apple_image:
                homeragment(new AppleFragment());
                break;
        }
    }
    void homeragment(Fragment fragment){
        FragmentManager FragmentManager = getFragmentManager();
        FragmentManager.beginTransaction().replace(R.id.page_container,fragment).commit();



    }
}