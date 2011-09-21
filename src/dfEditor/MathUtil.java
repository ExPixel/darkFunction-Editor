package dfEditor;

import java.awt.Rectangle;
import java.awt.Point;
import java.awt.geom.*;

/**
 *
 * @author s4m20
 */
public class MathUtil
{
    public static boolean rectCollide(final Rectangle a, final Rectangle b)
    {
        if (    a.x > b.x + b.width
            ||  a.y > b.y + b.height
            ||  a.x + a.width < b.x
            ||  a.y + a.height < b.y)
        {
            return false;
        }
        return true;
    }

    public static boolean pointRectCollide(final Point p, final Rectangle r)
    {
        if (   p.x < r.x
            || p.y < r.y
            || p.x > r.x + r.width
            || p.y > r.y + r.height )
        {
            return false;
        }
        return true;
    }
    
    public static Point rotatePoint2D(final Point aPoint, final float aDeg)
    {        
        double a = Math.toRadians(aDeg);
        Point p = new Point();
        p.x = (int)((aPoint.x * Math.cos(a)) - (aPoint.y * Math.sin(a)));
        p.y = (int)((aPoint.y * Math.cos(a)) + (aPoint.x * Math.sin(a)));           

        return p;
    }    

    public static Point multiplyPoint(final Point aVec, float aMult)
    {
        return new Point ( (int)(aVec.x * aMult), (int)(aVec.y * aMult));
    }

    public static Point dividePoint(final Point aVec, float aDiv)
    {
        return new Point ( (int)(aVec.x / aDiv), (int)(aVec.y / aDiv));
    }
    
}