package com.company.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler basic = new BasicSupport();
        SupportHandler supervisor = new SupervisorSupport();
        SupportHandler manager = new ManagerSupport();

        basic.setNextHandler(supervisor);
        supervisor.setNextHandler(manager);

        basic.handleRequest("Request for supervisor");
    }
}
