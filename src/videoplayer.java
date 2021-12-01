public class videoplayer implements tehnicque {
    // класс видеоплейер реализует интерфейс техника

    // Кез келген интерфейсті жүзеге асыратын класс сол интерфейстің барлық әдістерін жүзеге асыруы керек,
    // әйтпесе класс абстрактілі деп жариялануы керек.
    // видеоплэйер техника интерфейс класынан имплемент жасалынады
    @Override
    public boolean canWork() {
        return true;
    }
   // алдынгы кластарда айтылгандай ис-арекет орындалса тру фолс кайтарылады
    @Override
    public boolean switchoff() {
        return false;
    }

    @Override
   public boolean canWrite() {
        System.out.println("Zhazy basa almaidy");
        return false;
    }
   @Override
    public int year(){
    return 5;
    }
}
