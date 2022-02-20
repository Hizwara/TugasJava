import javax.swing.JOptionPane;

public class JavaLibs5026211122 {
  public static void main(String[] args) {
    int bil;
    double desimal;
    String question9 = "";
    String[] options = { "true", "false" };
    int introInt = JOptionPane.showOptionDialog(null, "Halo rek! berikut adalah program untuk mengetahui pendapat arek-arek semua tentang ITS","Selamat datang!", 0, 1, null, (Object[])options, options[0]);
    if (introInt != 0) {
      JOptionPane.showMessageDialog(null, "Sayang sekali, harap kembali jika anda merubah pikiran anda!", "Not OK", 0);
      System.exit(0);
    } 
    String question1 = (String)JOptionPane.showInputDialog(null, "Siapa nama anda?", "Question 1", 3, null, null, "String");
    question1 = question1.toUpperCase();
    String question2 = (String)JOptionPane.showInputDialog(null, "Berikan satu kata untuk ITS _.", "Question 2", 3, null, null, "String");
    question2 = question2.toUpperCase();
    String question3 = (String)JOptionPane.showInputDialog(null, "Dari departemen mana anda berasal?", "Question 3", 3, null, null, "String");
    question3 = question3.toUpperCase();
    String question4 = (String)JOptionPane.showInputDialog(null, "Pada tahun berapa diterima di ITS?", "Question 4", 3, null, null, "String");
    question4 = question4.toUpperCase();
    String question5 = (String)JOptionPane.showInputDialog(null, "Bagaimana perasaanmu saat menjadi bagian dari kampus perjuangan ITS di tahun " + question4 + "?", "Question 5", 3, null, null, "String");
    question5 = question5.toUpperCase();
    String question6 = (String)JOptionPane.showInputDialog(null, "Apa yang kamu harapkan saat berkuliah di ITS?", "Question 6", 3, null, null, "String");
    question6 = question6.toUpperCase();
    String question7 = (String)JOptionPane.showInputDialog(null, "Jika harapanmu tadi " + question6 + "tercapai. Apakah kamu akan berkontribusi lagi di kampus perjuangan ITS?", "Question 7", 3, null, null, "String");
    question7 = question7.toUpperCase();
    String question8 = (String)JOptionPane.showInputDialog(null, "Satu kata yang mendeskripsikan anda", "Question 8", 3, null, null, "String");
    question8 = question8.toUpperCase();
    question9 = (String)JOptionPane.showInputDialog(null, "Berapa lama kamu berencana untuk berkuliah di ITS?", "Question 9", 3, null, null, "int");
    bil = Integer.parseInt(question9);
    String question10 = (String)JOptionPane.showInputDialog(null, "Berikan skala untuk ITS dari angka 0 dan 1?", "Question 10", 3, null, null, "double");
    desimal = Double.parseDouble(question10);
    JOptionPane.showMessageDialog(null, "Matur Suwun " + question1 + ".  Selamat menempuh perkuliahan di ITS semoga sukses selalu", "Matur Suwun!", 1);
    String story = " Matur Suwun mas/mbak " +question1+ "!  sudah mengisi pertanyaan tadi dengan penilaian" +question10+ ".  Saya berharap mas/mbk " +question1+ "yang" +question8+ ".Saat menjadi maba merasa" +question5+ "bisa lulus dari ITS selama" +question9+ "dari angkatan" +question4+ "departemen" +question3+ "sukses selalu dan harapannya" +question6+ "dapat terwujud di kampus ITS yang "+question2+ "dan juga ditunggu kontribusinya berupa" +question7+ "di kampus ITS yang" +question2+ "ini ya! \n\n\n" ;
    JOptionPane.showMessageDialog(null, story, "Kesan, Pesan dan Harapan di ITS!", 1);
  }
}