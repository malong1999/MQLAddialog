package maxiaobu.mqladdialog;

import android.app.Application;
import android.util.DisplayMetrics;

import com.facebook.drawee.backends.pipeline.Fresco;

import maxiaobu.mqladdialoglibrary.utils.DisplayUtil;

/**
 * Created by maqinglong on 2017/1/5.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initDisplayOpinion();
        Fresco.initialize(this);
    }

    private void initDisplayOpinion() {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        DisplayUtil.density = dm.density;
        DisplayUtil.densityDPI = dm.densityDpi;
        DisplayUtil.screenWidthPx = dm.widthPixels;
        DisplayUtil.screenhightPx = dm.heightPixels;
        DisplayUtil.screenWidthDip = DisplayUtil.px2dip(getApplicationContext(), dm.widthPixels);
        DisplayUtil.screenHightDip = DisplayUtil.px2dip(getApplicationContext(), dm.heightPixels);
    }
}
