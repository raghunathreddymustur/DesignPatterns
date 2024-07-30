package com.company.Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Renderer opengl = new OpenGLRenderer();
        Renderer directx = new DirectXRenderer();

        Shape circle = new Circle(opengl);
        Shape square = new Square(directx);

        circle.draw();  // Output: Drawing Circle using OpenGL
        square.draw();  // Output: Drawing Square using DirectX

        // Switching renderer at runtime
        circle = new Circle(directx);
        circle.draw();  // Output: Drawing Circle using DirectX
    }
}

