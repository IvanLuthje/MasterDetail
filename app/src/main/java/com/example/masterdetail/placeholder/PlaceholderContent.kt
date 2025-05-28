package com.example.masterdetail.placeholder

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<PlaceholderItem> = mutableListOf()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, PlaceholderItem> = HashMap()


    init {
        addItem(0, "Amazon", "https://www.amazon.com")
        addItem(1, "Google", "https://www.google.com")
        addItem(2, "YouTube", "https://www.youtube.com")
        addItem(3, "Wikipedia", "https://www.wikipedia.org")
        addItem(4, "Stack Overflow", "https://stackoverflow.com")
        addItem(5, "GitHub", "https://github.com")
        addItem(6, "Reddit", "https://www.reddit.com")
    }

    private fun addItem(id: Int, website_name: String, website_url: String) {
        val item = PlaceholderItem(id, website_name, website_url)
        ITEMS.add(item)
    }




    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A placeholder item representing a piece of content.
     */
    data class PlaceholderItem(val id: Int, val website_name: String, val website_url: String){
        override fun toString(): String = website_name;
    }

}