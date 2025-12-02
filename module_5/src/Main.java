public class Main {

    public static void main(String[] args) {

        Player zxen0on = new Player(244, "ZXen0on", 162);
        Player blair = new Player(216, "Blair", 120);
        Player yukio = new Player(62, "Yukio", 37);
        Player mozu = new Player(3231, "Mozu", 612);
        Player dungeonmaster = new Player(1123, "DungeonMaster", 512);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(zxen0on.getUserName(), zxen0on);
        hashtable.put(blair.getUserName(), blair);
        hashtable.put(yukio.getUserName(), yukio);
        hashtable.put(mozu.getUserName(), mozu);
        hashtable.put(dungeonmaster.getUserName(), dungeonmaster);

        //hashtable.printHashtable();
        System.out.println(hashtable.get("DungeonMaster"));
    }
}
