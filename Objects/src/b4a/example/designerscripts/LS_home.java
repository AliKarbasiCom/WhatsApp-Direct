package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_home{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[home/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="Panel1.SetLeftAndRight(0%x,100%x)"[home/General script]
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 4;BA.debugLine="Panel1.Top=0%y"[home/General script]
views.get("panel1").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="Label1.SetLeftAndRight(0%x,100%x)"[home/General script]
views.get("label1").vw.setLeft((int)((0d / 100 * width)));
views.get("label1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="Label2.SetLeftAndRight(0%x,100%x)"[home/General script]
views.get("label2").vw.setLeft((int)((0d / 100 * width)));
views.get("label2").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 9;BA.debugLine="Label2.VerticalCenter=50%y"[home/General script]
views.get("label2").vw.setTop((int)((50d / 100 * height) - (views.get("label2").vw.getHeight() / 2)));
//BA.debugLineNum = 11;BA.debugLine="EditText1.SetLeftAndRight(20%x,80%x)"[home/General script]
views.get("edittext1").vw.setLeft((int)((20d / 100 * width)));
views.get("edittext1").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 12;BA.debugLine="EditText1.Top = Label2.Bottom + 10dip"[home/General script]
views.get("edittext1").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 14;BA.debugLine="Button1.SetLeftAndRight(30%x,70%x)"[home/General script]
views.get("button1").vw.setLeft((int)((30d / 100 * width)));
views.get("button1").vw.setWidth((int)((70d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 15;BA.debugLine="Button1.Top = EditText1.Bottom + 10dip"[home/General script]
views.get("button1").vw.setTop((int)((views.get("edittext1").vw.getTop() + views.get("edittext1").vw.getHeight())+(10d * scale)));

}
}