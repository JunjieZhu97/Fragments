package com.example.lab6.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();


    static {
        // Add some sample items.
        addItem(new DummyItem("1", "Palomar College",
                "https://www2.palomar.edu/"));
        addItem(new DummyItem("2", "Miracosta College",
                "http://www.miracosta.edu/"));
        addItem(new DummyItem("3", "Cal State San Marcos",
                "https://www.csusm.edu/"));
        addItem(new DummyItem("4", "San Diego State",
                "https://www.sdsu.edu/"));
        addItem(new DummyItem("5", "UC San Diego",
                "https://www.ucsd.edu/"));
        addItem(new DummyItem("6", "University of San Diego",
                "https://www.sandiego.edu/"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String websiteName;
        public final String websiteURL;

        public DummyItem(String id, String websiteName, String websiteURL) {
            this.id = id;
            this.websiteName = websiteName;
            this.websiteURL = websiteURL;
        }

        @Override
        public String toString() {
            return websiteName;
        }
    }
}
