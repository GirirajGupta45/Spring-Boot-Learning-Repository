package com.gaurav.dependency_injection_demo.setter_injection_controller;

import com.gaurav.dependency_injection_demo.setter_injection.Rectangle;
import com.gaurav.dependency_injection_demo.setter_injection.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shape")
public class ShapeController {
private Triangle triangle;
private Rectangle rectangle;

@Autowired
    public void setTriangle(Triangle t){
    triangle=t;
}

@Autowired
    public void setRectangle(Rectangle r){
    rectangle=r;
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
