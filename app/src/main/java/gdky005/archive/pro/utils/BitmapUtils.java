package gdky005.archive.pro.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by WangQing on 15/10/13.
 */
public class BitmapUtils {

    /**
     * 根据原图和变长绘制圆形图片
     *
     * @param mBitmap
     * @return
     */
    public static Bitmap createCircleImage(Bitmap mBitmap) {

        int bmpWidth = mBitmap.getWidth();
        int bmpHeight = mBitmap.getHeight();

        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap target = Bitmap.createBitmap(bmpWidth, bmpHeight, Bitmap.Config.ARGB_8888);
//        产生一个同样大小的画布
        Canvas canvas = new Canvas(target);
//        首先绘制圆形
        canvas.drawCircle(bmpWidth / 2, bmpWidth / 2, bmpWidth / 2, paint);
//         使用SRC_IN
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
//         绘制图片
        canvas.drawBitmap(mBitmap, 0, 0, paint);
        return target;
    }

    //图片圆角处理
    public static Bitmap getRoundedBitmap(Bitmap mBitmap) {
        //创建新的位图
        Bitmap bgBitmap = Bitmap.createBitmap(mBitmap.getWidth(), mBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        //把创建的位图作为画板
        Canvas mCanvas = new Canvas(bgBitmap);

        Paint mPaint = new Paint();
        Rect mRect = new Rect(0, 0, mBitmap.getWidth(), mBitmap.getHeight());
        RectF mRectF = new RectF(mRect);
        //设置圆角半径为20
        float roundPx = 180;
        mPaint.setAntiAlias(true);
        //先绘制圆角矩形
        mCanvas.drawRoundRect(mRectF, roundPx, roundPx, mPaint);

        //设置图像的叠加模式
        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        //绘制图像
        mCanvas.drawBitmap(mBitmap, mRect, mRect, mPaint);

        return bgBitmap;
    }

}
