package xdgimf.app.samplebindingcollectionadapter;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.view.View;

/**
 * Created by Miguel on 13/12/2015.
 */

public class ItemViewModel {

    public final ObservableBoolean selected = new ObservableBoolean();

    public final ObservableField<String> text = new ObservableField<>();

    public final View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (selected.get()) {
                selected.set(false);
            } else {
                selected.set(true);
            }
        }
    };

    public ItemViewModel(String text) {
        this.text.set(text);
    }

}
