package com.rappi.rappitest.data.db;

import android.content.Context;

import com.rappi.rappitest.data.db.model.DaoMaster;
import com.rappi.rappitest.di.ApplicationContext;
import com.rappi.rappitest.di.DatabaseInfo;
import com.rappi.rappitest.utils.AppLogger;

import org.greenrobot.greendao.database.Database;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DbOpenHelper extends DaoMaster.OpenHelper {

    @Inject
    public DbOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        AppLogger.d("DEBUG", "DB_OLD_VERSION : " + oldVersion + ", DB_NEW_VERSION : " + newVersion);
    }
}
