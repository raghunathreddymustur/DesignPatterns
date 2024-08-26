package com.company.chainOfResponsibility;

class BasicSupport extends SupportHandler {
    @Override
    protected boolean canHandle(String request) {
        return request.contains("basic");
    }

    @Override
    protected void processRequest(String request) {
        System.out.println("Basic support handling request: " + request);
    }
}
