public class ServerWOFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ServerFacade serverFacade = new ServerFacade(scheduleServer);

        // เริ่ม Server
        serverFacade.startServer();

        // หยุด Server
        serverFacade.stopServer();
    }
}