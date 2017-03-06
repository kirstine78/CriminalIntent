package au.edu.holmesglen.kirstine_n.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Kirsti on 6/03/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
