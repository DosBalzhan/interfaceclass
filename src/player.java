public abstract class player implements tehnicque {
    // плэйер абстракт класына генерация аркылы оверайд конструкторын шыгару
    @Override
    public boolean canWork(){
        return true;  // жумыс жасап турса true кайтару
    }
    @Override
    public boolean switchoff(){
        System.out.println("Ошип тур");
        return true; // плэйер ошип турса true консольга кайтарылады
    }

}
