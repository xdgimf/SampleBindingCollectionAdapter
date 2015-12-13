package xdgimf.app.samplebindingcollectionadapter;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import me.tatarka.bindingcollectionadapter.ItemView;

/**
 * Created by Miguel on 13/12/2015.
 */

public class ViewModel {

    public final ItemView itemView = ItemView.of(BR.viewModel, R.layout.item);
    public final ObservableList<ItemViewModel> items = new ObservableArrayList<>();

    public ViewModel() {

    }

    public void loadData() {
        for (int i = 0; i < 50; ++i) {
            items.add(new ItemViewModel("Item " + i));
        }
    }

}
