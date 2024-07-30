package com.company.Bridge;

public class DirectXRenderer implements Renderer {
    @Override
    public void renderCircle() {
        System.out.println("Drawing Circle using DirectX");
    }

    @Override
    public void renderSquare() {
        System.out.println("Drawing Square using DirectX");
    }
}
