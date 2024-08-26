package com.company.chainOfResponsibility;

class ManagerSupport extends SupportHandler {
    @Override
    protected boolean canHandle(String request) {
        return request.contains("manager");
    }

    @Override
    protected void processRequest(String request) {
        System.out.println("Manager handling request: " + request);
    }
}
