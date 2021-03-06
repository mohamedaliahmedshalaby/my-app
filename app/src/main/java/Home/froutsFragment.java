package Home;

import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link froutsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class froutsFragment extends Fragment implements View.OnClickListener{
   View view;
   Button mback,mbuyapple;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public froutsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment froutsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static froutsFragment newInstance(String param1, String param2) {
        froutsFragment fragment = new froutsFragment();
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
        view= inflater.inflate(R.layout.fragment_frouts, container, false);
        mback =view.findViewById(R.id.back_Hom);
        mbuyapple=view.findViewById(R.id.buy_apple);
        mbuyapple.setOnClickListener(this);
        mback.setOnClickListener(this);
    return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buy_apple:
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction();
                break;

            case R.id.back_Hom:

                FragmentManager fragmentManager3 = getFragmentManager();
                fragmentManager3.beginTransaction().replace(R.id.page_container,new HomeFragment()).commit();

                break;
        }

    }
}
