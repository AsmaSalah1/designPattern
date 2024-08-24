package com.mycompany.designpetternproject1;

public class DesignPetternProject1 {

    public static void main(String[] args) {
          Shape windowsSquare =WindowsSingelton.getShapeInstance("square");
        windowsSquare.draw();
        System.out.println(windowsSquare.getDescription());
  // تزيين WindowsSquare بإضافة لون
        Shape windowsSquareWithColor = new ColorFillDecorator(windowsSquare, "Red");
        windowsSquareWithColor.draw();
        System.out.println(windowsSquareWithColor.getDescription());
          // إنشاء مثيل LinuxSquare باستخدام Singleton
        Shape linuxSquare = linuxSingleton.getShapeInstance("square");
        linuxSquare.draw();
        System.out.println(linuxSquare.getDescription());

        // تزيين LinuxSquare بإضافة لون
        Shape linuxSquareWithColor = new ColorFillDecorator(linuxSquare, "Yellow");
        linuxSquareWithColor.draw();
        System.out.println(linuxSquareWithColor.getDescription());

        // إنشاء مثيل WindowsRectangle باستخدام Singleton
        Shape windowsRectangle = WindowsSingelton.getShapeInstance("rectangle");
        windowsRectangle.draw();
        System.out.println(windowsRectangle.getDescription());

        // تزيين WindowsRectangle بإضافة لون
        Shape windowsRectangleWithColor = new ColorFillDecorator(windowsRectangle, "Blue");
        windowsRectangleWithColor.draw();
        System.out.println(windowsRectangleWithColor.getDescription());

        // إنشاء مثيل LinuxRectangle باستخدام Singleton
        Shape linuxRectangle = linuxSingleton.getShapeInstance("rectangle");
        linuxRectangle.draw();
        System.out.println(linuxRectangle.getDescription());

        // تزيين LinuxRectangle بإضافة لون
        Shape linuxRectangleWithColor = new ColorFillDecorator(linuxRectangle, "Green");
        linuxRectangleWithColor.draw();
        System.out.println(linuxRectangleWithColor.getDescription());
      
        
        
        
        
//     ShapeFactory windowsFactory = new WindowsShapeFactory();
//     Shape windowsSquare = windowsFactory.createShape("square");
//     windowsSquare = new ColorFillDecorator(windowsSquare, "Yellow");
//     windowsSquare = new BorderColorDecorator(windowsSquare, "2");
//     windowsSquare.draw();
//     System.out.println(windowsSquare.getDescription());
//
//     ShapeFactory linuxFactory = new LinuxShapeFactory();
//     Shape linuxRectangle = linuxFactory.createShape("rectangle");
//     linuxRectangle = new BorderColorDecorator(linuxRectangle, "Brown");
//     linuxRectangle = new BorderColorDecorator(linuxRectangle, "4");
//     linuxRectangle.draw();
//     System.out.println(linuxRectangle.getDescription());


//
//     // إنشاء مصنع لنظام Windows
//        ShapeFactory windowsFactory = new WindowsShapeFactory();
//
//        // إنشاء مربع ومستطيل لنظام Windows باستخدام FactorySingleton
//        Shape windowsSquare = FactorySingleton.getShapeInstance("square", windowsFactory);
//        Shape windowsRectangle = FactorySingleton.getShapeInstance("rectangle", windowsFactory);
////windowsSquare.name="asma";
////        Shape windowsSquare1 = FactorySingleton.getShapeInstance("square", windowsFactory);
//
//        // عرض الوصف ورسم الأشكال لنظام Windows
//        System.out.println("Windows Square:");
//        windowsSquare.getDescription();
//        windowsSquare.draw();
////        windowsSquare1.getDescription();
//
//        System.out.println("\nWindows Rectangle:");
//              System.out.println( windowsRectangle.getDescription());
//
//              windowsRectangle.getDescription();
//        windowsRectangle.draw();
//
//        // إنشاء مصنع لنظام Linux
//        ShapeFactory linuxFactory = new LinuxShapeFactory();
//
//        // إنشاء مربع ومستطيل لنظام Linux باستخدام FactorySingleton
//        Shape linuxSquare = FactorySingleton.getShapeInstance("square", linuxFactory);
//        Shape linuxRectangle = FactorySingleton.getShapeInstance("rectangle", linuxFactory);
//
//        // عرض الوصف ورسم الأشكال لنظام Linux
//        System.out.println("\nLinux Square:");
//        linuxSquare.getDescription();
//        linuxSquare.draw();
//
//        System.out.println("\nLinux Rectangle:");
//        linuxRectangle.getDescription();
//        linuxRectangle.draw();
    }
}
