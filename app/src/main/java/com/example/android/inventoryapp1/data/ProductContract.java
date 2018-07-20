package com.example.android.inventoryapp1.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by djalél on 07/07/2018.
 */

public  class ProductContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ProductContract() {
    }
    public static final String CONTENT_AUTHORITY = "com.example.android.inventoryapp1";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_INVENTORYAPP = "product";
    /**
     * Inner class that defines constant values for the products database table.
     * Each entry in the table represents a single product.
     */
    public static final class ProductEntry implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_INVENTORYAPP);
        public static final String CONTENT_LIST_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORYAPP;
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORYAPP;
        /**
         * Name of database table for products
         */
        public final static String TABLE_NAME = "product";

        ///Column headers
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PRODUCT_NAME = "name";
        public final static String COLUMN_PRODUCT_PRICE = "price";
        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";
        public final static String COLUMN_PRODUCT_IMAGE = "image";
        public final static String COLUMN_PRODUCT_SUPPLIER_NAME = "supplier";
        public final static String COLUMN_PRODUCT_SUPPLIER_PHONE = "phone";

        /**
         * Possible values for the supplier of the product.
         */
        public static final int something = 0;
        public static final int KONZUM = 1;
        public static final int PLODINE = 2;
        public static final int LIDL = 3;
    }

}
