/*  NAMA FILE       : MainTeman.java
    DESKRIPSI FILE  : Berisi main driver class teman
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 5 Mei 2026
*/

public class MainTeman {
    public static void main(String[] args) {
        Teman friend = new Teman();

        friend.addNama("Rivaldi");
        friend.addNama("Buro");
        friend.addNama("Rivaldi");
        friend.addNama("Umar");

        friend.showTeman();

        System.out.println();
        System.out.println("Jumlah elemen : " + friend.getNbelm());
        System.out.println("Apakah Buro member? " + friend.isMember("Buro"));
        System.out.println("Jumlah nama Rivaldi : " + friend.countNama("Rivaldi"));

        friend.gantiNama("Buro", "Doni");

        System.out.println();
        System.out.println("Setelah ganti nama:");
        friend.showTeman();

        friend.delNama("Rivaldi");

        System.out.println();
        System.out.println("Setelah hapus Rivaldi:");
        friend.showTeman();
    }
}