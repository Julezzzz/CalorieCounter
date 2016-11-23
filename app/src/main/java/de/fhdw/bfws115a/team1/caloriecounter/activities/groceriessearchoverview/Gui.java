package de.fhdw.bfws115a.team1.caloriecounter.activities.groceriessearchoverview;

import android.widget.*;

import de.fhdw.bfws115a.team1.caloriecounter.R;

public class Gui {

    private SearchView mSearchView;
    private ListView mListView;
    private ImageView mAddGroceryButton;
    private ImageView mAddMenuButton;

    public Gui(Init activity) {
        activity.setContentView(R.layout.groceriessearchoverview);

        mSearchView = (SearchView) activity.findViewById(R.id.idSearchView);
        mListView = (ListView) activity.findViewById(R.id.idListView);

        mAddGroceryButton = (ImageView) activity.findViewById(R.id.idAddGroceryButton);
        mAddMenuButton = (ImageView) activity.findViewById(R.id.idAddMenuButton);
    }

    public ListView getListView() {
        return mListView;
    }

    public SearchView getSearchView() {
        return mSearchView;
    }

    public ImageView getAddGroceryButton() {
        return mAddGroceryButton;
    }

    public ImageView getAddMenuButton() {
        return mAddMenuButton;
    }
}
