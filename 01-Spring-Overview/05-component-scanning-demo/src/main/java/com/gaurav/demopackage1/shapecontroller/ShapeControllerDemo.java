package com.gaurav.demopackage1.shapecontroller;

import com.gaurav.demopackage1.demopackage2.Triangle;
import com.gaurav.demopackage3.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeControllerDemo {
   private Rectangle rectangle;
   private Triangle triangle;

    @Autowired
    public ShapeControllerDemo(Triangle triangle, Rectangle rectangle) {
        this.triangle = triangle;
        this.rectangle = rectangle;
    }

    @GetMapping("/get-triangle-property")
    public String getTriangleProperty(){
        return triangle.getProperty();
    }

    @GetMapping("/get-rectangle-property")
    public String getRectangleProperty(){
        return rectangle.getProperty();
    }
}
