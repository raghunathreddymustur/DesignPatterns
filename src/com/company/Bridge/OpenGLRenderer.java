package com.company.Bridge;

public class OpenGLRenderer implements Renderer {
    @Override
    public void renderCircle() {
        System.out.println("Drawing Circle using OpenGL");
    }

    @Override
    public void renderSquare() {
        System.out.println("Drawing Square using OpenGL");
    }
}
