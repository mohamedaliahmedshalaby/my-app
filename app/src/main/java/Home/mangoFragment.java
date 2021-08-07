package Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mangoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mangoFragment extends Fragment implements View.OnClickListener{
    View view;
    Button mback;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public mangoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mangoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static mangoFragment newInstance(String param1, String param2) {
        mangoFragment fragment = new mangoFragment();
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
   view= inflater.inflate(R.layout.fragment_mango, container, false);

   mback =view.findViewById(R.id.back_toHome);
mback.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentManager FragmentManager1 = getFragmentManager();
        FragmentManager1.beginTransaction().replace(R.id.page_container,new HomeFragment()).commit();

    }
}