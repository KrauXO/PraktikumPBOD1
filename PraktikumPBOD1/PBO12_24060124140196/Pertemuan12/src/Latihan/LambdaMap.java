/* Nama File    : LambdaMap.java */
/* Deskripsi    : Berisi implementasi Lambda */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 26 Mei 2026*/

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122140123", "Adi");
        mahasiswaMap.put("24060122140124", "Bambang");
        mahasiswaMap.put("24060122140125", "Cici");
        mahasiswaMap.put("24060122140126", "Didi");
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}