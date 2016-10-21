package wishmap.com.tr.wishmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Just dummy content. Nothing special.
 *
 * Created by Andreas Schrade on 14.12.2015.
 */
public class DummyContent {

    /**
     * An array of sample items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample items. Key: sample ID; Value: Item.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<>(5);

    static {
        // GetCountries();

        // photo idlerin kaldırılması lazım, onlar ülke kodlarına göre içeride dinamik olarak verilecek.
        addItem(new DummyItem("austria", R.drawable.p1, "Avusturya", "24 Puan", "Avrupa", "Avusturya gezisi çok keyifli başladı..", (float) 8));
        addItem(new DummyItem("britain", R.drawable.p2, "İngiltere", "32 Puan","Avrupa", "İngiltere çok yağmurluydu..", (float) 6));
        addItem(new DummyItem("switzerland", R.drawable.p3, "İsviçre", "29 Puan", "Avrupa", "İsviçre çok pahalıydı..",(float) 10));
        addItem(new DummyItem("russia", R.drawable.p4, "Rusya", "34 Puan","Avrupa", "Rusya çok çok güzeldi..",(float) 6));
        addItem(new DummyItem("greece", R.drawable.p5, "Yunanistan", "12 Puan","Avrupa", "Yunanistan'da taverna keyfi bir başka..",(float) 4));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class DummyItem {
        public final String id;
        public final int photoId;
        public final String countryName;
        public final String countryPoint;
        public final String continent;
        public final String travelNotes;
        public final float starRate;

        public DummyItem(String id, int photoId, String countryName, String countryPoint, String continent, String notes, float starR) {
            this.id = id;
            this.photoId = photoId;
            this.countryName = countryName;
            this.countryPoint = countryPoint;
            this.continent = continent;
            this.travelNotes = notes;
            this.starRate = starR;
        }
    }
}
