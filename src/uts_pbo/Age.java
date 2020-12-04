package uts_pbo;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

class Age {
    private int yearBirth, yearNow;
    private String red;

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    public String tandanyaKamu(int umur){
        if (umur >= 0 && umur <= 5){
            red = "LAGI LUCU-LUCUNYA";
        }
        else if (umur > 5 && umur <= 10){
            red = "MASIH ANAK-ANAK";
        }
        else if (umur > 10 && umur <= 13){
            red = "MASIH REMADJA";
        }
        else if (umur > 13 && umur <= 19){
            red = "ALAY";
        }
        else if (umur > 19 && umur <= 29){
            red = "LAGI GALAU NYARI JODOH";
        }
        else if (umur > 29 && umur <= 35){
            red = "LAGI SIBUK NYARI UANG";
        }
        else if (umur > 35 && umur <= 150){
            red = "SUDAH TUA";
        }
        else if (umur < 0 || umur > 150){
            red = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        return red;
    }
}
