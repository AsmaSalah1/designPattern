
package com.mycompany.designpetternproject1;

public class LinuxShapeFactory extends ShapeFactory {

    @Override
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("square")) {
            return new SquareLinux();
//            return linuxSingleton.getShapeInstance("square");

        } else if (type.equalsIgnoreCase("rectangle")) {
            return new RectangleLinux();
//            return FactorySingleton.getShapeInstance("rectangle", this);

        }
        return null;
    }
}
