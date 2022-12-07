import com.example.prototype.Color;
import com.example.prototype.cache.ColorCache;

public class Main {
    public static void main(String[] args) {
        ColorCache.loadCache();

        ColorCache.getColor("White").addColor();
        ColorCache.getColor("Black").addColor();
        ColorCache.getColor("Green").addColor();
        ColorCache.getColor("Black").addColor();
        ColorCache.getColor("Green").addColor();
        ColorCache.getColor("White").addColor();
    }
}