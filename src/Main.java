import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        tehnicque random = null;
        try {
            if (r.nextBoolean())
                random = new player() {
                    @Override
                    public boolean canWork() {
                        return super.canWork();
                    }


                    @Override
                    public boolean switchoff() {
                        super.switchoff();
                        return false;
                    }

                    @Override
                    public boolean canWrite() {
                        return false;
                    }

                    @Override
                    public int year() {
                        return 5;
                    }
                };
            else random = new videoplayer();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Техника ");
            System.out.println(random.canWork() ? "Tehnica zhymys zhasaidy" : " zhymys zhasamaidy");
            System.out.println(random.switchoff() ? "Ozhip tyr" : "Kosylyp tur");
            System.out.println(random.canWrite());
            System.out.println(random.year() + " zhyl zhymys zhasady");

        }
    }







