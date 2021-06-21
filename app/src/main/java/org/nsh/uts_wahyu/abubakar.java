package org.nsh.uts_wahyu;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class abubakar extends ListActivity {
    protected void onCreate(Bundle isicle) {
        super.onCreate(isicle);
        String[] listRS = new String[]{"Sejarah", "Silsilah", "Wilayah Kekuasan", "Foto Peninggalan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Sejarah")) {
                String website = "https://id.wikipedia.org/wiki/Abu_Bakar_Ash-Shiddiq#:~:text=Abdullah%20bin%20Abu%20Quhafah%20(bahasa,pertama%20sepeninggal%20Nabi%20Muhammad%20mangkat.";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Silsilah")) {
                String website = "https://www.google.com/search?q=silsilah+abu+bakar&safe=strict&sxsrf=ALeKk03G5miigN06apGnxjBvmF_C57VvjQ:1624275392302&tbm=isch&source=iu&ictx=1&fir=78FduRJ1UU3wQM%252CdrknK-a2zad7gM%252C_&vet=1&usg=AI4_-kQx-cflXBqQQ04DXPKxU8Th2P8DUQ&sa=X&ved=2ahUKEwjT1Zmu0ajxAhUa73MBHQjxC2AQ9QF6BAgTEAE&biw=958&bih=955#imgrc=78FduRJ1UU3wQM";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Wilayah Kekuasan")) {
                String website = "https://www.kompasiana.com/arkan03407/5dbd31f8d541df2acc0d1902/perluasan-wilayah-islam-yang-termasuk-salah-satu-diplomasi-abu-bakar-ash-shiddiq";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Foto Peninggalan")) {
                String website = "https://www.republika.co.id/berita/q5jfvv320/peninggalan-tikar-tua-dan-5-dirham-abu-bakar-jelang-wafatnya";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
