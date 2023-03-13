import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my_practicals_2.R;

public class myCustomelist extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title;
    private final int[] images;

    public myCustomelist(Activity context, String[] title, int[] images) {
        super(context , R.layout.mylist,title);
        this.context = context;
        this.title = title;
        this.images = images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.mylist,null,true);
        TextView txttitle = rowView.findViewById(R.id.title);

        ImageView img = rowView.findViewById(R.id.icon);

        txttitle.setText(title[position]);
        img.setImageResource(images[position]);
        return rowView;
    }
}
