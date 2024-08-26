package com.company.chainOfResponsibility;

class SupervisorSupport extends SupportHandler {
    @Override
    protected boolean canHandle(String request) {
        return request.contains("supervisor");
    }

    @Override
    protected void processRequest(String request) {
        System.out.println("Supervisor handling request: " + request);
    }
}
