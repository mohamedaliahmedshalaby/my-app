package setings;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import Home.HomeFragment;
import Home.mangoFragment;
import fav.favFragment;
import main.FilterBottomFragment;
import main.MainActivity;

public class setingFragment extends BottomSheetDialogFragment implements View.OnClickListener {
    View view;
TextView mEditprofile ,mchangelang ,mcontactus ,mconectUs;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public setingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment setingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static setingFragment newInstance(String param1, String param2) {
        setingFragment fragment = new setingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     view=inflater.inflate(R.layout.fragment_seting, container, false);
     mEditprofile=view.findViewById(R.id.edidt_profile);
     mchangelang=view.findViewById(R.id.change_lang);
        mcontactus=view.findViewById(R.id.contact_us);
     mEditprofile.setOnClickListener(this);
mchangelang.setOnClickListener(this);
mcontactus.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.edidt_profile:
                setFragment(new edit_profileFragment());
                break;
            case R.id.change_lang:
                FilterBottomFragment2 filterBottomFragment1 = new FilterBottomFragment2();
                filterBottomFragment1.show(getFragmentManager(), "");

                break;

            case R.id.contact_us:
                setFragment(new ConectUsFragment());

                break;
            case R.id.sting_nav_item:

                break;
            case R.id.fab:

                break;


        }

    }
   private void  setFragment(Fragment fragment){

       FragmentManager FragmentManager = getFragmentManager();
       FragmentManager.beginTransaction().replace(R.id.page_container, fragment).commit();


    }

}