package gdky005.archive.pro;

import android.app.Application;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * Created by WangQing on 15/10/12.
 */
public class ArchiveApplication extends Application{

    private final String APP_TAG = "TAG";

    @Override
    public void onCreate() {
        super.onCreate();

        initLog();
    }

    private void initLog() {
        Logger.init(APP_TAG)               // default PRETTYLOGGER or use just init()
                .setMethodCount(5)
                .setLogLevel(LogLevel.FULL);
    }
}
