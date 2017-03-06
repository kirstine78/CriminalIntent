package au.edu.holmesglen.kirstine_n.criminalintent;

import java.util.UUID;

/**
 * Created by Kirsti on 6/03/2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        // generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
